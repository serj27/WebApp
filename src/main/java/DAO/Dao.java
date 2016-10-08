package DAO;

import Model.Entity;

/**
 * Created by serjd on 06.10.2016.
 */
public interface Dao<K,T extends Entity<K>>  {

    void saveUser(Integer key);
    void deleteUser (Integer key);
}