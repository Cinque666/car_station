package by.station.repository;

import by.com.entity.Role;
import by.station.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public List<Role> getAllRoles(){
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_FROM_ROLE.getQuery(), Role.class)
                .list();
    }

    public Role getRoleByName(String role) {
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_FROM_ROLE_WHERE_NAME_LIKE.getQuery(), Role.class)
                .setParameter("param", role)
                .getSingleResult();
    }
}
