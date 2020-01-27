package by.station.repository;

import by.com.entity.RSSEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RSSEntityRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public List<RSSEntity> getNews() {
        return sessionFactory.getCurrentSession()
                .createQuery("from RSSEntity", RSSEntity.class)
                .setMaxResults(6)
                .list();
    }
}
