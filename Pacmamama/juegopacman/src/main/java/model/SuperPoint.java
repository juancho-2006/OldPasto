package main.java.model;

public class SuperPoint extends ObjectGame {
    public static final int VALUE = 10;

    public SuperPoint(int x, int y) {
        super(x, y, uploadImage("superpill.png"), SUPER_POINT);
    }
}
