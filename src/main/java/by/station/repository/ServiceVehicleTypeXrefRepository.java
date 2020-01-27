package by.station.repository;

import by.com.entity.ServiceVehicleTypeXref;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceVehicleTypeXrefRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<ServiceVehicleTypeXref> getAllServiceVehicleTypeXref() {
        return sessionFactory.getCurrentSession()
                .createQuery("from ServiceVehicleTypeXref", ServiceVehicleTypeXref.class)
                .list();
    }
}
