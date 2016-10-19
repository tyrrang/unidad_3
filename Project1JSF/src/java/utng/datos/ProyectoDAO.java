package utng.datos;

/**
 *
 * @author tyrrang
 */

import org.hibernate.HibernateException;
import utng.modelo.Proyecto;

public class ProyectoDAO extends DAO<Proyecto> {

    public ProyectoDAO() {
        super(new Proyecto());
    }
    
     public Proyecto getOneById(Proyecto proyecto)
            throws HibernateException {
        return super.getOneById(
                        proyecto.getIdProyecto());
    }
    
    
}
