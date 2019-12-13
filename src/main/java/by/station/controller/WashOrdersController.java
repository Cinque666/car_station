package by.station.controller;

import by.station.service.WashOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/washOrders")
public class WashOrdersController {

    private WashOrdersService washOrdersService;

    @Autowired
    public void setWashOrdersService(WashOrdersService washOrdersService) {
        this.washOrdersService = washOrdersService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getWashOrdersTable(Model model){



        model.addAttribute("version", "wash");
        return "washOrders";
    }
}
