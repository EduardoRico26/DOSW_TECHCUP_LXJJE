package edu.dosw.techcup;

public interface RepositorioUsuario {
    Usuario findByEmail(String email);
}
