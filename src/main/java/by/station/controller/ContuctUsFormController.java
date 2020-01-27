package by.station.controller;

import by.com.entity.ContactUs;
import by.station.constants.Const;
import by.station.service.ContuctUsFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("contactUs")
public class ContuctUsFormController {

    @Autowired
    private ContuctUsFormService contuctUsFormService;

    @RequestMapping(method = RequestMethod.GET)
    public String getContactUsForm(Model model){



        model.addAttribute("version", "wash");
        return "contuctUsForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String contactUsPost(@ModelAttribute ContactUs contactUs, Model model){
        if(contactUs.getEmail().matches(Const.REGEXP)) {
            contuctUsFormService.save(contactUs);
        }

        model.addAttribute("version", "gas");

        return "redirect:/gasStation";
    }
}
