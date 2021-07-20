package football.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class StadiumRequestDto {
    @Min(10)
    private int capacity;
    @Size(max = 200)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
