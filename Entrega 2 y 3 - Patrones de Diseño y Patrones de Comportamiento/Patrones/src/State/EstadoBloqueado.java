package State;

public class EstadoBloqueado extends Estado{
    
    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    public String desbloquearTelefono() {
        telefono.cambiarEstado(new EstadoDesbloqueado(telefono));
        return "Celular desbloqueado.";
    }

    public String abrirConfiguracion() {
        return "La configuración está bloqueada, desbloquea el celular antes.";
    }

    public String setProperty1() {
        return "No se puede cambiar la propiedad, desbloquea el celular y abre la configuración antes.";
    }

    public String setProperty2() {
        return "No se puede cambiar la propiedad, desbloquea el celular y abre la configuración antes.";
    }
}
