
package inventarios;

/**
 *
 * @author EfraJiJim
 */
public class UsuariosParaInicioSecion {
   private String Usuario;
   private String Contraseña;

    public UsuariosParaInicioSecion(String Usuario, String Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
   
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
   
}
