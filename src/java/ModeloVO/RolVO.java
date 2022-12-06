package ModeloVO;

/**
 *
 * @author User
 */
public class RolVO {
    
        private String IdRol,TipoRol;

 

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
