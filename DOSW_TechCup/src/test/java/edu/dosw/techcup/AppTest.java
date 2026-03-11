package edu.dosw.techcup;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



import java.time.LocalDate;

/**
 * Unit test for simple App.
 */
public class AppTest{
    /**
     * Create the test case
     *
     */
    public AppTest()
    {

    }
    /**
     * Rigourous Test :-)
     */
    @Test
    void testUserCreation()
    {
        PerfilDeportivo pd = new PerfilDeportivo(Posicion.PORTERO, "1");
        Usuario u = new Usuario("juan.roa-h@mail.escuelaing.edu.co","passwordcifrado123","Juan David", "Roa Hernandez", Rol.ESTUDIANTE, LocalDate.of(2005,3,22), Programa.INGENIERIA_SISTEMAS);
        u.setIdentifiacion(TipoId.CC, "123456789");
        u.setPerfilDeportivo(pd);
        assertEquals("Roa Hernandez", u.getApellidos());
        assertEquals("Juan David", u.getNombres());
        assertEquals("juan.roa-h@mail.escuelaing.edu.co", u.getCorreo());
        assertEquals("123456789", u.getIdentificacion());
        assertEquals(LocalDate.of(2005,3,22), u.getFechaNacimiento());
    }
    @Test
    void testArchivoCreation(){
        byte[] bytes = new byte[] {1,2,3,4,5,6,7,8,9,10,11,12};
        LocalDate date = LocalDate.now();
        Archivo a = new Archivo(bytes, "application/pdf", date );
        assertEquals(bytes, a.getBytes());
        assertEquals("application/pdf", a.getMime());
        assertEquals(date, a.getUltimaMod());
    }
    @Test
    void
}
