package EstudianteApp;


/**
* EstudianteApp/EstudianteOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Estudiante.idl
* martes 21 de mayo de 2019 10:49:24 PM COT
*/

public interface EstudianteOperations 
{
  boolean insertarEstudiante (int id_estudiante, String est_nombre, String est_apellido, String est_fec_nacimiento, int est_carrera);
  boolean actualizarEstudiante (int id_estudiante, String este_nombre, String est_apellido, String est_fecha_nacimiento, int est_carrera);
  boolean eliminarEstudiante (int id_estudiante);
  void shutdown ();
} // interface EstudianteOperations
