package football.service.mapper;

import football.dto.request.GameRequestDto;
import football.dto.response.GameResponseDto;
import football.model.Game;
import org.springframework.stereotype.Component;

@Component
public class GameMapper implements RequestDtoMapper<GameRequestDto, Game>,
        ResponseDtoMapper<GameResponseDto, Game> {
    @Override
    public Game mapToModel(GameRequestDto dto) {
        Game game = new Game();
        game.setTitle(dto.getGameTitle());
        game.setDescription(dto.getGameDescription());
        return game;
    }

    @Override
    public GameResponseDto mapToDto(Game game) {
        GameResponseDto responseDto = new GameResponseDto();
        responseDto.setGameId(game.getId());
        responseDto.setGameTitle(game.getTitle());
        responseDto.setGameDescription(game.getDescription());
        return responseDto;
    }
}
