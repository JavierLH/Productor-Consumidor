


import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread {
    EjemploProductorConsumidor E = new EjemploProductorConsumidor(); 
    private Buffer buffer;
   

    public Consumidor(Buffer b) {
        this.buffer = b;
    }

    public void run() {
        int contC =0;
        while (true) {
            try { 
                char c = this.buffer.consumir();
                System.out.println("Un cliente toma la pizza de la estanteria");
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            contC = contC+1;
            if(contC == 5){
                System.out.println("Estantería Vacía");
                //EjemploProductorConsumidor.despertarProductor();  
                contC = 0; 
            }
        }
    }
}
