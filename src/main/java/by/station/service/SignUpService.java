package by.station.service;

import by.com.entity.AppUser;
import by.com.entity.Role;
import by.station.repository.AppUserRepository;
import by.station.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SignUpService {

    private RoleRepository roleRepository;
    private AppUserRepository appUserRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Autowired
    public void setAppUserRepository(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Transactional
    public List<Role> getAllRoles(){
        return roleRepository.getAllRoles();
    }

    @Transactional
    public boolean save(AppUser user) {

        if(user == null || user.getLogin().isEmpty() || user.getPassword().isEmpty()){
            return false;
        }

        Integer userCountByLogin = appUserRepository.findUserCountByLogin(user.getLogin());
        if (userCountByLogin != null && userCountByLogin >= 1) {
            return false;
        }

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        appUserRepository.save(user);

        return true;
    }

    @Transactional
    public Role getRoleByName(String role) {
        return roleRepository.getRoleByName(role);
    }
}
