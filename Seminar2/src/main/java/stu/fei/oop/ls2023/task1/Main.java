package stu.fei.oop.ls2023.task1;

import java.util.Scanner;

public class Main {
    public static int halfMonthDivider(int day, int halfMonthDay, int zodiac) {
        if (day <= halfMonthDay) {
            return zodiac;
        } else {
            if (zodiac == 11) {
                return 0;
            }
            return zodiac + 1;
        }
    }

    public static int getZodiac(int day, int month) {
        switch (month) {
            case 1: {
                return halfMonthDivider(day,19, 0);
            }
            case 2: {
                return halfMonthDivider(day,19, 1);
            }
            case 3: {
                return halfMonthDivider(day,20, 2);
            }
            case 4: {
                return halfMonthDivider(day,20, 3);
            }
            case 5: {
                return halfMonthDivider(day,20, 4);
            }
            case 6: {
                return halfMonthDivider(day,20, 5);
            }
            case 7: {
                return halfMonthDivider(day,22, 6);
            }
            case 8: {
                return halfMonthDivider(day,22, 7);
            }
            case 9: {
                return halfMonthDivider(day,22, 8);
            }
            case 10: {
                return halfMonthDivider(day,22, 9);
            }
            case 11: {
                return halfMonthDivider(day,22, 10);
            }
            case 12: {
                return halfMonthDivider(day,21, 11);
            } default:
                return 12;

        }
    }


    public static void main(String[] args) {
        String[] zodiacs = new String[] { "Capricorn", "Aquarius",
                "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo",
                "Virgo", "Libra", "Scorpio", "Sagittarius" };
        System.out.println("Input day and month -> example: 21 1 (21.1.)\nInput 0 0 to end program!");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        while (day != 0) {
            System.out.println("Your zodiac sign is: " + zodiacs[getZodiac(day,month)]);
            day = scanner.nextInt();
            month = scanner.nextInt();
        }


    }
}
