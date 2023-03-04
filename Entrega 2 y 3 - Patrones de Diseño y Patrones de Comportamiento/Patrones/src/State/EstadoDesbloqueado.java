package State;

public class EstadoDesbloqueado extends Estado {
    
    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    public String desbloquearTelefono() {
        return "El celular ya está desbloqueado.";
    }

    public String abrirConfiguracion() {
        telefono.cambiarEstado(new Configuracion(telefono));
        return "Configuración abierta, puedes editar las propiedades.";
    }

    public String setProperty1() {
        return "Abre la configuración para poder cambiar la propiedad.";
    }

    public String setProperty2() {
        return "Abre la configuración para poder cambiar la propiedad.";
    }

}
