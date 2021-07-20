package football.service;

import football.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getRoleByName(Role.RoleName roleName);
}
