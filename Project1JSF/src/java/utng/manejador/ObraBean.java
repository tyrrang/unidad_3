package utng.manejador;

/**
 *
 * @author tyrrang
 */
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.ObraDAO;
import utng.modelo.Obra;

@ManagedBean
@SessionScoped

public class ObraBean implements Serializable {

    private List<Obra> obras;
    private Obra obra;

    public ObraBean() {
    }

    public Obra getObra() {
        return obra;
    }
    
    
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }
    
    public String listar(){
        ObraDAO dao = new ObraDAO();
        try {
            obras = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Obras";
    }
    
    public String eliminar(){
        ObraDAO dao = new ObraDAO();
        try {
            dao.delete(obra);
            obras = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        obra = new Obra();
        return "Iniciar";
    }
    
    public String guardar(){
        ObraDAO dao = new ObraDAO();
        try {
            if(obra.getIdObra()!=0){
                dao.update(obra);
            } else {
                dao.insert(obra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "cancelar";
    }
    public String editar(Obra obra){
        this.obra = obra;
        return "Editar";
    }

}//fin de la clase
