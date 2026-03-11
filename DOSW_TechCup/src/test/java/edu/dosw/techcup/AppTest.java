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
    void testBuscarUsuarioPorCorreo(){
        Usuario u = new Usuario("juan.roa-h@mail.escuelaing.edu.co","passwordcifrado123","Juan David", "Roa Hernandez", Rol.ESTUDIANTE, LocalDate.of(2005,3,22), Programa.INGENIERIA_SISTEMAS);
        ServicioUsuario su = new ServicioUsuario();
        //falta setear repo usuario
        Usuario busqueda = su.buscarUsuarioporEmail("juan.roa-h@mail.escuelaing.edu.co");
        assertEquals(u, busqueda);
    }
    @Test
    void testBuscarUsuarioPorIdentifiacion(){
        Usuario u = new Usuario("juan.roa-h@mail.escuelaing.edu.co","passwordcifrado123","Juan David", "Roa Hernandez", Rol.ESTUDIANTE, LocalDate.of(2005,3,22), Programa.INGENIERIA_SISTEMAS);
        u.setIdentifiacion(TipoId.CC, "123456789");
        ServicioUsuario su = new ServicioUsuario();
        //falta setear repo usuario
        Usuario busqueda = su.buscarUsuarioPorIdentificacion("123456789");
        assertEquals(u, busqueda);
    }
    @Test
    void testCrearPerfilDeportivo(){
        PerfilDeportivo pd = new PerfilDeportivo(Posicion.PORTERO, "1");
        assertEquals("1", pd.getDorsalPredefinida());
        assertEquals(Posicion.PORTERO, pd.getPosicionPredefinida());
    }
    @Test
    void testObtenerPerfilDeportivoPorCorreoUsuario(){
        Usuario u = new Usuario("juan.roa-h@mail.escuelaing.edu.co","passwordcifrado123","Juan David", "Roa Hernandez", Rol.ESTUDIANTE, LocalDate.of(2005,3,22), Programa.INGENIERIA_SISTEMAS);
        PerfilDeportivo pd = new PerfilDeportivo(Posicion.PORTERO, "1");
        u.setPerfilDeportivo(pd);
        ServicioUsuario su = new ServicioUsuario();
        PerfilDeportivo pdbusqueda = su.buscarPerfilDeportivoPorUsuario("juan.roa-h@mail.escuelaing.edu.co");
        assertEquals(pd, pdbusqueda);
    }
    @Test
    void testObtenerPerfilDeportivoPorUsuario(){
        Usuario u = new Usuario("juan.roa-h@mail.escuelaing.edu.co","passwordcifrado123","Juan David", "Roa Hernandez", Rol.ESTUDIANTE, LocalDate.of(2005,3,22), Programa.INGENIERIA_SISTEMAS);
        PerfilDeportivo pd = new PerfilDeportivo(Posicion.PORTERO, "1");
        u.setPerfilDeportivo(pd);
        ServicioUsuario su = new ServicioUsuario();
        PerfilDeportivo pdbusqueda = su.buscarPerfilDeportivoPorUsuario(u);
        assertEquals(pd, pdbusqueda);
    }

}
