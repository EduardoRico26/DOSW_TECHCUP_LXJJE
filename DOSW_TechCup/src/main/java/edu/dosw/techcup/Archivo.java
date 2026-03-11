package edu.dosw.techcup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Archivo {
    private Long id;
    private byte[] bytes;
    private String mime;
    private LocalDate ultimaMod;
    public Archivo() {}
    public Archivo(byte[] bytes, String mime, LocalDate ultimaMod) {
        this.bytes = bytes;
        this.mime = mime;
        this.ultimaMod = ultimaMod;
    }
    public Archivo(byte[] bytes, String mime) {
        this.bytes = bytes;
        this.mime = mime;
        this.ultimaMod = LocalDate.now();
    }
    public LocalDate getUltimaMod() {
        return ultimaMod;
    }
    public byte[] getBytes() {
        return bytes;
    }
    public String getMime() {
        return mime;
    }
    public void setBytes(byte[] bytes, String mime) {
        this.bytes = bytes;
        this.mime = mime;
    }
}
