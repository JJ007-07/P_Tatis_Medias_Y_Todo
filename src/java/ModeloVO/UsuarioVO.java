/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author MejorGrupo
 */
public class UsuarioVO {

    private String IdUsuario, NombreUsuario, PasswordUsuario, IdrolFK, EstadoUsuario;

    public UsuarioVO(String IdUsuario, String NombreUsuario, String PasswordUsuario, String EstadoUsuario, String IdrolFK) {
        this.IdUsuario = IdUsuario;
        this.NombreUsuario = NombreUsuario;
        this.PasswordUsuario = PasswordUsuario;
        this.EstadoUsuario = EstadoUsuario;
        this.IdrolFK = IdrolFK;
    }

    public UsuarioVO(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    public String getIdrolFK() {
        return IdrolFK;
    }

    public void setIdrolFK(String IdrolFK) {
        this.IdrolFK = IdrolFK;
    }

    public UsuarioVO() {
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getPasswordUsuario() {
        return PasswordUsuario;
    }

    public void setPasswordUsuario(String PasswordUsuario) {
        this.PasswordUsuario = PasswordUsuario;
    }
 

    public String getEstadoUsuario() {
        return EstadoUsuario;
    }

    public void setEstadoUsuario(String EstadoUsuario) {
        this.EstadoUsuario = EstadoUsuario;
    }

}
