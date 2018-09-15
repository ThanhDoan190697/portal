package example.repository;

import com.portal.common.util.HibernateUtil;
import com.sun.corba.se.impl.orbutil.closure.Constant;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;


public class HibernateRepositoryImpl<ID extends Serializable,T> implements HibernateRepository<ID,T> {
    private Class<T> persistenceClassName;
    public HibernateRepositoryImpl(){
        this.persistenceClassName = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    private  String getPersistenceClassName(){
        return  persistenceClassName.getSimpleName();
    }
    public List<T> findAll() {
        Transaction transaction = null;
        List<T> listResul = new ArrayList<>();
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
                transaction = session.beginTransaction();
            StringBuilder sql =  new StringBuilder(" FROM ");
            sql.append(getPersistenceClassName());
            Query query = (Query) session.createQuery(sql.toString());
           // listResul = queue.getResulList();
            transaction.commit();

        }catch (HibernateException e){
            transaction.rollback();

        }

        return listResul;
    }

    @Override
    public T finById(ID id) {
        T t = null;
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
                transaction = session.beginTransaction();
                t = session.find(persistenceClassName,id);
                transaction.commit();

        }catch ( HibernateException e){
            transaction.rollback();
        }
        return t;
    }

    @Override
    public ID save(T t) {
        ID id = null;
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            id = (ID)session.save(t);
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
        }
        return id;
    }

    @Override
    public void update(T t) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            session.update(t);
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
        }
    }

    @Override
    public void delete(ID id) {
        Transaction transaction =null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()){
            transaction = session.beginTransaction();
            session.find(persistenceClassName,id);
            session.delete(id);
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
        }
    }

    @Override
    public List<T> findByProperty(String prooerty, Object value, String sortExpression, String sortDriecttion) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()){
            transaction = session.beginTransaction();
        StringBuilder sql = new StringBuilder(" FROM ");
        sql.append(getPersistenceClassName());
        if (prooerty !=null){
            sql.append("WHERE").append(prooerty).append(" :=value");
        }
        Query query =  session.createQuery(sql.toString());
        if (value !=null){
        }
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
        }
        return null;
    }


}
