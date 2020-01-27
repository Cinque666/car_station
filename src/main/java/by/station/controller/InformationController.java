package by.station.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/information")
public class InformationController {

    @RequestMapping(method = RequestMethod.GET)
    public String getInformation(Model model){

        model.addAttribute("version", "gas");

        return "information";
    }
}
