package ru.vlsv.repositories;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vlsv.models.Customer;
import ru.vlsv.models.Product;

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
public class CustomersRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public CustomersRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void create(Customer customer) {
        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();

        em.persist(customer);

        em.getTransaction().commit();
        em.close();
    }

    public void update(Customer customer) {
        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();

        em.merge(customer);

        em.getTransaction().commit();
        em.close();
    }

    public List<Customer> findAll() {
        EntityManager em = sessionFactory.createEntityManager();

        List<Customer> customer = em.createQuery("from Customer ", Customer.class).getResultList();
        em.close();
        return customer;
    }
}
