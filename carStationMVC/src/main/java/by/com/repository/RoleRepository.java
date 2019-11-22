package by.com.repository;

import by.com.entity.Role;
import by.com.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public Role getRoleById(int id){
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_FROM_ROLE_WHERE_ID.getQuery(), Role.class)
                .setParameter("param", id)
                .getSingleResult();
    }
}
