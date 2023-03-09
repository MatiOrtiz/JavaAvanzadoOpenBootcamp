public class CocheElectrico extends Coche{

    private boolean bateria, combustible;
    
    public CocheElectrico(String tipo) {
        super(tipo);
        bateria= true;
        combustible= false;
    }

    public boolean getBateria() {
        return bateria;
    }

    public boolean getCombustible() {
        return combustible;
    }

}
