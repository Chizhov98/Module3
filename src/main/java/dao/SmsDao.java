package dao;

import entity.Customer;
import entity.logEntity.SmsLog;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class SmsDao extends DefaultDao{

    public SmsLog findSmsByTextPart(String text){
        SmsLog sms = null;
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "FROM SmsLog WHERE text LIKE %:text% Limit 1";
            Query query = session.createQuery(hql);
            query.setParameter("text",text);
            sms = (SmsLog) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return sms;
    }
}
