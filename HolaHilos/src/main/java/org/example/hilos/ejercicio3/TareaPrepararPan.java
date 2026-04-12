package org.example.hilos.ejercicio3;

public class TareaPrepararPan implements Runnable{
    private String tipoPan;

    public TareaPrepararPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    @Override
    public void run() {
        System.out.println("Empezando a preparar: " + tipoPan);
        try{
            //Simular tiempo que tarda la maquina
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("El pan " + tipoPan + " está listo!");

    }
}

