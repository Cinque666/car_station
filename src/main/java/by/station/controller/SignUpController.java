package by.station.controller;

import by.com.entity.AppUser;
import by.com.entity.Role;
import by.station.controller.util.SignUpUser;
import by.station.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/signUp")
public class SignUpController {

    private SignUpService signUpService;

    @Autowired
    public void setSignUpService(SignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getSignUpPage(Model model){

        List<Role> roles = signUpService.getAllRoles();

        model.addAttribute("roles", roles);

        return "signUp";
    }

    @PostMapping
    public String registration(@ModelAttribute SignUpUser signUpUser, Model model){

        Role role = signUpService.getRoleByName(signUpUser.getRole());

        AppUser appUser = new AppUser();

        appUser.setRoleId(role.getRoleId());
        appUser.setLogin(signUpUser.getLogin());
        appUser.setPassword(signUpUser.getPassword());

        System.out.println(appUser.getLogin() + " " + appUser.getPassword() + " " + appUser.getRoleId());

        if(!signUpService.save(appUser)){
            return "error";
        }

        return "signUp";
    }
}
