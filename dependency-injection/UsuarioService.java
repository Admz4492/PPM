public class UsuarioService {
    private final Notificador notificador;

    public UsuarioService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void registrar(String nombre) {
        System.out.println("Registrando usuario: " + nombre);
        notificador.enviar("Usuario registrado: " + nombre);
    }
}
