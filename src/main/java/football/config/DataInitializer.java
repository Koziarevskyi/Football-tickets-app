package football.config;

import football.model.Role;
import football.model.User;
import football.service.RoleService;
import football.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService,
                           UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        roleService.add(new Role(Role.RoleName.ADMIN));
        roleService.add(new Role(Role.RoleName.USER));

        User admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("123");
        admin.setRoles(Set.of(roleService.getRoleByName(Role.RoleName.ADMIN)));
        userService.add(admin);

        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("123");
        user.setRoles(Set.of(roleService.getRoleByName(Role.RoleName.USER)));
        userService.add(user);
    }
}
