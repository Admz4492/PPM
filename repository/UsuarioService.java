import java.util.List;

public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void registrar(Usuario usuario) {
        repository.guardar(usuario);
    }

    public Usuario consultar(int id) {
        return repository.buscarPorId(id);
    }

    public List<Usuario> listar() {
        return repository.obtenerTodos();
    }

    public void eliminar(int id) {
        repository.eliminar(id);
    }
}
