package football.service;

import football.model.GameSession;
import java.time.LocalDate;
import java.util.List;

public interface GameSessionService {
    List<GameSession> findAvailableSessions(Long gameId, LocalDate date);

    GameSession add(GameSession session);

    GameSession get(Long id);

    GameSession update(GameSession gameSession);

    void delete(Long id);
}
