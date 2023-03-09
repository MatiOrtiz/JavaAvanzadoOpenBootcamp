public abstract class Coche {
    
    //Atributos//
    private int velocidad;
    private String tipo;

    //Constructor//
    public Coche(String tipo) {
        velocidad= 0;
        this.tipo= tipo;
    }

    //Metodos//
    public void acelerar() {
        velocidad++;
    }

    public void frenar() {
        velocidad--;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract boolean getBateria();
    public abstract boolean getCombustible();
}
