package football.dao;

import football.model.Stadium;
import java.util.List;
import java.util.Optional;

public interface StadiumDao {
    Stadium add(Stadium stadium);

    Optional<Stadium> get(Long id);

    List<Stadium> getAll();
}
