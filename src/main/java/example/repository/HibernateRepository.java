package example.repository;

import java.io.Serializable;
import java.util.List;

public interface HibernateRepository<ID extends Serializable,T> {
    List<T> findAll();
    T finById(ID id);
    ID save(T t);
    void update(T t);
    void  delete(ID id);
    List<T> findByProperty(String prooerty,Object value,String sortExpression,String sortDriecttion);
}
