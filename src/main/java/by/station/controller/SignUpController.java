package by.station.controller;

import by.com.entity.Role;
import by.station.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}
