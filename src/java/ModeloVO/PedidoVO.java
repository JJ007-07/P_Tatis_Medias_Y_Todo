/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Alexis
 */
public class PedidoVO {
    
    String NumeroFacturaPedido,FechaPedido,FechaRecibido,FechaVencimientoPago, NitEmpresaProveedoraFK, EstadoPedido ,DescripcionProducto,CodigoDeBarrasProducto,Descuento;
    double IVA, PrecioPorUnidad ,Subtotal,TotalBruto,TotalPedido;
    int  item,Cantidad;

    public PedidoVO() {
    }

    public PedidoVO(String NumeroFacturaPedido, String FechaPedido, String FechaRecibido, String FechaVencimientoPago, String NitEmpresaProveedoraFK, String EstadoPedido, String DescripcionProducto, String CodigoDeBarrasProducto, String Descuento, double IVA, double PrecioPorUnidad, double Subtotal, double TotalBruto, double TotalPedido, int item, int Cantidad) {
        this.NumeroFacturaPedido = NumeroFacturaPedido;
        this.FechaPedido = FechaPedido;
        this.FechaRecibido = FechaRecibido;
        this.FechaVencimientoPago = FechaVencimientoPago;
        this.NitEmpresaProveedoraFK = NitEmpresaProveedoraFK;
        this.EstadoPedido = EstadoPedido;
        this.DescripcionProducto = DescripcionProducto;
        this.CodigoDeBarrasProducto = CodigoDeBarrasProducto;
        this.Descuento = Descuento;
        this.IVA = IVA;
        this.PrecioPorUnidad = PrecioPorUnidad;
        this.Subtotal = Subtotal;
        this.TotalBruto = TotalBruto;
        this.TotalPedido = TotalPedido;
        this.item = item;
        this.Cantidad = Cantidad;
    }

    public String getNumeroFacturaPedido() {
        return NumeroFacturaPedido;
    }

    public void setNumeroFacturaPedido(String NumeroFacturaPedido) {
        this.NumeroFacturaPedido = NumeroFacturaPedido;
    }

    public String getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(String FechaPedido) {
        this.FechaPedido = FechaPedido;
    }

    public String getFechaRecibido() {
        return FechaRecibido;
    }

    public void setFechaRecibido(String FechaRecibido) {
        this.FechaRecibido = FechaRecibido;
    }

    public String getFechaVencimientoPago() {
        return FechaVencimientoPago;
    }

    public void setFechaVencimientoPago(String FechaVencimientoPago) {
        this.FechaVencimientoPago = FechaVencimientoPago;
    }

    public String getNitEmpresaProveedoraFK() {
        return NitEmpresaProveedoraFK;
    }

    public void setNitEmpresaProveedoraFK(String NitEmpresaProveedoraFK) {
        this.NitEmpresaProveedoraFK = NitEmpresaProveedoraFK;
    }

    public String getEstadoPedido() {
        return EstadoPedido;
    }

    public void setEstadoPedido(String EstadoPedido) {
        this.EstadoPedido = EstadoPedido;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public String getCodigoDeBarrasProducto() {
        return CodigoDeBarrasProducto;
    }

    public void setCodigoDeBarrasProducto(String CodigoDeBarrasProducto) {
        this.CodigoDeBarrasProducto = CodigoDeBarrasProducto;
    }

    public String getDescuento() {
        return Descuento;
    }

    public void setDescuento(String Descuento) {
        this.Descuento = Descuento;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
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

    public double getTotalBruto() {
        return TotalBruto;
    }

    public void setTotalBruto(double TotalBruto) {
        this.TotalBruto = TotalBruto;
    }

    public double getTotalPedido() {
        return TotalPedido;
    }

    public void setTotalPedido(double TotalPedido) {
        this.TotalPedido = TotalPedido;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

   
    

   
}

    