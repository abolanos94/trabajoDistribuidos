package EstudianteApp;

/**
* EstudianteApp/EstudianteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Estudiante.idl
* martes 21 de mayo de 2019 10:49:24 PM COT
*/

public final class EstudianteHolder implements org.omg.CORBA.portable.Streamable
{
  public EstudianteApp.Estudiante value = null;

  public EstudianteHolder ()
  {
  }

  public EstudianteHolder (EstudianteApp.Estudiante initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EstudianteApp.EstudianteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EstudianteApp.EstudianteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EstudianteApp.EstudianteHelper.type ();
  }

}