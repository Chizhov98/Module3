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
            String hql = "SELECT user FROM Interner WHERE user IN (SELECT count(id) c, user FROM Internet GROUP BY user ORDER BY c DESC Limit 5)";
            Query query = session.createQuery(hql);
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
            String hql = "SELECT device FROM Interner WHERE device IN (SELECT device, count(id) mycount FROM Internet GROUP BY device ORDER BY mycount DESC Limit 1)";
            Query query = session.createQuery(hql);
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
