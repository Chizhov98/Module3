package dao;

import entity.Order;
import entity.Tariff;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class TariffDao extends DefaultDao {
    public Tariff read(String id) {
        Tariff tariff = new Tariff();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            tariff = session.get(Tariff.class, id);
            transaction.commit();
            return tariff;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
        return tariff;
    }

    public void delete(String id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Tariff entity = session.get(Tariff.class, id);
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
