

public class EjemploProductorConsumidor {
    static Consumidor c;
    public static void main(String[] args) {
        
        //Ventana miVentana = new Ventana();
	    //miVentana.setVisible(true);
        Buffer b = new Buffer(5);
        Productor p = new Productor(b);
        //Consumidor c = new Consumidor(b);
        c = new Consumidor(b); 
        //Consumidor c2 = new Consumidor(b);
        p.start();
       
        
        
        //c2.start();
    }
    public static void inicio(){
        System.out.println(" ");
        System.out.println("DESPIERTA EL CONSUMIDOR");
        System.out.println(" ");
        c.start();
    }
}