package by.station.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("carWashing")
public class CarWashingController {

    @RequestMapping(method = RequestMethod.GET)
    public String getCarWash(Model model){

        model.addAttribute("version", "wash");

        return "carWashing";
    }
}
