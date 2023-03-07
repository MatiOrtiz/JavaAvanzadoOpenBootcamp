import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Probando ArithmeticException...");
        try{
            double resultado= division(4, 0);
            System.out.println("El resultado de la division es: " + resultado);
        } catch(ArithmeticException e) {e.printStackTrace();}
        
        
        System.out.println("Probando ArrayIndexOutOfBoundsException...");
        Element arreglo= new Element(6);
        try{
            Element elemento= arreglo.getElement(9);
            System.out.println("El elemento del arreglo es " + elemento);
        }catch(ArrayIndexOutOfBoundsException e){e.printStackTrace();};
        

        System.out.println("Probando FileNotFoundException...");
        String rutaArchivo = "ruta/del/archivo.txt";
        try {
            BuscadorArchivos.buscarArchivo(rutaArchivo);
        } catch (FileNotFoundException e) {e.printStackTrace();}
    }

    public static double division(int num1, int num2) throws ArithmeticException {
        if(num2==0)
            throw new ArithmeticException("No se puede dividir por cero.");
        return num1 / num2;
    }

}
