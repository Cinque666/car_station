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

    public Fuel getFuelById(Integer id) {
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_FROM_FUEL_WHERE_FUELID.getQuery(), Fuel.class)
                .setParameter("param", id)
                .getSingleResult();
    }

    public void overrideFuel(Fuel fuel) {
        sessionFactory.getCurrentSession()
                .saveOrUpdate(fuel);
    }

    public void deleteFuelById(Integer id) {
        Fuel fuel = new Fuel();
        fuel.setFuelId(id);
        sessionFactory.getCurrentSession().delete(fuel);
    }
}
