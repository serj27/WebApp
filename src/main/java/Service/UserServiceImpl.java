package Service;

import DAO.Dao;
import DAO.DaoFactory;
import DTO.UserDTO;
import Hibernate.DataUser;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by serjd on 06.10.2016.
 */
@org.springframework.stereotype.Service
public class UserServiceImpl implements Service {

    private static UserServiceImpl service;
    @Autowired
    private Dao<Integer, User> userDao;

    private UserServiceImpl() throws NoSuchAlgorithmException {
        userDao = DaoFactory.getInstance().getUserDao();
    }

    public static synchronized UserServiceImpl getInstance() throws NoSuchAlgorithmException {
        if (service == null){
            service = new UserServiceImpl();
        }
        return service;
    }

    @Transactional
    public List<User> getUser() {
        return userDao.getUsers();
    }

    @Transactional
    public void addUser(DataUser dataUser) {
    userDao.addUser(dataUser);
    }
    @Transactional
    public void deleteUser(Integer key) {
    userDao.deleteUser(key);
    }

    public DataUser getUserByEmail(String email) {
        DataUser dataUser = new DataUser();
        dataUser.setEmail(email);

        return dataUser;
    }

    public DataUser getById(Integer id) {
        return userDao.getUserById(id);
    }
    @Transactional
    public void addUser(UserDTO userDTO) {
        userDao.addUser(userDTO);
    }


}
