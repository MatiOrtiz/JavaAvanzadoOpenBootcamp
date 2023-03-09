public class CocheCombustible extends Coche {
    
    private boolean combustible;

    public CocheCombustible(String tipo) {
        super(tipo);
        combustible= true;
    }

    public boolean getCombustible() {
        return combustible;
    }

}
