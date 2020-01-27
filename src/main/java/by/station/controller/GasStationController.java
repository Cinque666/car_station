package by.station.controller;

import by.com.entity.RSSEntity;
import by.station.service.CarWashingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/gasStation")
public class GasStationController {

    @Autowired
    private CarWashingService carWashingService;

    @RequestMapping(method = RequestMethod.GET)
    public String getHomePage(Model model){

        List<RSSEntity> rssEntityList = carWashingService.getNews();

        model.addAttribute("rss", rssEntityList);
        model.addAttribute("version","gas");

        return "gasStation";
    }
}
