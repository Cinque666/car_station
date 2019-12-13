package by.station.service;

import by.com.entity.Order;
import by.station.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DeleteWashOrderService {

    private OrderRepository orderRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public void deleteOrder(Integer id) {
        orderRepository.deleteOrder(id);
    }

    @Transactional
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }
}
