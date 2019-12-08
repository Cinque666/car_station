package by.station.service;

import by.com.entity.Role;
import by.station.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SignUpService {

    private RoleRepository roleRepository;

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Transactional
    public List<Role> getAllRoles(){
        return roleRepository.getAllRoles();
    }
}
