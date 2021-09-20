package dao;

import entity.Customer;
import entity.logEntity.CustomerLog;
import entity.logEntity.TypeOfService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import javax.persistence.Query;

public class CustomerLogDao extends DefaultDao {
    public CustomerLog read(String id) {
        CustomerLog customer = new CustomerLog();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            customer = session.get(CustomerLog.class, id);
            transaction.commit();
            return customer;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
        return customer;
    }

    public void delete(String id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            CustomerLog entity = session.get(CustomerLog.class, id);
            session.delete(entity);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public TypeOfService getMostPopularService() {
        Transaction transaction = null;
        TypeOfService type = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "select typeOfService from CustomerLog where typeOfService in (select max from CustomerLog Group by typeOfService)";
            Query query = session.createQuery(hql);
            type = (TypeOfService) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return type;
    }

    public int getCountOfService(TypeOfService type, Customer customer ){

        Transaction transaction = null;
        int result = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "select count(*) from CustomerLog where typeOfService =:type AND customer = :customer";
            Query query = session.createQuery(hql);
            query.setParameter("type",type);
            query.setParameter("customer", customer);
            result = query.getFirstResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return result;
    }
}
