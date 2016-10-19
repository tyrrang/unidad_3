
package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tyrrang
 */
@Entity @Table(name = "usuario")
public class Usuario implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_usuario")
    private Long idUsuario;
    @Column(name = "nombre_usuario", length = 10)
    private String nombreUsuario;
    @Column(length = 40)
    private String contrasenia;
    @ManyToOne()
    @JoinColumn(name = "id_rol")
    private Rol rol;

    public Usuario(Long idUsuario, String nombreUsuario, Rol rol) {
        super();
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
    }

    public Usuario() {
        this.idUsuario=0L;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
}
