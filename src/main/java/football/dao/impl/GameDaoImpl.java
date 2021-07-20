package football.dao.impl;

import football.dao.AbstractDao;
import football.dao.GameDao;
import football.model.Game;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class GameDaoImpl extends AbstractDao<Game> implements GameDao {
    public GameDaoImpl(SessionFactory factory) {
        super(factory, Game.class);
    }
}
