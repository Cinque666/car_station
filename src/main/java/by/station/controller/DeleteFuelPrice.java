package by.station.controller;

import by.com.entity.Fuel;
import by.station.service.DeleteFuelPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/deleteFuelPrice")
public class DeleteFuelPrice {

    private DeleteFuelPriceService deleteFuelPriceService;

    @Autowired
    public void setDeleteFuelPriceService(DeleteFuelPriceService deleteFuelPriceService) {
        this.deleteFuelPriceService = deleteFuelPriceService;
    }

    @RequestMapping("/{id}")
    public String deleteFuel(@PathVariable Integer id, Model model){

        deleteFuelPriceService.deleteFuel(id);
        List<Fuel> fuels = deleteFuelPriceService.getAllFuels();

        model.addAttribute("fuels", fuels);
        model.addAttribute("version", "gas");

        return "fuelPrices";
    }
}

