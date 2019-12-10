package by.station.repository;

import by.com.entity.Fuel;
import by.station.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FuelRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Fuel> getAllFuels(){
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_FROM_FUEL.getQuery(), Fuel.class)
                .list();
    }
}
