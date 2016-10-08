package DAO;

import Hibernate.DataUser;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by serjd on 06.10.2016.
 */
@Transactional
@Repository
public class UserDaoImpl implements Dao {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<DataUser> getUser() {
        return sessionFactory.getCurrentSession().createCriteria(DataUser.class).list();
    }

    public void addUser(DataUser user) {
        sessionFactory.getCurrentSession().save(user);

    }



    public void deleteUser(Integer key) {
        DataUser user = (DataUser) sessionFactory.getCurrentSession().load(DataUser.class,key);
        if(null != user) {
            sessionFactory.getCurrentSession().delete(user);
        }
    }

    public DataUser getUserbyId(Integer id) {
        return (DataUser)sessionFactory.getCurrentSession().get(DataUser.class, id);
    }

    public DataUser getUserByEmail(String email) {
        DataUser user = new DataUser(email);
        try {
            Criteria criteria = sessionFactory.getCurrentSession().createCriteria(DataUser.class);
            criteria.add(Restrictions.eq("email", email));
            return (DataUser) criteria.uniqueResult();
        } catch (Exception e) {
            return null;
        }
    }
}
