public class Main {
    public static void main(String[] args) throws Exception {
        
        Coche coche= new CocheElectrico("electrico");
        boolean bateria= coche.getBateria();
        boolean combustible= coche.getCombustible();
        System.out.println("El coche tiene bateria: " + bateria);
        System.out.println("El coche tiene combustible: " + combustible);
    }
    
}
