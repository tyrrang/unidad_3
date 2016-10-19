
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tyrrang
 */
@Entity @Table(name="rol")
public class Rol implements Serializable{
    @Id
    @GeneratedValue(
                    strategy = GenerationType.IDENTITY)
    @Column(name="id_rol")
    private Long idRol;
    @Column(length=30)
    private String nombre;
    
    public Rol(){
        this.idRol = 0L;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }
    
}
