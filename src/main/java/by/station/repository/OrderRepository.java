package by.station.repository;

import by.com.entity.Order;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public void saveOrder(Order order) {
        sessionFactory.getCurrentSession()
                .save(order);
    }

    public List<Order> getAllOrders() {
        return sessionFactory.getCurrentSession()
                    .createQuery("from Order", Order.class)
                    .list();
    }

    public void deleteOrder(Integer id) {
        Order order = new Order();
        order.setOrderId(id);
        sessionFactory.getCurrentSession()
                .delete(order);
    }
}
