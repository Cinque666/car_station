package by.station.controller;

import by.com.entity.CarWash;
import by.com.entity.Order;
import by.com.entity.Person;
import by.com.entity.VehicleType;
import by.station.controller.util.WashOrder;
import by.station.service.WashRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/washCar")
public class WashRegistrationController {

    private WashRegistrationService washRegistrationService;

    @Autowired
    public void setWashRegistrationService(WashRegistrationService washRegistrationService) {
        this.washRegistrationService = washRegistrationService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getWashRegistrationPage(Model model){

        List<CarWash> washes = washRegistrationService.getAllCarWashes();
        List<Person> persons = washRegistrationService.getAllPersons();
        List<Person> needToDeletePerson = new ArrayList<>(persons);
        List<Person> stuff = deleteClients(needToDeletePerson);
        List<VehicleType> vehicles = washRegistrationService.getAllVehicles();

        model.addAttribute("washes", washes);
        model.addAttribute("masters", stuff);
        model.addAttribute("vehicles", vehicles);
        model.addAttribute("clients", persons);
        model.addAttribute("version", "wash");
        return "washRegistration";
    }

    @PostMapping
    public String addWashOrder(@ModelAttribute WashOrder washOrder, Model model){

        CarWash carWash = washRegistrationService.getCarWashByName(washOrder.getCarWashName());
        Person client = washRegistrationService.getClientByName(washOrder.getClientName());
        Person master = washRegistrationService.getMasterByName(washOrder.getMasterName());
        VehicleType vehicleType = washRegistrationService.getVehicleByName(washOrder.getVehicleName());

        Order order = new Order();

        System.out.println(order.getOrderId() + " " + carWash.getCarWashId() + " " + client.getPersonId() + " " + master.getPersonId() + " " + vehicleType.getVehicleTypeId());

        order.setCarWashId(carWash.getCarWashId());
        order.setClientId(client.getPersonId());
        order.setMasterId(master.getPersonId());
        order.setVehicleTypeId(vehicleType.getVehicleTypeId());

        washRegistrationService.addOrder(order);

        model.addAttribute("version", "wash");

        return "carWashing";
    }

    private List<Person> deleteClients(List<Person> persons){
        Iterator iterator = persons.iterator();

        while (iterator.hasNext()) {
            Person element = (Person) iterator.next();
            if (element.getPositionId() == null) {
                iterator.remove();
            }
        }
        return persons;
    }
}
