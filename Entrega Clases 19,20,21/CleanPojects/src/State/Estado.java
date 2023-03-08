package State;

public abstract class Estado {

    public Telefono telefono;
    
    public Estado (){};

    public Estado(Telefono telefono) {
        this.telefono= telefono;
    }

    public abstract String desbloquearTelefono();
    public abstract String abrirConfiguracion();
    public abstract String setProperty1();
    public abstract String setProperty2();

}
