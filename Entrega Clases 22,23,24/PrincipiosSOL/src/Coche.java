public class Coche {
    
    private int velocidad;
    private boolean abierto;

    public Coche(boolean abierto) {
        velocidad= 0;
        this.abierto= abierto;
    }

    public void acelerar() {
        velocidad++;
    }

    public void frenar() {
        velocidad--;
    }

    public void abrirPuertas() {
        if(!abierto)
            abierto= true;
    }

    public void cerrarPuertas() {
        if(abierto)
            abierto= false;
    }

    public boolean getAbierto() {
        return abierto;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
}
