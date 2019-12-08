package by.station.repository;

import by.com.entity.AppUser;
import by.station.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppUserRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(AppUser user) {
        sessionFactory.getCurrentSession()
                .save(user);
    }

    public Integer findUserCountByLogin(String username) {
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_FROM_APPUSER_WHERE_LOGIN.getQuery(), AppUser.class)
                .setParameter("param", username)
                .list()
                .size();
    }

    public AppUser findUserByLogin(String username) {
        try {
            return sessionFactory.getCurrentSession()
                    .createQuery(Query.SELECT_FROM_APPUSER_WHERE_LOGIN.getQuery(), AppUser.class)
                    .setParameter("param", username)
                    .getSingleResult();
        } catch (Exception e) {

            return null;
        }
    }
}
