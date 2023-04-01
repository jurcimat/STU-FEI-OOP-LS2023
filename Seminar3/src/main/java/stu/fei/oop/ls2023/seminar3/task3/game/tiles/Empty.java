package stu.fei.oop.ls2023.seminar3.task3.game.tiles;

import java.util.ArrayList;
import java.util.List;

public class Empty extends Tile {

    private int nearbyMines;
    private List<Tile> neighbors;

    public Empty() {
        this.nearbyMines = 0;
        this.neighbors = new ArrayList<>();
    }

    @Override
    public void reveal() throws MineRevealedException {
        boolean wasHidden = !this.isRevealed();
        super.reveal();
        if (this.nearbyMines == 0 && wasHidden) {
            for (Tile t : this.neighbors) {
                t.reveal();
            }
        }
    }

    @Override
    protected String drawRevealed() {
        if (nearbyMines == 0) {
            return ".";
        }
        return nearbyMines + "";
    }

    public void addNeighbors(List<Tile> neighbors) {
        this.neighbors.addAll(neighbors);
        neighbors.forEach(tile -> {
            if (tile instanceof Mine) {
                this.nearbyMines++;
            }
        });
    }
}
