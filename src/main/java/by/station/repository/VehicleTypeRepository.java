package by.station.repository;

import by.com.entity.VehicleType;
import by.station.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehicleTypeRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<VehicleType> getAllVehicles() {
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_FROM_VEHICLE_TYPE.getQuery(), VehicleType.class)
                .list();
    }

    public VehicleType getVehicleTypeByName(String vehicleName) {
        return sessionFactory.getCurrentSession()
                .createQuery("from VehicleType where name like :param", VehicleType.class)
                .setParameter("param", vehicleName)
                .getSingleResult();
    }
}
