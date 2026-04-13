package Hilos;

public class TareaPrepararCafe implements Runnable {

    private String tipoCafe;

    public TareaPrepararCafe(String tipoCafe) {

        this.tipoCafe = tipoCafe;

    }

    @Override
    public void run() {

        System.out.print("Empezando a preparar: " + tipoCafe);

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        System.out.print("!Listo el csfe: " + tipoCafe + "¡");

    }


}
