package State;

public class EstadoConfiguracionAbierta extends Estado {
    
    public EstadoConfiguracionAbierta(Telefono telefono) {
        super(telefono);
    }

    public String desbloquearTelefono() {
        return "El celular ya está desbloqueado.";
    }

    public String abrirConfiguracion() {
        telefono.cambiarEstado(new Configuracion(telefono));
        return "Configuración abierta, puedes editar las propiedades.";
    }

    Estado estadoAux= new Configuracion(telefono);

    public String setProperty1() {
        telefono.cambiarEstado(estadoAux);
        return "La propiedad 1 se está modificando.";
    }

    public String setProperty2() {
        telefono.cambiarEstado(estadoAux);
        return "La propiedad 2 se está modificando.";
    }
}
