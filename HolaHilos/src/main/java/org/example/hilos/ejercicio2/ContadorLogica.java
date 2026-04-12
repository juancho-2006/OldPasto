package org.example.hilos.ejercicio2;

public class ContadorLogica implements Runnable {

    private int segundos = 0;
    private boolean corriendo = true;
    private Runnable alCambiar; //Callback para

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public boolean isCorriendo() {
        return corriendo;
    }

    public void setCorriendo(boolean corriendo) {
        this.corriendo = corriendo;
    }

    public Runnable getAlCambiar() {
        return alCambiar;
    }

    public void setAlCambiar(Runnable alCambiar) {
        this.alCambiar = alCambiar;
    }

    public ContadorLogica(Runnable accion){
        this.alCambiar = accion;
    }

    @Override
    public void run(){
        while (corriendo){
            segundos++;
            alCambiar.run();
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }

    }
}
