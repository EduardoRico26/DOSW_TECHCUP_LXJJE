package edu.dosw.techcup;

import java.time.LocalDate;

public class Torneo {
    private Long id;
    private String nombreTorneo;
    private EstadoTorneo estadoTorneo;
    private Archivo reglamento;
    private LocalDate fechaCierreInscripciones;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Integer cantidadEquipos;
    private Float costo;
    private Usuario capitan;
    public Torneo() {}
}
