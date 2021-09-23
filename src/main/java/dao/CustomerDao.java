package dao;

import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;


public class CustomerDao extends DefaultDao {

    public Customer read(String id) {
        Customer customer = new Customer();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            customer = session.get(Customer.class, id);
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
            Customer entity = session.get(Customer.class, id);
            session.delete(entity);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
