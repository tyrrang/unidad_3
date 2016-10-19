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


@Entity @Table(name="obra")
public class Obra implements Serializable{
    @Id
    @GeneratedValue(
                    strategy = GenerationType.IDENTITY)
    @Column(name="id_obra")
    private Long idObra;
    @Column(length=30)
    private String nombre;
    @Column(length=30)
    private String costo;
    @Column(length=30)
    private String material;
    public Obra(){
        this.idObra = 0L;
    }

    public Long getIdObra() {
        return idObra;
    }

    public void setIdObra(Long idObra) {
        this.idObra = idObra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
}
