package by.station.controller;

import by.com.entity.Fuel;
import by.station.service.EditFuelPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/editFuelPrice")
public class EditFuelPriceController {

    private EditFuelPriceService editFuelPriceService;

    @Autowired
    public void setEditFuelPriceService(EditFuelPriceService editFuelPriceService) {
        this.editFuelPriceService = editFuelPriceService;
    }

    @RequestMapping("/{id}")
    public String getFuelPriceById(@PathVariable Integer id, Model model){

        Fuel fuel = editFuelPriceService.getFuelById(id);

        model.addAttribute("fuel", fuel);
        model.addAttribute("version", "gas");

        return "editFuelPrice";
    }

    @PostMapping
    public String submittedFuelPrice(@ModelAttribute Fuel fuel, Model model){

        System.out.println(fuel.getName()+ " " + fuel.getPrice() + "");

        if(editFuelPriceService.editFuel(fuel)){
            model.addAttribute("message", "edition successfully");
            model.addAttribute("version", "gas");

            return "redirect:/gasStation";
        }

        return "error";
    }
}
