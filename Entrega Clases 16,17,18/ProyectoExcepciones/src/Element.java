
public class Element extends Object{
    
    Element[] array;
    
    public Element(int cant) {
        array= new Element[cant];
    }
    
    public Element getElement(int n) throws ArrayIndexOutOfBoundsException{
        if(n>=array.length)
            throw new ArrayIndexOutOfBoundsException("La posicion buscada no existe, te caiste del arreglo.");
        return array[n];
    }
}