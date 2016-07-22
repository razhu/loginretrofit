
package agetic.gob.bo.loginretrofit;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class RequestToken {

    @SerializedName("usuario")
    @Expose
    private String usuario;
    @SerializedName("contrasena")
    @Expose
    private String contrasena;

    /**
     *
     * @return
     * The usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @param usuario
     * The usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     *
     * @return
     * The contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     *
     * @param contrasena
     * The contrasena
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}