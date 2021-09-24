package dao;

import entity.Customer;
import entity.DeviceTypes;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateUtil;


import java.util.ArrayList;
import java.util.List;

public class InternetDao extends DefaultDao {
    public List<Customer> getTopFifeUsers() {
        List<Customer> result = new ArrayList<>();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "FROM Customer WHERE id IN ( SELECT user.id FROM Internet as i GROUP BY user ORDER BY count(i.id) DESC)";
            Query query = session.createQuery(hql);
            query.setMaxResults(5);
            result = query.list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return result;
    }

    public DeviceTypes getTopUsingDevice() {
        DeviceTypes result = null;
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "SELECT device FROM Internet GROUP BY device ORDER BY count(id) DESC";
            Query query = session.createQuery(hql);
            query.setMaxResults(1);
            result = (DeviceTypes) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return result;
    }

    public int getCountOfRows() {
        return super.getCountOfRows("Internet");
    }


}
