public class Main {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorEmail();
        UsuarioService service = new UsuarioService(notificador);

        service.registrar("Anderson");

        System.out.println();

        notificador = new NotificadorSMS();
        service = new UsuarioService(notificador);
        service.registrar("Anderson");
    }
}
