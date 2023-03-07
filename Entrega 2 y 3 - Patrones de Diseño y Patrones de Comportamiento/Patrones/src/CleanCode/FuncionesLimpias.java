package CleanCode;

public class FuncionesLimpias {
    public static void main(String[] args) {
        
    }

    //Funcion 1
    /**Es corta y fácil de leer.
     *Tiene un nombre descriptivo que indica claramente su propósito.
     *Hace uso de una excepción para manejar el caso en que el radio sea inválido.
     *Usa una constante de la clase Math en lugar de un número mágico.
     *Retorna el resultado de forma explícita y clara.
     */
    public static double calcularAreaCirculo(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero.");
        }
        double area = Math.PI * radio * radio;
        return area;
    }

    //Funcion 2
    /**
     *Tiene un nombre descriptivo que indica claramente su propósito.
     *Hace uso de una excepción para manejar el caso en que la cadena sea nula.
     *Usa expresiones regulares para eliminar los espacios en blanco de la cadena.
     *Usa el método reverse de la clase StringBuilder para invertir la cadena de forma eficiente.
     *Usa el método equalsIgnoreCase para comparar las cadenas de forma que no importe si hay diferencias en mayúsculas y minúsculas. 
     */
    public static boolean esPalindromo(String cadena) {
        if (cadena == null) {
            throw new NullPointerException("La cadena no puede ser nula.");
        }
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "");
        String cadenaInvertida = new StringBuilder(cadenaSinEspacios).reverse().toString();
        return cadenaSinEspacios.equalsIgnoreCase(cadenaInvertida);
    }
}
