/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;
/**
 *
 * @author jtgt2
 */
import ModeloVO.CategoriaVO;
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
 * @author Jessika Tatiana
 */
public class CategoriaDAO extends ConexionDB implements Crud{

    
    //Declarar variables y/o objetos 
  private Connection conexion;
  private PreparedStatement puente;
  private ResultSet mensajero;
  
 private boolean operacion;
  
  
  private String sql;  
  private String IdCategoria="",NombreCategoria="";
    
     public  ArrayList<CategoriaVO>Listar(){
       ArrayList<CategoriaVO>listaCategoria = new ArrayList<>();
     
        try {
            
            conexion =this. obtenerConexion();
            sql="select * from categoria;";
            puente = conexion.prepareStatement(sql);
            mensajero= puente. executeQuery();
            while (mensajero.next()) {
                
                CategoriaVO catVO= new CategoriaVO(mensajero.getString(1), mensajero.getString(2));
                 listaCategoria.add(catVO);
            }
             
             
      } catch (SQLException e) {
           Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally{
            
            try {
                this.cerrarConexion();
                
            } catch (SQLException e) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null, e);
       
            }
        
        } 
        
        return listaCategoria;
    
       
     }

 
  
  //2.metodo contructor para recibir  datos del VO
  
  public CategoriaDAO(){
  }

    public CategoriaDAO(CategoriaVO catVO) {
        super();
        
        //3. Conectarse
        
        try {
            conexion = this.obtenerConexion();
            
            //Traer al DAO los datos del VO para hecer la operación.
       
            IdCategoria =catVO.getIdCategoria();
            NombreCategoria=catVO.getNombreCategoria();
          

            
            
        } catch (Exception e) {
            
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null, e);
        }
    }

   

    @Override
    public boolean agregarRegistro() {
        try {
            sql="insert into Categoria (IdCategoria,NombreCategoria) values(?,?)";
            puente = conexion.prepareCall(sql);
            puente.setString(1,IdCategoria );
            puente.setString(2,NombreCategoria);
            
            
            puente.executeUpdate();
            operacion= true;
            
            
        } catch (SQLException e) {
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally{
            
            try {
                this.cerrarConexion();
                
            } catch (Exception e) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null, e);
       
            }
        
        } 
        
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql="update categoria SET NombreCategoria=? WHERE IdCategoria=?";
            puente = conexion.prepareCall(sql);
            
            puente.setString(1,NombreCategoria);
            puente.setString(2,IdCategoria );
            
            puente.executeUpdate();
            operacion= true;
            
            
        } catch (SQLException e) {
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally{
            
            try {
                this.cerrarConexion();
                
            } catch (Exception e) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null, e);
       
            }
        
        } 
        
        return operacion;
        
         }

    @Override
    public boolean eliminarRegistro() {
        
        try {
            sql="DELETE FROM categoria WHERE IdCategoria=?;";
            puente = conexion.prepareCall(sql);
            puente.setString(1,IdCategoria );
           
            
            puente.executeUpdate();
            operacion= true;
            
            
        } catch (SQLException e) {
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally{
            
            try {
                this.cerrarConexion();
                
            } catch (Exception e) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null, e);
       
            }
        
        } 
        
        return operacion;
        
    }
    
<<<<<<< HEAD
   public CategoriaVO consultarCategoria(String IdCategoria) {
=======
public CategoriaVO consultarCategoria(String IdCategoria) {
>>>>>>> 4ef559569ef0ba8104b738277f2c23c5d715abce

        CategoriaVO catVO = null;
        try {
            sql = "select * from Categoria WHERE IdCategoria=?";
            conexion = this.obtenerConexion();
            puente = conexion.prepareStatement(sql);
            puente.setString(1, IdCategoria);
            mensajero = puente.executeQuery();
            if (mensajero.next()) {
                catVO = new CategoriaVO(mensajero.getString(1), mensajero.getString(2));
            }

        } catch (SQLException e) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);

            }

        }
        return catVO;
    }
<<<<<<< HEAD
    
}

    
    
  
=======
        
}  
>>>>>>> 4ef559569ef0ba8104b738277f2c23c5d715abce
