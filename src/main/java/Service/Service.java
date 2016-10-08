package Service;

import DTO.UserDTO;
import Model.User;

/**
 * Created by serjd on 06.10.2016.
 */
public interface Service<K,T> {

    void saveUser (Integer key);
    void deleteUser (Integer key);
    User getUser(String email);
    void saveUser(UserDTO userDTO);
}
