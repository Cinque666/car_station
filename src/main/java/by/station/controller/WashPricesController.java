package by.station.controller;

import by.com.entity.ServiceVehicleTypeXref;
import by.com.entity.VehicleType;
import by.station.controller.util.WashPrices;
import by.station.service.WashPricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/washPrices")
public class WashPricesController {

    private WashPricesService washPricesService;

    @Autowired
    public void setWashPricesService(WashPricesService washPricesService) {
        this.washPricesService = washPricesService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getWashPrices(Model model){

        List<VehicleType> vehicles = washPricesService.getAllVehicleTypes();
        List<ServiceVehicleTypeXref> serviceVehicleTypeXrefs = washPricesService.getAllServiceVehicleTypeXref();
        List<WashPrices> washPrices = new ArrayList<>();

        for(VehicleType vehicleType: vehicles){
            WashPrices washPrice = new WashPrices();
            washPrice.setWashPricesId(vehicleType.getVehicleTypeId());

            for(ServiceVehicleTypeXref serviceVehicleTypeXref: serviceVehicleTypeXrefs){
                if(vehicleType.getVehicleTypeId() == serviceVehicleTypeXref.getVehicleTypeId()){
                    washPrice.setVehicleType(vehicleType.getName());
                    washPrice.setCost(serviceVehicleTypeXref.getPrice());
                }
            }
            washPrices.add(washPrice);
        }

        model.addAttribute("washPrices", washPrices);
        model.addAttribute("version", "wash");
        return "washPrices";
    }
}
