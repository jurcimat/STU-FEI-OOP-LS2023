package stu.fei.oop.ls2023.seminar3.task3.game.tiles;

public class Mine extends Tile{
    @Override
    protected String drawRevealed() {
        return "*";
    }

    @Override
    public void reveal() throws MineRevealedException{
        super.reveal();
        throw new MineRevealedException();

    }
}
