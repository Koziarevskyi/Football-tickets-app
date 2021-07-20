package football.dao;

import football.model.GameSession;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface GameSessionDao {
    GameSession add(GameSession gameSession);

    Optional<GameSession> get(Long id);

    List<GameSession> findAvailableSessions(Long gameId, LocalDate date);

    GameSession update(GameSession gameSession);

    void delete(Long id);
}
