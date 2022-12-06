/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.PedidoVO;
import ModeloVO.Venta;
import Util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SENA
 */
public class PedidoDAO  extends ConexionDB {
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private String sql;

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ConexionDB cn = new ConexionDB();
    int r;

    
 public PedidoDAO(PedidoVO PedidoVO) {
        super();
 }

    public int RegistrarPedido(PedidoVO PedidoVO) {
        String sentencia = "INSERT INTO pedido (NumeroFacturaPedido,FechaPedido,FechaRecibido,FechaVencimientoPago,NitEmpresaProveedoraFK,TotalBruto,IVA,Descuento,TotalPedido,EstadoPedido) VALUES(?,?,?,?,?,?,?,?,?,?)";

        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sentencia);
            ps.setString(1, PedidoVO.getNumeroFacturaPedido());
            ps.setString(2, PedidoVO.getFechaPedido());
            ps.setString(3, PedidoVO.getFechaRecibido());
            ps.setString(4, PedidoVO.getFechaVencimientoPago());
            ps.setString(5, PedidoVO.getNitEmpresaProveedoraFK());
            ps.setDouble(6, PedidoVO.getTotalBruto());
            ps.setDouble(7, PedidoVO.getIVA());
            ps.setString(8, PedidoVO.getDescuento());
            ps.setDouble(9, PedidoVO.getTotalPedido());
            ps.setString(10,PedidoVO.getEstadoPedido());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;

    }

    public int GuardarDetallePedido(PedidoVO PedidoVO) {
        String sentencia = "INSERT INTO detalle_pedido (NumeroFacturaPedido,CodigoDeBarrasProducto,PrecioPorUnidad,Cantidad,Subtotal) VALUES(?,?,?,?,?)";

        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sentencia);
            ps.setString(1,PedidoVO.getNumeroFacturaPedido());
            ps.setString(2, PedidoVO.getCodigoDeBarrasProducto());
            ps.setDouble(3, PedidoVO.getPrecioPorUnidad());
            ps.setInt(4, PedidoVO.getCantidad());
            ps.setDouble(5, PedidoVO.getSubtotal());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } //finally {

//            try {
//                this.cerrarConexion();
//
//            } catch (SQLException ex) {
//                Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
//
//            }
        //}
        return r;

    }
}
