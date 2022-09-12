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
public class VentaVO {
    private String IdVentaMostrador,FechaVentaMostrador,IdEmpleadoFK,IdClienteFK, Descuento,FormaventaMostrador;

    public VentaVO(String IdVentaMostrador, String FechaVentaMostrador, String IdEmpleadoFK, String IdClienteFK, String Descuento, String FormaventaMostrador) {
        this.IdVentaMostrador = IdVentaMostrador;
        this.FechaVentaMostrador = FechaVentaMostrador;
        this.IdEmpleadoFK = IdEmpleadoFK;
        this.IdClienteFK = IdClienteFK;
        this.Descuento = Descuento;
        this.FormaventaMostrador = FormaventaMostrador;
    }

    public VentaVO() {
    }

    public String getIdVentaMostrador() {
        return IdVentaMostrador;
    }

    public void setIdVentaMostrador(String IdVentaMostrador) {
        this.IdVentaMostrador = IdVentaMostrador;
    }

    public String getFechaVentaMostrador() {
        return FechaVentaMostrador;
    }

    public void setFechaVentaMostrador(String FechaVentaMostrador) {
        this.FechaVentaMostrador = FechaVentaMostrador;
    }

    public String getIdEmpleadoFK() {
        return IdEmpleadoFK;
    }

    public void setIdEmpleadoFK(String IdEmpleadoFK) {
        this.IdEmpleadoFK = IdEmpleadoFK;
    }

    public String getIdClienteFK() {
        return IdClienteFK;
    }

    public void setIdClienteFK(String IdClienteFK) {
        this.IdClienteFK = IdClienteFK;
    }

    public String getDescuento() {
        return Descuento;
    }

    public void setDescuento(String Descuento) {
        this.Descuento = Descuento;
    }

    public String getFormaventaMostrador() {
        return FormaventaMostrador;
    }

    public void setFormaventaMostrador(String FormaventaMostrador) {
        this.FormaventaMostrador = FormaventaMostrador;
    }
    
    
}
