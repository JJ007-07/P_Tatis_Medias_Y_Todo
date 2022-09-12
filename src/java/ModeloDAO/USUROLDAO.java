/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;


import ModeloVO.RolVO;
import ModeloVO.USUROLVO;
import Util.ConexionDB;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SENA
 */
public class USUROLDAO extends ConexionDB implements Crud{

    public USUROLDAO() {
    }
    
    //Declarar variables y/o objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
   

    private Boolean operacion = false;
    private String sql;

   private String IdUsuario="",IdRol="";
   
     public USUROLDAO(USUROLVO urVO) {
        super();

        //3. Conectarse 
        try {
            conexion = this.obtenerConexion();

            //Traer al DAO los datos del VO para hecer la operación.
            IdUsuario = urVO.getIdUsuario();
        IdRol = urVO.getIdRol();
        

        } catch (Exception e) {

            Logger.getLogger(USUROLDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }
   
 public String seleccionarRol(String NombreUsuario, String PasswordUsuario){

String rolU = "";
        
        try {
            conexion = this.obtenerConexion();
            sql = "select * from rol as user inner join usuario as usu on usu.IdUsuario = user.IdRol where NombreUsuario = ? and PasswordUsuario= ?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, NombreUsuario);
            puente.setString(2, PasswordUsuario);
            mensajero = puente.executeQuery();

            if (mensajero.next()) {
                rolU = mensajero.getString("IdRol");
            }

        } catch (SQLException e) {
            Logger.getLogger(USUROLDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return rolU;
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "INSERT INTO `usuario_rol`(`IdUsuario`, `IdRol`) VALUES (?,?)";
            puente = conexion.prepareCall(sql);
            puente.setString(1,IdUsuario);
            puente.setString(2,IdRol);
         
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(USUROLDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();

            } catch (Exception e) {
                Logger.getLogger(USUROLDAO.class.getName()).log(Level.SEVERE, null, e);

            }

        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}