package edu.dosw.techcup;

public class ServicioUsuario {

    private RepositorioUsuario repositorioUsuario;

    public ServicioUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }
    public ServicioUsuario(){}
    public Usuario buscarUsuarioporEmail(String correo) {
        Usuario u = repositorioUsuario.findByEmail(correo);
        return u;
    }

    public Usuario buscarUsuarioPorIdentificacion(String identificacion) {
        Usuario u = null;
        return u;
    }
    public PerfilDeportivo buscarPerfilDeportivoPorUsuario(Usuario usuario) {
        PerfilDeportivo perfilDeportivo = null;
        return perfilDeportivo;
    }
    public PerfilDeportivo buscarPerfilDeportivoPorUsuario(String correo) {
        PerfilDeportivo perfilDeportivo = null;
        return perfilDeportivo;
    }

    public Equipo buscarEquipoUsuario(Long id){
        Equipo e = null;
        return e;
    }
    public Equipo buscarEquipoUsuario(String correo){
        Equipo e = null;
        return e;
    }


}
