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
@Entity
@Table(name = "proyecto")
public class Proyecto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")
    private Long idProyecto;
    @Column(name = "nombre_proyecto", length = 10)
    private String nombreProyecto;
    @Column(length = 40)
    private String tipoProyecto;
    @Column(length = 40)
    private String responsable;
    @ManyToOne()
    @JoinColumn(name = "id_obra_fk")
    private Obra obra;

    public Proyecto(Long idProyecto, String nombreProyecto, Obra obra) {
        super();
        this.idProyecto = idProyecto;
        this.nombreProyecto=nombreProyecto;
        this.obra = obra;
    }

    public Proyecto() {
        this.idProyecto=0L;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(String tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
    
    
    
    
}
