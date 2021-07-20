package football.service.mapper;

import football.dto.request.StadiumRequestDto;
import football.dto.response.StadiumResponseDto;
import football.model.Stadium;
import org.springframework.stereotype.Component;

@Component
public class StadiumMapper implements RequestDtoMapper<StadiumRequestDto, Stadium>,
        ResponseDtoMapper<StadiumResponseDto, Stadium> {
    @Override
    public Stadium mapToModel(StadiumRequestDto dto) {
        Stadium stadium = new Stadium();
        stadium.setDescription(dto.getDescription());
        stadium.setCapacity(dto.getCapacity());
        return stadium;
    }

    @Override
    public StadiumResponseDto mapToDto(Stadium stadium) {
        StadiumResponseDto responseDto = new StadiumResponseDto();
        responseDto.setId(stadium.getId());
        responseDto.setDescription(stadium.getDescription());
        return responseDto;
    }
}
