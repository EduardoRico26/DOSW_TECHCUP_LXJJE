package edu.dosw.techcup;

import java.time.LocalDate;


public class Usuario {
    private Long id;
    private String correo;
    private String passwdCifrado;
    private String nombres;
    private String apellidos;
    private Rol rol;
    private LocalDate fechaNacimiento;
    private Genero genero;
    private Integer semestre;
    private TipoId tipoId;
    private String identificacion;
    private Programa programa;
    private PerfilDeportivo perfilDeportivo;
    public Usuario() {}
    public Usuario(String correo, String passwdCifrado, String nombres, String apellidos, Rol rol, LocalDate fechaNacimiento,Programa programa) {
        this.correo = correo;
        this.passwdCifrado = passwdCifrado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rol = rol;
        this.fechaNacimiento = fechaNacimiento;
        this.programa = programa;
    }
    public void setPassword(String passwdCifrado) {
        this.passwdCifrado = passwdCifrado;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public void setSemestre(Integer semestre) {
        if (!rol.equals(Rol.ESTUDIANTE)) {
            this.semestre = semestre;
        } else {
            throw new IllegalArgumentException("Solo los estudiantes tienen semestre.");
        }
    }
    public void setIdentifiacion(TipoId tipoId, String identificacion) {
        this.tipoId = tipoId;
        this.identificacion = identificacion;
    }
    public void setPerfilDeportivo(PerfilDeportivo perfilDeportivo) {
        this.perfilDeportivo = perfilDeportivo;
    }

    public String getCorreo() {
        return correo;
    }
    public String getPasswdCifrado() {
        return passwdCifrado;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public Rol getRol() {
        return rol;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public Genero getGenero() {
        return genero;
    }
    public Integer getSemestre() {
        return semestre;
    }
    public TipoId getTipoId() {
        return tipoId;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public Programa getPrograma() {
        return programa;
    }
    public PerfilDeportivo getPerfilDeportivo() {
        return perfilDeportivo;
    }
}
