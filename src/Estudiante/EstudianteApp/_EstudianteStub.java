package EstudianteApp;


/**
* EstudianteApp/_EstudianteStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Estudiante.idl
* martes 21 de mayo de 2019 10:49:24 PM COT
*/

public class _EstudianteStub extends org.omg.CORBA.portable.ObjectImpl implements EstudianteApp.Estudiante
{

  public boolean insertarEstudiante (int id_estudiante, String est_nombre, String est_apellido, String est_fec_nacimiento, int est_carrera)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarEstudiante", true);
                $out.write_long (id_estudiante);
                $out.write_wstring (est_nombre);
                $out.write_wstring (est_apellido);
                $out.write_wstring (est_fec_nacimiento);
                $out.write_long (est_carrera);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarEstudiante (id_estudiante, est_nombre, est_apellido, est_fec_nacimiento, est_carrera        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarEstudiante

  public boolean actualizarEstudiante (int id_estudiante, String este_nombre, String est_apellido, String est_fecha_nacimiento, int est_carrera)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarEstudiante", true);
                $out.write_long (id_estudiante);
                $out.write_wstring (este_nombre);
                $out.write_wstring (est_apellido);
                $out.write_wstring (est_fecha_nacimiento);
                $out.write_long (est_carrera);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarEstudiante (id_estudiante, este_nombre, est_apellido, est_fecha_nacimiento, est_carrera        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarEstudiante

  public boolean eliminarEstudiante (int id_estudiante)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarEstudiante", true);
                $out.write_long (id_estudiante);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarEstudiante (id_estudiante        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarEstudiante

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:EstudianteApp/Estudiante:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _EstudianteStub
