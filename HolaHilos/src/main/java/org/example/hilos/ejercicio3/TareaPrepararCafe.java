package org.example.hilos.ejercicio3;

public class TareaPrepararCafe implements Runnable{

    private String tipoCafe;

    public TareaPrepararCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public String getTipoCafe() {
        return tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    @Override
    public void run() {
        System.out.println("Empezando a preparar: " + tipoCafe);
        try{
            //Simular tiempo que tara la maquina
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Listo el cafe: " + tipoCafe + "!");

    }
}
