
public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Probando ArithmeticException...");
        System.out.println("El resultado de la division es: " + division(4, 0));
        
        System.out.println("Probando ArrayIndexOutOfBoundsException...");
        Element arreglo= new Element(6);
        Element elemento= arreglo.getElement(9);
        System.out.println("El elemento del arreglo es " + elemento);


    }

    public static double division(int num1, int num2) throws ArithmeticException {
        if(num2==0)
            throw new ArithmeticException("No se puede dividir por cero.");
        return num1 / num2;
    }

}
