package Singleton;

public class Singleton {
    
    private static Singleton singleton;
    private int cont;

    private Singleton(){};

    public static Singleton getInstance() {
        if(singleton==null)
            return new Singleton();
        return singleton;
    }

    public void setCont(int cont) {
        this.cont= cont;
    }

    public int getCont() {
        return cont;
    }
    
}