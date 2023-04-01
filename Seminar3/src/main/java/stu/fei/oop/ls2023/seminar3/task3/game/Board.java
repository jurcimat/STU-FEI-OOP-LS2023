package stu.fei.oop.ls2023.seminar3.task3.game;

import stu.fei.oop.ls2023.seminar3.task3.game.tiles.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {

    public static final int BOARD_SIZE = 10;
    public static final int MINE_COUNT = 20;
    private final Tile[][] board;

    public Board() {
        this.board = new Tile[BOARD_SIZE][BOARD_SIZE];
        fillBoard();
    }

    private void fillBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                this.board[i][j] = new Empty();
            }
        }
        Random random = new Random();
        int minesLeft = MINE_COUNT;
        while (minesLeft > 0) {
            int mx = random.nextInt(BOARD_SIZE);
            int my = random.nextInt(BOARD_SIZE);
            if (this.board[my][mx] instanceof Empty) {
                this.board[my][mx] = new Mine();
                minesLeft--;
            }
        }
        this.addTileNeighbours();

    }

    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("  0123456789\n");
        for (int i = 0; i < BOARD_SIZE; i++) {
            builder.append((char) ('A' + i));
            builder.append(" ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                builder.append(this.board[i][j].draw());
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public void reveal(Move move) throws MineRevealedException {
        this.board[move.y][move.x].reveal();
    }

    public boolean isBoardRevealed() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (!this.board[i][j].isRevealed() && !(this.board[i][j] instanceof Mine)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void addTileNeighbours() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (this.board[i][j] instanceof Empty empty) {
                    List<Tile> neighbors = new ArrayList<>();
                    if (i - 1 >= 0) {
                        neighbors.add(this.board[i - 1][j]);
                        if (j - 1 >= 0) {
                            neighbors.add(this.board[i - 1][j - 1]);
                        }
                        if (j + 1 < BOARD_SIZE) {
                            neighbors.add(this.board[i - 1][j + 1]);
                        }
                    }
                    if (i + 1 < BOARD_SIZE) {
                        neighbors.add(this.board[i + 1][j]);
                        if (j - 1 >= 0) {
                            neighbors.add(this.board[i + 1][j - 1]);
                        }
                        if (j + 1 < BOARD_SIZE) {
                            neighbors.add(this.board[i + 1][j + 1]);
                        }
                    }
                    if (j - 1 >= 0) {
                        neighbors.add(this.board[i][j - 1]);
                    }
                    if (j + 1 < BOARD_SIZE) {
                        neighbors.add(this.board[i][j + 1]);
                    }
                    empty.addNeighbors(neighbors);
                }
            }
        }
    }
}
