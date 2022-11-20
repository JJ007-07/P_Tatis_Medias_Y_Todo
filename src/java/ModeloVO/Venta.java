 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author AdminSena
 */
public class Venta {
      
    String Numerodeventafacturaventa,NumDocClienteFK,CodigoDeBarrasProducto,FechaventaMostrador, FormaventaMostrador, EstadoVentaMostrador, IdVentaMostradorFK ,DescripcionProducto;
    double  PrecioPorUnidad ,Subtotal,totalventaMostrador;
    int  item,IdEmpleadoFK,Cantidad;

    public Venta() {
    }

    public Venta(String Numerodeventafacturaventa, String NumDocClienteFK, String CodigoDeBarrasProducto, String FechaventaMostrador, String FormaventaMostrador, String EstadoVentaMostrador, String IdVentaMostradorFK, String DescripcionProducto, double PrecioPorUnidad, double Subtotal, double totalventaMostrador, int item, int IdEmpleadoFK, int Cantidad) {
        this.Numerodeventafacturaventa = Numerodeventafacturaventa;
        this.NumDocClienteFK = NumDocClienteFK;
        this.CodigoDeBarrasProducto = CodigoDeBarrasProducto;
        this.FechaventaMostrador = FechaventaMostrador;
        this.FormaventaMostrador = FormaventaMostrador;
        this.EstadoVentaMostrador = EstadoVentaMostrador;
        this.IdVentaMostradorFK = IdVentaMostradorFK;
        this.DescripcionProducto = DescripcionProducto;
        this.PrecioPorUnidad = PrecioPorUnidad;
        this.Subtotal = Subtotal;
     
        this.totalventaMostrador = totalventaMostrador;
        this.item = item;
        this.IdEmpleadoFK = IdEmpleadoFK;
        this.Cantidad = Cantidad;
    }

    public String getNumerodeventafacturaventa() {
        return Numerodeventafacturaventa;
    }

    public void setNumerodeventafacturaventa(String Numerodeventafacturaventa) {
        this.Numerodeventafacturaventa = Numerodeventafacturaventa;
    }

    public String getNumDocClienteFK() {
        return NumDocClienteFK;
    }

    public void setNumDocClienteFK(String NumDocClienteFK) {
        this.NumDocClienteFK = NumDocClienteFK;
    }

    public String getCodigoDeBarrasProducto() {
        return CodigoDeBarrasProducto;
    }

    public void setCodigoDeBarrasProducto(String CodigoDeBarrasProducto) {
        this.CodigoDeBarrasProducto = CodigoDeBarrasProducto;
    }

    public String getFechaventaMostrador() {
        return FechaventaMostrador;
    }

    public void setFechaventaMostrador(String FechaventaMostrador) {
        this.FechaventaMostrador = FechaventaMostrador;
    }

    public String getFormaventaMostrador() {
        return FormaventaMostrador;
    }

    public void setFormaventaMostrador(String FormaventaMostrador) {
        this.FormaventaMostrador = FormaventaMostrador;
    }

    public String getEstadoVentaMostrador() {
        return EstadoVentaMostrador;
    }

    public void setEstadoVentaMostrador(String EstadoVentaMostrador) {
        this.EstadoVentaMostrador = EstadoVentaMostrador;
    }

    public String getIdVentaMostradorFK() {
        return IdVentaMostradorFK;
    }

    public void setIdVentaMostradorFK(String IdVentaMostradorFK) {
        this.IdVentaMostradorFK = IdVentaMostradorFK;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public double getPrecioPorUnidad() {
        return PrecioPorUnidad;
    }

    public void setPrecioPorUnidad(double PrecioPorUnidad) {
        this.PrecioPorUnidad = PrecioPorUnidad;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getTotalventaMostrador() {
        return totalventaMostrador;
    }

    public void setTotalventaMostrador(double totalventaMostrador) {
        this.totalventaMostrador = totalventaMostrador;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdEmpleadoFK() {
        return IdEmpleadoFK;
    }

    public void setIdEmpleadoFK(int IdEmpleadoFK) {
        this.IdEmpleadoFK = IdEmpleadoFK;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

   
}