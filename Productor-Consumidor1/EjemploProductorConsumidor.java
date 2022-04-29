

public class EjemploProductorConsumidor {
    static Consumidor c;
    static Productor p; 
    public static void main(String[] args){
        
        //Ventana miVentana = new Ventana();
	    //miVentana.setVisible(true);
        Buffer b = new Buffer(5);
        //Productor p = new Productor(b);
        //Consumidor c = new Consumidor(b);
        c = new Consumidor(b);
        p = new Productor(b); 
        //Consumidor c2 = new Consumidor(b);
        p.start();
        //c2.start();
    }
    public static void despiertaConsumidor(){
        System.out.println(" ");
        System.out.println("DESPIERTA EL CONSUMIDOR");
        System.out.println(" ");
        System.out.println("SE DUERME EL PRODUCTOR");
        c.start();
        try {  
            p.sleep(9000);
            System.out.println("despierta el productor");  
        } catch (Exception e) {
            //TODO: handle exception
        } 
        
    }
    /*
    public static void despertarProductor(){
        System.out.println(" ");
        System.out.println("DESPIERTA EL PRODUCTOR");
        p.start();
    }*/
}