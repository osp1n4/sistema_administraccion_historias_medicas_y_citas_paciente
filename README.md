# Consultorio Doctor Ramiro Fernandez

Esta aplicación busca satifacerun requerimiento de un sistema para la administración de las historias médicas y el manejo de citas de sus pacientes.

Lineamientos

Que le permita al doctor establecer un horario de disponibilidad por día de la semana. ej (lunes 8am a 5pm, martes 9am a 3 pm ... )
Que le permita a el doctor agregar un paciente nuevo
Que le permita al doctor modificar la información personal del paciente de ser necesario
Que le permita a los pacientes que están inscritos  agendar citas pero sólo en los horarios disponibles, es decir deben ir saliendo de disponibilidad los horarios que ya han sido tomados.(Hay que definir también cuanto toma cada cita como un estándar para saber qué franja horaria se va ocupando a medida que se van agendando citas)
Que le permita al doctor aceptar o cancelar las citas que se van agendando.(Si el doctor cancela la cita el horario debe volver a pasar a estar disponible)
Que le permita al doctor listar todo el historial médico de un  paciente con todas las interacciones que han tenido.
Por último que le permita eliminar pacientes.

Solución
Se realizó una separación de los objetos que se va a utlizar, resultando las siguientes clases con sus atributos

### ¿Cómo correr el proyecto?
1.  Clonar este proyecto en su repositorio.
2. Presionar clic derecho en el archivo "SistemaAdministraccionHistoriasMedicasYCitasPacienteApplication.java".
3. Presionar la opción Run.

### Estructura de las carpetas
- controller: Son quienes reciben las peticiones del api.
- interfaces: Estas clases contienen métodos abstractos los cuales pueden heredarlos otras clases.
- model: Representan los tipos de datos de la api.
- repository: Estas clases guardan la estructura de datos.
- services: contiene las funcionalidades del sistema
 

## Patrones de diseño
Factory Method: Se aplicó al crearse la interface IDoctorService