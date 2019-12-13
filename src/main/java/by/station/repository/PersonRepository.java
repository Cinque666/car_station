package by.station.repository;

import by.com.entity.Person;
import by.station.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Person> getAllPersons() {
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_FROM_PERSON.getQuery(), Person.class)
                .list();
    }

    public Person getPersonByName(String clientName) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Person where name like :param", Person.class)
                .setParameter("param", clientName)
                .getSingleResult();
    }
}
