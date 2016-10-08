package Service;

import DAO.Dao;
import DAO.DaoFactory;
import DTO.UserDTO;
import Model.User;

import java.security.NoSuchAlgorithmException;

/**
 * Created by serjd on 06.10.2016.
 */
public class UserServiceImpl implements Service<Integer, UserDTO> {

    private static UserServiceImpl service;
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


    public void saveUser(Integer key) {

    }

    public void deleteUser(Integer key) {

    }

    public User getUser(String email) {
        User user = new User();
        user.setEmail(email);

        return user;
    }

    public void saveUser(UserDTO userDTO) {

    }
}
