package DAO;

import Hibernate.DataUser;
import Model.Entity;

import java.util.List;

/**
 * Created by serjd on 06.10.2016.
 */
public interface Dao<K,T extends Entity<K>>  {

    public List<T> getUser();
    public void addUser(DataUser user);
    public void deleteUser (Integer key);
    public DataUser getUserbyId (Integer id);
    public DataUser getUserByEmail (String email);
}