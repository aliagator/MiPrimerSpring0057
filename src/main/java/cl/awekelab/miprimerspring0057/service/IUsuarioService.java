package cl.awekelab.miprimerspring0057.service;
import cl.awekelab.miprimerspring0057.entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    public Usuario crearUsuario(Usuario nuevoUsuario);
    public Usuario actualizarUsuario(int id);
    public List<Usuario> listarUsuario();

    public void eliminarUsuario(int id);

    Usuario listarUsuarioId(int id);
}
