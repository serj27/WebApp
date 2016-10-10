package DAO;

import DTO.UserDTO;
import Hibernate.DataUser;
import DTO.Entity;

import java.util.List;

/**
 * Created by serjd on 06.10.2016.
 */
public interface Dao<K,T extends Entity<K>>  {

    public List<T> getUsers();
    public void addUser(DataUser dataUser);
    public void deleteUser (Integer key);
    public DataUser getUserById (Integer id);
    public DataUser getUserByEmail (String email);
    void addUser(UserDTO userDTO);
}