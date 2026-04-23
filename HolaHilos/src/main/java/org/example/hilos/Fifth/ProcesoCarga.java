package org.example.hilos.Fifth;

public class ProcesoCarga implements Runnable {
    private int progreso = 0;
    private Runnable actualizar;

    public ProcesoCarga(Runnable actualizar) {
        this.actualizar = actualizar;
    }

    public int getProgreso() {
        return progreso;
    }

    @Override
    public void run() {
        while (progreso < 250){
            progreso++;
            actualizar.run();

            try{
                Thread.sleep((int)(Math.random()* 100));
            }catch(Exception e){
                System.err.println(Thread.currentThread().getName() + ": Error en procesoCarga.");
            }
        }
    }
}
