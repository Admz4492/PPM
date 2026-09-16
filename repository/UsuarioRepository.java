import java.util.List;

public interface UsuarioRepository {
    void guardar(Usuario usuario);
    Usuario buscarPorId(int id);
    List<Usuario> obtenerTodos();
    void eliminar(int id);
}
