# 📄 Requerimientos del Sistema

## 1. Lista general de requerimientos

El sistema de TECHCUP tiene los siguientes requerimientos:

### 1.1 Requerimientos funcionales

#### Registro de torneo
- Permitir a los organizadores crear torneos con fechas y cantidad de equipos.
- Permitir a los organizadores iniciar y finalizar torneos.
- Permitir a los organizadores consultar la información básica de un torneo.

#### Registro de Jugadores
- Permitir a estudiantes y graduados registrarse con su correo institucional.
- Permitir a familiares registrarse con correo personal de Gmail.
- Permitir crear un perfil deportivo con posición, dorsal y foto de perfil.
- Permitir a los participantes administrar su disponibilidad.
- Permitir a los participantes recibir y gestionar invitaciones de equipos.

#### Creación y gestión de equipos
- Permitir a los capitanes crear equipos con nombre, escudo y colores.
- Permitir a los capitanes invitar participantes para unirse al equipo.
- Validar que cada equipo tenga entre 7 y 12 jugadores.
- Validar que más de la mitad de los jugadores del equipo pertenezcan a los programas Ingeniería de Sistemas, IA, Ciberseguridad o Estadística.
- Validar que un jugador no pertenezca a dos equipos.

#### Búsqueda de Jugadores
- Permitir a los capitanes buscar participantes por posición, semestre, edad, género, nombre e identificación.

#### Inscripción y pagos
- Permitir a los capitanes registrar el comprobante de pago de la inscripción.
- Permitir a los organizadores aprobar o rechazar comprobantes de pago.
- Permitir gestionar estados de pago/inscripción de los equipos.
- Validar que solo equipos con inscripción aprobada puedan participar en el torneo.

#### Configurar Torneo
- Permitir a los organizadores publicar reglamento y fechas importantes.
- Permitir a los organizadores configurar horarios, canchas y sanciones.
- Permitir a los organizadores configurar el cierre de inscripciones.

#### Alineaciones del Equipo
- Permitir a los capitanes seleccionar titulares, reservas y formación.
- Permitir ubicar visualmente a los jugadores en la cancha.
- Permitir a los participantes consultar la alineación del equipo rival.
- Validar que participen únicamente 7 jugadores por partido.

#### Registro de Partidos
- Permitir a los organizadores registrar resultados de partido (marcador, goleadores, tarjetas amarillas y rojas).

#### Consulta de Partidos
- Permitir a los árbitros consultar fecha, hora, cancha y equipos del partido asignado.

#### Tabla de Posiciones
- Calcular automáticamente por equipo: partidos jugados, ganados, empatados, perdidos, goles a favor, goles en contra, diferencia de gol y puntos.
- Permitir consultar la tabla de posiciones actualizada.

#### Llaves Eliminatorias
- Generar automáticamente cruces iniciales para la fase eliminatoria.
- Generar automáticamente cuartos de final, semifinal y final.

####  Estadísticas
- Permitir consultar máximos goleadores.
- Permitir consultar historial de partidos y resultados por equipo.
- Permitir consultar las fases de cuartos de final, semifinal y final.

#### Seguridad
- Registrar un log de acciones para auditoría.

### 1.2 Requerimientos no funcionales:
- Control de roles y permisos.
- Registro de acciones.
- Backend en Spring Boot separado por capas de controladores, adaptadores, lógica y datos.
- Manejo de API REST con Spring Boot.
- Frontend en React (aplicación web) con Typescript.
- Base de datos en PostgreSQL.

## Mockup inical
https://marvelapp.com/prototype/g7e74j8/screen/98533333

Contraseña: DOSW