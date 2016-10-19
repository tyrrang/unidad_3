package utng.datos;

/**
 *
 * @author tyrrang
 */

import org.hibernate.HibernateException;
import utng.modelo.Obra;

public class ObraDAO extends DAO<Obra>{

    public ObraDAO() {
        super(new Obra());
    }
    
    public Obra getOneById(Obra obra)
            throws HibernateException {
        return super.getOneById(
                        obra.getIdObra());
    }
    
}
