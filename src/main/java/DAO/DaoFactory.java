package DAO;

import Model.User;

import java.security.NoSuchAlgorithmException;

/**
 * Created by serjd on 06.10.2016.
 */
public class DaoFactory {

    private static DaoFactory instance = null;
    private Dao<Integer, User> userDao;



    public static DaoFactory getInstance() throws NoSuchAlgorithmException {
        if (instance == null) {
            instance = new DaoFactory();
        }
        return instance;
    }



    public static void setInstance(DaoFactory instance) {
        DaoFactory.instance = instance;
    }

    public Dao<Integer, User> getUserDao() {
        return userDao;
    }

    public void setUserDao(Dao<Integer, User> userDao) {
        this.userDao = userDao;
    }
}
