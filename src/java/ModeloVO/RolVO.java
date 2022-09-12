package ModeloVO;

/**
 *
 * @author User
 */
public class RolVO {
    
        private String IdRol,TipoRol;

    public RolVO(String IdRol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdRol() {
        return IdRol;
    }

    public void setIdRol(String IdRol) {
        this.IdRol = IdRol;
    }

    public String getTipoRol() {
        return TipoRol;
    }

    public void setTipoRol(String TipoRol) {
        this.TipoRol = TipoRol;
    }
    
    public RolVO(String IdRol, String TipoRol) {
        this.IdRol = IdRol;
        this.TipoRol = TipoRol;
    }

    public RolVO() {
    }

  
    
}
