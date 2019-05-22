/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiante;
import java.sql.*;
import Conexion.conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;


/**
 *
 * @author cadefihuilaltda
 */
public class Estudiante extends EstudianteApp.EstudiantePOA{
    private ORB orb;
conexion conectar = new conexion();

    @Override
    public boolean insertarEstudiante(int id_estudiante, String est_nombre, String est_apellido, String est_fec_nacimiento, int est_carrera) {
       
         
        boolean resultado = false;
                try {
                String sentenciaSql = "insert into persona (identificacion, nombre, apellido, nacimiento, carrera, )"
                + "values('"+ id_estudiante +"','"+ est_nombre +"','"+ est_apellido +"','"+ est_fec_nacimiento +"','"+ est_carrera +"')";
                conectar.conectar();
                Statement st = conectar.conex.createStatement();
                int valor = st.executeUpdate(sentenciaSql);
                if(valor > 0){
                resultado = true;
                }
                //Se cierran los recursos
                st.close();
                conectar.conex.close();
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al insertar una nueva persona. " + e.getMessage());
                }
                return resultado;   
    
    
    
    
    }

    @Override
    public boolean actualizarEstudiante(int id_estudiante, String este_nombre, String est_apellido, String est_fecha_nacimiento, int est_carrera) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.  
        
        
    }

    @Override
    public boolean eliminarEstudiante(int id_estudiante) {
        boolean resultado = false;
            try{
            String sentenciSql = "delete from persona where id_estudiante = " + id_estudiante;
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            int valor = st.executeUpdate(sentenciSql);
            if(valor > 0){
            resultado = true;
            }
            //Se cierran los recursos.
            st.close();
            conectar.conectar();
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el catch: " + ex.getMessage());
            }
            return resultado;
    }
    
     public String listarEstudiante() {
        String lista = "";
        try{
            String sentenciSql = "Select * from estudiante";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            ResultSet rs = st.executeQuery(sentenciSql);
            while(rs.next()){
                lista += rs.getLong(2) + " - " 
                        + rs.getString(3)+ " - " 
                        + rs.getString(4)+ " - " 
                        + rs.getString(5)+ " - " 
                        + rs.getString(6)+ " - " 
                        + rs.getString(7) + "\n";
            }
            //Se cierran los recursos.
            rs.close();
            conectar.conex.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el catch: " + ex.getMessage());
        }
        return lista;

    }

    
    

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
    
    }
     public ResultSet cargarTablaEstudiante() {
        ResultSet resultado = null;
        try {
            String query = "Select id_estudiente, est_nombre, est_apellido, est_fec_nacimiento, est_carrera ";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+e.getMessage());
        }
        return resultado;
    
     }
}
    
