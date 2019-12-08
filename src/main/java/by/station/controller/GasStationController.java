package by.station.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/gasStation")
public class GasStationController {

    @RequestMapping(method = RequestMethod.GET)
    public String getHomePage(Model model){

        model.addAttribute("version","gas");

        return "gasStation";
    }
}
