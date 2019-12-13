package by.station.service;

import by.com.entity.CarWash;
import by.com.entity.Order;
import by.com.entity.Person;
import by.com.entity.VehicleType;
import by.station.controller.util.WashOrder;
import by.station.repository.CarWashRepository;
import by.station.repository.OrderRepository;
import by.station.repository.PersonRepository;
import by.station.repository.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class WashOrdersService {

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
    public List<WashOrder> getEntities() {

        List<CarWash> carWashes = carWashRepository.getAllCarWashes();
        List<Person> persons = personRepository.getAllPersons();
        List<VehicleType> vehicleTypes = vehicleTypeRepository.getAllVehicles();
        List<Order> orders = orderRepository.getAllOrders();
        List<WashOrder> washOrders = new ArrayList<>();

        for(Order order: orders){
            WashOrder washOrder = new WashOrder();
            washOrder.setWashOrderId(order.getOrderId());

            for(CarWash carWash: carWashes){
                if(order.getCarWashId() == carWash.getCarWashId()){
                    washOrder.setCarWashName(carWash.getName());
                }
            }

            for(Person person: persons){
                if(order.getClientId() == person.getPersonId()){
                    washOrder.setClientName(person.getName());
                }
                if(order.getMasterId() == person.getPersonId()){
                    washOrder.setMasterName(person.getName());
                }
            }

            for(VehicleType vehicleType: vehicleTypes){
                if(order.getVehicleTypeId() == vehicleType.getVehicleTypeId()){
                    washOrder.setVehicleName(vehicleType.getName());
                }
            }

            washOrders.add(washOrder);
        }
        return washOrders;
    }
}
