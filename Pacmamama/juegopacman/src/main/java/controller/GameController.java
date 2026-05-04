package main.java.controller;

public class GameController implements Runnable{

    private static final int FPS = 60;

    //Los  nanos por frama
    private static final long NANOS_PER_FRAME = 1_000_000_000_000L / FPS;

    //Cuantos frames se muestran en este tiempo
    private static final int FRAMES_ANIMATION = 0;

    //Total puntos, salen del total de 2 y 3 enla gran matriz patrixia
    private static final int TOTAL_POINTS = 185;

    @Override
    public void run() {

    }
}
