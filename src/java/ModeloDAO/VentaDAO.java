/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;


import ModeloVO.Venta;
import Util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger; 

/**
 *
 * @author AdminSena
 */
public class VentaDAO extends ConexionDB {

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private String sql;

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ConexionDB cn = new ConexionDB();
    int r;

    public VentaDAO(Venta venta) {

    }

    public VentaDAO() {
    }

    public String ObtenerNumeroDeFactura() {
        String Numerodeventafacturaventa = "00000";
        String consulta = "SELECT Numerodeventafacturaventa FROM ventaMostrador order by Numerodeventafacturaventa desc limit 1";

        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            if (rs.next()) {
                int num = rs.getInt(1)+1;
                Numerodeventafacturaventa = String.valueOf(num);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

//            try {
//                this.cerrarConexion();
//
//            } catch (SQLException ex) {
//                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
//
//            }

            return Numerodeventafacturaventa;

        }

    }

    public int RegistrarVenta(Venta venta) {
        String sentencia = "INSERT INTO ventaMostrador (Numerodeventafacturaventa,FechaventaMostrador,IdEmpleadoFK,NumDocClienteFK,FormaventaMostrador,TotalventaMostrador,EstadoVentaMostrador) VALUES(?,now(),?,?,?,?,?)";

        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sentencia);
            ps.setString(1, venta.getNumerodeventafacturaventa());
            ps.setInt(2, venta.getIdEmpleadoFK());
            ps.setString(3, venta.getNumDocClienteFK());
            ps.setString(4, venta.getFormaventaMostrador());
            ps.setDouble(5, venta.getTotalventaMostrador());
            ps.setString(6, venta.getEstadoVentaMostrador());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;

    }

    public int GuardarDetalleVenta(Venta venta) {
        String sentencia = "INSERT INTO detalle_ventaMostrador (Numerodeventafacturaventa,CodigoDeBarrasProducto,PrecioPorUnidad,Cantidad,Subtotal) VALUES(?,?,?,?,?)";

        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sentencia);
            ps.setString(1, venta.getNumerodeventafacturaventa());
            ps.setString(2, venta.getCodigoDeBarrasProducto());
            ps.setDouble(3, venta.getPrecioPorUnidad());
            ps.setInt(4, venta.getCantidad());
            ps.setDouble(5, venta.getSubtotal());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return r;

    }

}
