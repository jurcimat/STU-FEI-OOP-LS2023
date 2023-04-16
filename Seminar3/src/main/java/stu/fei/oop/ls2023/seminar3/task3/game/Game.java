package stu.fei.oop.ls2023.seminar3.task3.game;

import stu.fei.oop.ls2023.seminar3.task3.game.tiles.MineRevealedException;
import stu.fei.oop.ls2023.seminar3.task3.game.tiles.Move;
import stu.fei.oop.ls2023.seminar3.task3.util.KeyboardInput;

public class Game {

    private Board board;

    public Game() {
        this.board = new Board();
    }

    public void play() {
        try {
            while (!this.board.isBoardRevealed()) {
                drawBoard();
                this.board.reveal(getNextMove());
            }
        } catch (MineRevealedException e) {
            System.out.println("You've stepped on a mine!");
            drawBoard();
            return;

        }
        System.out.println("You have revealed the whole board!");
        drawBoard();

    }

    private void drawBoard() {
        System.out.println(this.board.draw());
    }


    private Move getNextMove() {
        char row = KeyboardInput.readChar(String.format("Enter row (A-%s)%n", (char) ('A' + Board.BOARD_SIZE - 1)));
        int col = KeyboardInput.readInt(String.format("Enter column (0-%d)%n", Board.BOARD_SIZE - 1));
        return new Move(col, row);
    }
}
