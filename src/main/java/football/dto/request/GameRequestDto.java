package football.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class GameRequestDto {
    @NotNull
    private String gameTitle;
    @Size(max = 200)
    private String gameDescription;

    public String getGameTitle() {
        return gameTitle;
    }

    public String getGameDescription() {
        return gameDescription;
    }
}
