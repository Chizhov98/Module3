package dao;

import entity.Customer;
import entity.Sms;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class SmsDao extends DefaultDao {

    public Sms findSmsByTextPart(String text) {
        Sms sms = null;
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "FROM Sms WHERE message LIKE %:text% Limit 1";
            Query query = session.createQuery(hql);
            query.setParameter("text", text);
            sms = (Sms) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return sms;
    }

    public List<Customer> getTopFifeUsers() {
        List<Customer> result = new ArrayList<>();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "SELECT writer FROM Sms WHERE writer IN (SELECT count(id) c, writer FROM Sms GROUP BY writer ORDER BY c DESC Limit 5)";
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

    public int getCountOfRows() {
        return super.getCountOfRows("Sms");
    }
}
