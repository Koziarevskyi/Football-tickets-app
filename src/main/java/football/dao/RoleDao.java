package football.dao;

import football.model.Role;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(Role.RoleName roleName);
}
