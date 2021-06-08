package repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public interface IRepository<T,K> {
    public void create(T model);
    public void delete(K id);
    public T get(K id);
    public void update(T model);
    public Collection<T> getAll();
}
