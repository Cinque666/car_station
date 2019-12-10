package by.station.controller;

import by.com.entity.Fuel;
import by.station.service.FuelPricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/fuelPrices")
public class FuelPrices {

    private FuelPricesService fuelPricesService;

    @Autowired
    public void setFuelPricesService(FuelPricesService fuelPricesService) {
        this.fuelPricesService = fuelPricesService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getFuelPricesPage(Model model){

        List<Fuel> fuels = fuelPricesService.getAllFuels();

        model.addAttribute("fuels", fuels);
        model.addAttribute("version", "gas");

        return "fuelPrices";
    }
}
