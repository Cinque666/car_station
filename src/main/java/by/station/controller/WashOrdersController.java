package by.station.controller;

import by.station.controller.util.WashOrder;
import by.station.service.WashOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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

        List<WashOrder> washOrders = washOrdersService.getEntities();

        model.addAttribute("orders", washOrders);
        model.addAttribute("version", "wash");
        return "washOrders";
    }
}
