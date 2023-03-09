public class CocheElectrico extends Coche{

    private boolean bateria;
    
    public CocheElectrico(String tipo) {
        super(tipo);
        bateria= true;
    }

    public boolean getBateria() {
        return bateria;
    }

}
