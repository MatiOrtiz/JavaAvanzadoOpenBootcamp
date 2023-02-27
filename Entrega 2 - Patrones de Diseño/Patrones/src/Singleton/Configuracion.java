package Singleton;

public class Configuracion {
    
    private static Configuracion instance;
    private String property1;
    private int property2;

    private Configuracion() {
        property1= "Default Value";
        property2= 0;
    }

    public static Configuracion getInstance() {
        if(instance==null)
            instance= new Configuracion();
        return instance;
    }

    public void setProperty1(String str) {
        property1= str;
    }

    public void setProperty2(int value) {
        property2= value;
    }

    public String getProperty1() {
        return property1;
    }

    public int getProperty2() {
        return property2;
    }
    
}
