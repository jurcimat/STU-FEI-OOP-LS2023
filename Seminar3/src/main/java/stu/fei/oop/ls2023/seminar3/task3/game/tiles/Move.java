package stu.fei.oop.ls2023.seminar3.task3.game.tiles;

public class Move {

    public int x;
    public int y;

    public Move(int x, char row) {
        this.x = x;
        this.y = row - 'A';
    }
}
