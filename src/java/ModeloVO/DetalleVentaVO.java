/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author jtgt2
 */
public class DetalleVentaVO {
    String IdProducto,CodigoDeBarrasProducto,DescripcionProducto,PrecioPorUnidad,Cantidad,subtotal;

    public DetalleVentaVO() {
    }

    public DetalleVentaVO(String IdProducto, String CodigoDeBarrasProducto, String DescripcionProducto, String PrecioPorUnidad, String Cantidad, String subtotal) {
        this.IdProducto = IdProducto;
        this.CodigoDeBarrasProducto = CodigoDeBarrasProducto;
        this.DescripcionProducto = DescripcionProducto;
        this.PrecioPorUnidad = PrecioPorUnidad;
        this.Cantidad = Cantidad;
        this.subtotal = subtotal;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getCodigoDeBarrasProducto() {
        return CodigoDeBarrasProducto;
    }

    public void setCodigoDeBarrasProducto(String CodigoDeBarrasProducto) {
        this.CodigoDeBarrasProducto = CodigoDeBarrasProducto;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public String getPrecioPorUnidad() {
        return PrecioPorUnidad;
    }

    public void setPrecioPorUnidad(String PrecioPorUnidad) {
        this.PrecioPorUnidad = PrecioPorUnidad;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    
}
