

public class EjemploProductorConsumidor {

    public static void main(String[] args) {
        
        //Ventana miVentana = new Ventana();
	    //miVentana.setVisible(true);
        
        Buffer b = new Buffer(5);
        Productor p = new Productor(b);
        Consumidor c = new Consumidor(b);
        //Consumidor c2 = new Consumidor(b);
        
        p.start();
        c.start();
        //c2.start();
    }
}