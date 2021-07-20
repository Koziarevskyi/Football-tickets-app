package football.service.mapper;

import football.dto.request.GameSessionRequestDto;
import football.dto.response.GameSessionResponseDto;
import football.model.GameSession;
import football.service.GameService;
import football.service.StadiumService;
import football.util.DateTimePatternUtil;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

@Component
public class GameSessionMapper implements RequestDtoMapper<GameSessionRequestDto, GameSession>,
        ResponseDtoMapper<GameSessionResponseDto, GameSession> {
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(DateTimePatternUtil.DATE_TIME_PATTERN);
    private final StadiumService stadiumService;
    private final GameService gameService;

    public GameSessionMapper(StadiumService stadiumService, GameService gameService) {
        this.stadiumService = stadiumService;
        this.gameService = gameService;
    }

    @Override
    public GameSession mapToModel(GameSessionRequestDto dto) {
        GameSession gameSession = new GameSession();
        gameSession.setGame(gameService.get(dto.getGameId()));
        gameSession.setStadium(stadiumService.get(dto.getStadiumId()));
        gameSession.setShowTime(LocalDateTime.parse(dto.getShowTime(), formatter));
        return gameSession;
    }

    @Override
    public GameSessionResponseDto mapToDto(GameSession gameSession) {
        GameSessionResponseDto responseDto = new GameSessionResponseDto();
        responseDto.setGameSessionId(gameSession.getId());
        responseDto.setStadiumId(gameSession.getStadium().getId());
        responseDto.setGameId(gameSession.getGame().getId());
        responseDto.setGameTitle(gameSession.getGame().getTitle());
        responseDto.setShowTime(gameSession.getShowTime().format(formatter));
        return responseDto;
    }
}
