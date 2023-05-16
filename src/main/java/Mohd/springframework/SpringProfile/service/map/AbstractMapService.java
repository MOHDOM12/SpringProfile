package Mohd.springframework.SpringProfile.service.map;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public abstract class AbstractMapService <T ,Long>{

    protected Map<ID,T> map = new HashMap<>();

    Set<T> findAll()
    {
        return  new HashSet<>(map.values());
    }
    T findById(ID Id)
    {
        return map.get(Id);
    }

    T save(ID Id, T object)
    {
        map.put(Id, object);
        return  object;
    }
    void  deleteById(ID Id) {
        map.remove(Id);
    }

    void delete(T object)
    {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public abstract void deleteById(java.lang.Long Id);
}
