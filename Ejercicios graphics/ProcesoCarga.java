package Hilos.Juego;

public class ProcesoCarga implements Runnable {

    private int progreso = 0;

    private Runnable actualizar;

    private int cont = 0;

    public ProcesoCarga(Runnable actualizar) {

        this.actualizar = actualizar;

    }

    @Override
    public void run() {

        while (progreso <= 100) {

            progreso += 1;

            cont += 1;

            actualizar.run();

            try {

                Thread.sleep((int) (Math.random() * 100));

            } catch (Exception e) {

                System.err.println(Thread.currentThread().getName() + ": Error en procesoCarga.");

            }

        }

    }

    public int getProgreso() {

        return progreso;

    }


}
