package by.station.repository;

import by.com.entity.ContactUs;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactUsRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(ContactUs contactUs) {
        sessionFactory.getCurrentSession()
                .save(contactUs);
    }
}
