package football.controller;

import football.dto.request.GameRequestDto;
import football.dto.response.GameResponseDto;
import football.model.Game;
import football.service.GameService;
import football.service.mapper.GameMapper;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameService gameService;
    private final GameMapper gameMapper;

    public GameController(GameService gameService, GameMapper gameMapper) {
        this.gameService = gameService;
        this.gameMapper = gameMapper;
    }

    @PostMapping
    public GameResponseDto add(@RequestBody @Valid GameRequestDto requestDto) {
        Game game = gameService.add(gameMapper.mapToModel(requestDto));
        return gameMapper.mapToDto(game);
    }

    @GetMapping
    public List<GameResponseDto> getAll() {
        return gameService.getAll()
                .stream()
                .map(gameMapper::mapToDto)
                .collect(Collectors.toList());
    }
}
