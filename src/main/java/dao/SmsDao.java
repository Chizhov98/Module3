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

    public String findSmsByTextPart(String text) {
        String sms = null;
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "select message FROM Sms WHERE message LIKE :text";
            Query query = session.createQuery(hql);
            query.setMaxResults(1);
            query.setParameter("text", "%" + text + "%");
            sms = (String) query.list().get(0);
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
            String hql = "FROM Customer WHERE id IN ( SELECT writer_id.id FROM Sms as i GROUP BY writer_id ORDER BY count(i.id) DESC)";
            Query query = session.createQuery(hql);
            query.setMaxResults(5);
            query.setFirstResult(0);
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
