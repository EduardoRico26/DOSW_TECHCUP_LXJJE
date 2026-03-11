package edu.dosw.techcup;

public class PerfilDeportivo {
    private Long id;
    private Posicion posicionPredefinida;
    private String dorsalPredefinida;
    private Archivo fotoPerfil;
    public PerfilDeportivo() {}
    public PerfilDeportivo(Posicion posicionPredefinida, String dorsalPredefinida) {
        this.posicionPredefinida = posicionPredefinida;
        this.dorsalPredefinida = dorsalPredefinida;
    }
    public void setFotoPerfil(Archivo fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
    public Archivo getFotoPerfil() {
        return fotoPerfil;
    }
    public Posicion getPosicionPredefinida() {
        return posicionPredefinida;
    }
    public void setPosicionPredefinida(Posicion posicionPredefinida) {
        this.posicionPredefinida = posicionPredefinida;
    }
    public String getDorsalPredefinida() {
        return dorsalPredefinida;
    }
    public void setDorsalPredefinida(String dorsalPredefinida) {
        this.dorsalPredefinida = dorsalPredefinida;
    }
}
