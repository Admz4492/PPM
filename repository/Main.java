public class Main {
    public static void main(String[] args) {
        UsuarioRepository repository = new UsuarioRepositoryImpl();
        UsuarioService service = new UsuarioService(repository);

        service.registrar(new Usuario(1, "Anderson"));
        service.registrar(new Usuario(2, "Carlos"));

        System.out.println("Todos: " + service.listar());
        System.out.println("ID 1: " + service.consultar(1));

        service.eliminar(2);
        System.out.println("Después de eliminar: " + service.listar());
    }
}
