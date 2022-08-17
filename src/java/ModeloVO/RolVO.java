/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author User
 */
public class RolVO {
    
        private String IdRol,NombreRol;

    public String getIdRol() {
        return IdRol;
    }

    public void setIdRol(String IdRol) {
        this.IdRol = IdRol;
    }

    public String getNombreRol() {
        return NombreRol;
    }

    public void setNombreRol(String NombreRol) {
        this.NombreRol = NombreRol;
    }
    
    public RolVO(String IdRol, String NombreRol) {
        this.IdRol = IdRol;
        this.NombreRol = NombreRol;
    }

    public RolVO() {
    }
    
}
