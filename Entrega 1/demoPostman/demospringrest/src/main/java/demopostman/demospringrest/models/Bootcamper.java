package demopostman.demospringrest.models;

public class Bootcamper {
    private String nombre;
    private double valor;
   
    public Bootcamper(String nombre, double valor) {
        this.nombre= nombre;
        this.valor= valor;
    }
     
    public Bootcamper() {
        
    }
    
    public void setNombre(String nombre) {
        this.nombre= nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValor(double valor) {
        this.valor= valor;
    }

    public double getValor() {
        return valor;
    }
}
