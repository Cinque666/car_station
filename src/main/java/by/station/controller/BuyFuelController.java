package by.station.controller;

import by.com.entity.Dispenser;
import by.com.entity.GasStation;
import by.station.service.BuyFuelService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/buyFuel")
public class BuyFuelController {

    private BuyFuelService buyFuelService;

    @Autowired
    public void setBuyFuelService(BuyFuelService buyFuelService) {
        this.buyFuelService = buyFuelService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getBuyFuel(Model model){
        List<GasStation> gasStations = buyFuelService.getAllGasStations();

        model.addAttribute("gasStations", gasStations);
        model.addAttribute("version", "gas");

        return "buyFuel";
    }

    @RequestMapping("/getDispensers")
    public void getDispensers(HttpServletResponse response) throws IOException {

        Map<String, String> options = new LinkedHashMap<>();
        options.put("value1", "label1");
        options.put("value2", "label2");
        options.put("value3", "label3");
        String json = new Gson().toJson(options);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }
}
