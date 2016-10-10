package Service;

import DTO.UserDTO;
import Hibernate.DataUser;

import java.util.List;

/**
 * Created by serjd on 06.10.2016.
 */
public interface Service<K,T> {

    public List<T> getUser();
    public void addUser (DataUser dataUser);
    public void deleteUser (Integer key);
    public DataUser getUserByEmail(String email);
    public DataUser getById (Integer id);
    void addUser(UserDTO userDTO);
}
