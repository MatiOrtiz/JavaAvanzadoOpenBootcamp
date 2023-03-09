public class CocheHibrido extends Coche {
    private boolean combustible, bateria;

    public CocheHibrido(String tipo) {
        super(tipo);
        bateria= true;
        combustible= true;
    }

    public boolean getBateria() {
        return bateria;
    }

    public boolean getCombustible() {
        return combustible;
    }
    
}
