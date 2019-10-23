package ru.vlsv.repositories;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vlsv.models.Product;
import ru.vlsv.models.Purchase;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * GeekBrains Java, SpringMVC.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 24.10.2019
 * @link https://github.com/Centnerman
 */

@Service
public class PurchasesRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public PurchasesRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void create(Purchase purchase) {
        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();

        em.persist(purchase);

        em.getTransaction().commit();
        em.close();
    }

    public void update(Purchase purchase) {
        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();

        em.merge(purchase);

        em.getTransaction().commit();
        em.close();
    }

    public List<Purchase> findAll() {
        EntityManager em = sessionFactory.createEntityManager();

        List<Purchase> purchase = em.createQuery("from Purchase ", Purchase.class).getResultList();
        em.close();
        return purchase;
    }
}
