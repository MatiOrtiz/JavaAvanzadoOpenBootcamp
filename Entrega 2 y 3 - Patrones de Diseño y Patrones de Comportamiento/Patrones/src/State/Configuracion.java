package State;

public class Configuracion extends Estado {
    
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

    //--------------------Para el patrón state--------------------//

    public Configuracion(Telefono telefono) {
        super(telefono);
    }

    public String desbloquearTelefono() {
        return "El celular ya está desbloqueado.";
    }

    public String abrirConfiguracion() {
        telefono.cambiarEstado(new Configuracion(telefono));
        return "La configuración ya está abierta, puedes editar las propiedades.";
    }

    public String setProperty1() {
        return "La propiedad 1 ha sido cambiada.";
    }

    public String setProperty2() {
        return "La propiedad 2 ha sido cambiada.";
    }
    
}
