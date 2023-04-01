package stu.fei.oop.ls2023.seminar3.task3.game.tiles;

public abstract class Tile {

    private boolean revealed;

    public Tile() {
        this.revealed = false;
    }

    public boolean isRevealed() {
        return revealed;
    }

    public String draw() {
        if (!revealed) {
            return "#";
        }
        return drawRevealed();
    }

    protected abstract String drawRevealed();

    public void reveal() throws MineRevealedException {
        this.revealed = true;
    }
}
