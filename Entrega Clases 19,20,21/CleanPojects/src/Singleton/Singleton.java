package Singleton;

public class Singleton {
    
    //Atributos
    private static Singleton singleton;
    private int cont;

    /**
     * Crea una instancia de tipo Singleton
     */
    private Singleton(){};

    //Metodos
    /**
     * Consulta la instancia del atributo singleton
     * @return una nueva instancia de tipo Singleton si el atributo es nulo, 
     * sino retorna el atributo
     */
    public static Singleton getInstance() {
        if(singleton==null)
            return new Singleton();
        return singleton;
    }

    /**
     * Define el valor del atributo cont
     * @param cont valor entero a setearle al atributo cont
     */
    public void setCont(int cont) {
        this.cont= cont;
    }

    public int getCont() {
        return cont;
    }
    
}