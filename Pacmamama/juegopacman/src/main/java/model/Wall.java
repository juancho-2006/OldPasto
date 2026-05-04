package main.java.model;

public class Wall extends ObjectGame {
    public static final int VALUE = 10;

    public Wall(int x, int y) {
        super(x, y, uploadImage("wall.png"), WALL);
    }
}
