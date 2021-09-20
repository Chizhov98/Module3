package dao;

import entity.Customer;
import entity.DeviceTypes;
import entity.Order;
import entity.logEntity.TypeOfService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import javax.persistence.Query;

public class OrderDao extends DefaultDao {
    public Order read(String id) {
        Order order = new Order();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            order = session.get(Order.class, id);
            transaction.commit();
            return order;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
        return order;
    }

    public void delete(String id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Order entity = session.get(Order.class, id);
            session.delete(entity);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public DeviceTypes getMostPopularDevice() {
        Transaction transaction = null;
        DeviceTypes type = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "select deviceType from Order where deviceType in (select max from Order Group by deviceType)";
            Query query = session.createQuery(hql);
            type = (DeviceTypes) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return type;
    }
}
