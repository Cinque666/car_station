package by.station.service;

import by.com.entity.CarWash;
import by.com.entity.Order;
import by.com.entity.Person;
import by.com.entity.VehicleType;
import by.station.repository.CarWashRepository;
import by.station.repository.OrderRepository;
import by.station.repository.PersonRepository;
import by.station.repository.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class WashRegistrationService {

    private CarWashRepository carWashRepository;
    private PersonRepository personRepository;
    private VehicleTypeRepository vehicleTypeRepository;
    private OrderRepository orderRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Autowired
    public void setCarWashRepository(CarWashRepository carWashRepository) {
        this.carWashRepository = carWashRepository;
    }

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Autowired
    public void setVehicleTypeRepository(VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @Transactional
    public List<CarWash> getAllCarWashes(){
        return carWashRepository.getAllCarWashes();
    }

    @Transactional
    public List<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }

    @Transactional
    public List<VehicleType> getAllVehicles() {
        return vehicleTypeRepository.getAllVehicles();
    }

    @Transactional
    public CarWash getCarWashByName(String carWashName) {
        return carWashRepository.getCarByName(carWashName);
    }

    @Transactional
    public Person getClientByName(String clientName) {
        return personRepository.getPersonByName(clientName);
    }

    @Transactional
    public Person getMasterByName(String masterName) {
        return personRepository.getPersonByName(masterName);
    }

    @Transactional
    public VehicleType getVehicleByName(String vehicleName) {
        return vehicleTypeRepository.getVehicleTypeByName(vehicleName);
    }

    @Transactional
    public void addOrder(Order order) {
        orderRepository.saveOrder(order);
    }
}
