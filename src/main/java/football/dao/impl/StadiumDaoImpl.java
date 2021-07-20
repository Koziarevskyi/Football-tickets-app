package football.dao.impl;

import football.dao.AbstractDao;
import football.dao.StadiumDao;
import football.model.Stadium;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class StadiumDaoImpl extends AbstractDao<Stadium> implements StadiumDao {
    public StadiumDaoImpl(SessionFactory factory) {
        super(factory, Stadium.class);
    }
}
