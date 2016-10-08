package Model;

/**
 * Created by serjd on 06.10.2016.
 */
public class Entity<T> {

    private T id;

    public T getId(){
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity) ) return false;

        Entity<?> entity = (Entity<?>) o;

        return getId().equals(entity.getId());

    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
