package football.service.impl;

import football.dao.GameSessionDao;
import football.exception.DataProcessingException;
import football.model.GameSession;
import football.service.GameSessionService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GameSessionServiceImpl implements GameSessionService {
    private final GameSessionDao gameSessionDao;

    public GameSessionServiceImpl(GameSessionDao gameSessionDao) {
        this.gameSessionDao = gameSessionDao;
    }

    @Override
    public List<GameSession> findAvailableSessions(Long gameId, LocalDate date) {
        return gameSessionDao.findAvailableSessions(gameId, date);
    }

    @Override
    public GameSession add(GameSession session) {
        return gameSessionDao.add(session);
    }

    @Override
    public GameSession get(Long id) {
        return gameSessionDao.get(id).orElseThrow(
                () -> new DataProcessingException("Session with id " + id + " not found"));
    }

    @Override
    public GameSession update(GameSession gameSession) {
        return gameSessionDao.update(gameSession);
    }

    @Override
    public void delete(Long id) {
        gameSessionDao.delete(id);
    }
}
