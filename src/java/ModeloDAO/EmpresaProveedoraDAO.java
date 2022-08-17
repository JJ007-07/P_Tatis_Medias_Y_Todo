/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;



import ModeloVO.EmpresaProveedoraVO;
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
 * @author jtgt2
 */
public class EmpresaProveedoraDAO extends ConexionDB implements Crud {
    //Declarar variables y/o objetos 
  private Connection conexion;
  private PreparedStatement puente;
  private ResultSet mensajero;
  
  private boolean operacion;
  
  
  private String sql;  
    
     public  ArrayList<EmpresaProveedoraVO>Listar(){
       ArrayList<EmpresaProveedoraVO>listaEmpresa= new ArrayList<>();
     
        try {
            
            conexion =this. obtenerConexion();
            sql="select * from EmpresaProveedora;";
            puente = conexion.prepareStatement(sql);
            mensajero= puente. executeQuery();
            while (mensajero.next()) {
                
                EmpresaProveedoraVO epVO= new EmpresaProveedoraVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7));
                 listaEmpresa.add(epVO);
            }
             
             
      } catch (SQLException e) {
           Logger.getLogger(EmpresaProveedoraDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally{
            
            try {
                this.cerrarConexion();
                
            } catch (SQLException e) {
                Logger.getLogger(EmpresaProveedoraDAO.class.getName()).log(Level.SEVERE,null, e);
       
            }
        
        } 
        
        return listaEmpresa;
    
       
     } 
 private String IdEmpresaProveedora="", NitEmpresaProveedora="",RazonSocialEmpresaProveedora="",NombreComercialEmpresaProveedora="",DireccionEmpresaProveedora="",
TelefonoEmpresaProveedora="",Numeropago="";
  
  //2.metodo contructor para recibir  datos del VO
  
  public EmpresaProveedoraDAO(){
  }

    public EmpresaProveedoraDAO(EmpresaProveedoraVO epVO) {
        super();
        
        //3. Conectarse
        
        try {
            conexion = this.obtenerConexion();
            
            //Traer al DAO los datos del VO para hecer la operación.
            
            IdEmpresaProveedora = epVO.getIdEmpresaProveedora();
            NitEmpresaProveedora = epVO.getNitEmpresaProveedora();
            RazonSocialEmpresaProveedora =epVO.getRazonSocialEmpresaProveedora();
            NombreComercialEmpresaProveedora =epVO.getNombreComercialEmpresaProveedora() ;
            DireccionEmpresaProveedora =epVO.getDireccionEmpresaProveedora() ;
            TelefonoEmpresaProveedora =epVO.getTelefonoEmpresaProveedora() ;
            Numeropago =epVO.getNumeropago();
          

            
            
        } catch (Exception e) {
            
            Logger.getLogger(EmpresaProveedoraDAO.class.getName()).log(Level.SEVERE,null, e);
        }
    }

   

    @Override
    public boolean agregarRegistro() {
        try {
            sql="insert into empresaproveedora (NitEmpresaProveedora,RazonSocialEmpresaProveedora,NombreComercialEmpresaProveedora,DireccionEmpresaProveedora,TelefonoEmpresaProveedora,Numeropago) values(?,?,?,?,?,?)";
            puente = conexion.prepareCall(sql);
            puente.setString(1,NitEmpresaProveedora);
            puente.setString(2,RazonSocialEmpresaProveedora);
            puente.setString(3,NombreComercialEmpresaProveedora);
            puente.setString(4,DireccionEmpresaProveedora);
            puente.setString(5,TelefonoEmpresaProveedora );
            puente.setString(6,Numeropago);
           
            
            puente.executeUpdate();
            operacion= true;
            
            
        } catch (SQLException e) {
             Logger.getLogger(EmpresaProveedoraDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally{
            
            try {
                this.cerrarConexion();
                
            } catch (Exception e) {
                Logger.getLogger(EmpresaProveedoraDAO.class.getName()).log(Level.SEVERE,null, e);
       
            }
        
        } 
        
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql="update empresaproveedora SET NitEmpresaProveedora=?,RazonSocialEmpresaProveedora=?,NombreComercialEmpresaProveedora=?,DireccionEmpresaProveedora=?,"
                    + "TelefonoEmpresaProveedora=?,Numeropago=? WHERE Idempresaproveedora=?";
            puente = conexion.prepareCall(sql);
            puente.setString(1,NitEmpresaProveedora);
            puente.setString(2,RazonSocialEmpresaProveedora );
            puente.setString(3,NombreComercialEmpresaProveedora);
            puente.setString(4,DireccionEmpresaProveedora);
            puente.setString(5,TelefonoEmpresaProveedora );
            puente.setString(6,Numeropago);
            puente.setString(7,IdEmpresaProveedora);
         
            
            puente.executeUpdate();
            operacion= true;
            
            
        } catch (SQLException e) {
             Logger.getLogger(EmpresaProveedoraDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally{
            
            try {
                this.cerrarConexion();
                
            } catch (Exception e) {
                Logger.getLogger(EmpresaProveedoraDAO.class.getName()).log(Level.SEVERE,null, e);
       
            }
        
        } 
        
        return operacion;
        
         }

    @Override
    public boolean eliminarRegistro() {
        
        try {
            sql="DELETE FROM empresaproveedora WHERE IdEmpresaProveedora=?;";
            puente = conexion.prepareCall(sql);
            puente.setString(1,IdEmpresaProveedora);
           
            
            puente.executeUpdate();
            operacion= true;
            
            
        } catch (SQLException e) {
             Logger.getLogger(EmpresaProveedoraDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally{
            
            try {
                this.cerrarConexion();
                
            } catch (Exception e) {
                Logger.getLogger(EmpresaProveedoraDAO.class.getName()).log(Level.SEVERE,null, e);
       
            }
        
        } 
        
        return operacion;
    }
    
    
    
    public boolean consultarEmpresaProveedora(){
{
        
        try {
            conexion =this. obtenerConexion();
            sql="select * from EmpresaProveedora where IdEmpresaProveedora=?";
            puente = conexion.prepareCall(sql);
            puente.setString(2,NitEmpresaProveedora);
            puente.setString(3,RazonSocialEmpresaProveedora);
            puente.setString(4,NombreComercialEmpresaProveedora);
            puente.setString(5,DireccionEmpresaProveedora );
            puente.setString(6,TelefonoEmpresaProveedora);
            puente.setString(7,Numeropago);
            puente.setString(8,IdEmpresaProveedora);
      
            mensajero= puente. executeQuery();
            if (mensajero.next()) {
                
                operacion=true;
                    
                }
            
        } catch (Exception e) {
        }finally{
            
            try {
                this.cerrarConexion();
                
            } catch (Exception e) {
                Logger.getLogger(EmpresaProveedoraDAO.class.getName()).log(Level.SEVERE,null, e);
       
            }
        
        } 
        
        return operacion;
    


}
        
}
    
}