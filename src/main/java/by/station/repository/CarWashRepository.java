package by.station.repository;

import by.com.entity.CarWash;
import by.station.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarWashRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<CarWash> getAllCarWashes() {
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_FROM_CARWASH.getQuery(), CarWash.class)
                .list();
    }

    public CarWash getCarByName(String carWashName) {
        return sessionFactory.getCurrentSession()
                .createQuery("from CarWash where name like :param", CarWash.class)
                .setParameter("param", carWashName)
                .getSingleResult();
    }
}
