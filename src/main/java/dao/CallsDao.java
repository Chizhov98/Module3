package dao;

import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateUtil;


import java.util.ArrayList;
import java.util.List;

public class CallsDao extends DefaultDao {

    public List<Customer> getTopFifeUsers() {
        List<Customer> result = new ArrayList<>();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "SELECT caller FROM Calls WHERE caller IN (SELECT caller, count(id) c FROM Calls GROUP BY caller ORDER BY c DESC Limit 5)";
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
        return super.getCountOfRows("Calls");
    }
}
