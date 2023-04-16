package stu.fei.oop.ls2023.seminar3.task1;

public class Student {

    private int id;
    private String firstName;
    private String surname;
    private int age;

    public Student() {
        this.id = 99999;
        this.firstName = "UNKNOWN";
        this.surname = "UNKNOWN";
        this.age = 0;
    }

    public Student(int id) {
        this();
        this.id = id;
    }

    public Student(int id, String firstName) {
        this(id);
        this.firstName = firstName;
    }

    public Student(int id, String firstName, String surname) {
        this(id, firstName);
        this.surname = surname;
    }

    public Student(int id, String firstName, String surname, int age) {
        this(id, firstName, surname);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String name = String.format("%-10s %-10s", firstName, surname);
        String numbers = String.format("age: %-5sID: %s", age, id);
        return name + numbers;
    }

    public boolean isGreaterThan(String parameter, Student student) {

        return switch (parameter) {
            case "id" -> this.id > student.id;
            case "firstname" -> this.firstName.compareTo(student.firstName) > 0;
            case "surname" -> this.surname.compareTo(student.surname) > 0;
            case "age" -> this.age > student.age;
            default -> false;
        };
    }

    public boolean isLessThan(String parameter, Student student) {
        return switch (parameter) {
            case "id" -> this.id <= student.id;
            case "firstname" -> this.firstName.compareTo(student.firstName) <= 0;
            case "surname" -> this.surname.compareTo(student.surname) <= 0;
            case "age" -> this.age <= student.age;
            default -> false;
        };
    }
}

