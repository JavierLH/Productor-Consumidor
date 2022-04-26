

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {
    
    private Buffer buffer;
    private final String letras = "123456789";

    public Productor(Buffer b){
        this.buffer = b;
    }
     
    public void run(){
        while(true){
            try {
                char c = letras.charAt((int) (Math.random() * letras.length()));
                    buffer.producir();
                //char c = letras.charAt((int) (Math.random() * letras.length()));
                buffer.producir();
                System.out.println("Se ingresa una pizza a la estanteria ");
                
                sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
