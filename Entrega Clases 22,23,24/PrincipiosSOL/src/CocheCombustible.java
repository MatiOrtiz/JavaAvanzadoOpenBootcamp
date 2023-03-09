public class CocheCombustible extends Coche {
    
    private boolean combustible, bateria;

    public CocheCombustible(String tipo) {
        super(tipo);
        combustible= true;
        bateria= false;
    }

    public boolean getCombustible() {
        return combustible;
    }

    public boolean getBateria() {
        return bateria;
    }

}
