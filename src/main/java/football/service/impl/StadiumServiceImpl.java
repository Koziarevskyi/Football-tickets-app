package football.service.impl;

import football.dao.StadiumDao;
import football.exception.DataProcessingException;
import football.model.Stadium;
import football.service.StadiumService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StadiumServiceImpl implements StadiumService {
    private final StadiumDao stadiumDao;

    public StadiumServiceImpl(StadiumDao stadiumDao) {
        this.stadiumDao = stadiumDao;
    }

    @Override
    public Stadium add(Stadium stadium) {
        return stadiumDao.add(stadium);
    }

    @Override
    public Stadium get(Long id) {
        return stadiumDao.get(id).orElseThrow(
                () -> new DataProcessingException("Can't get stadium hall by id " + id));
    }

    @Override
    public List<Stadium> getAll() {
        return stadiumDao.getAll();
    }
}
