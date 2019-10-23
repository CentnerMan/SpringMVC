package ru.vlsv.repositories;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.vlsv.models.Product;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

/**
 * GeekBrains Java, SpringMVC.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 20.10.2019
 * @link https://github.com/Centnerman
 */

@Service
public class ProductsRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public ProductsRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void create(Product product) {
        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();

        em.persist(product);

        em.getTransaction().commit();
        em.close();
    }

    public void update(Product product) {
        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();

        em.merge(product);

        em.getTransaction().commit();
        em.close();
    }

    public List<Product> findAll() {
        EntityManager em = sessionFactory.createEntityManager();

        List<Product> product = em.createQuery("from Product", Product.class).getResultList();
        em.close();
        return product;
    }
//    private List<Product> products;
//    @PostConstruct
//    public void init() {
//        products = new ArrayList<>();
//        products.add(new Product(1L, "Чемодан", 1000));
//        products.add(new Product(2L, "Сундук", 2000));
//        products.add(new Product(3L, "Портфель", 3000));
//        products.add(new Product(4L, "Кошёлка", 1000));
//    }
//
//    public Product getProductById(Long id) {
//        for (Product product : products) {
//            if (product.getId().equals(id)) {
//                return product;
//            }
//        }
//        return null;
//    }
//
//    public List<Product> getAllProducts() {
//        return products;
//    }
//
//    public Product save(Product product) {
//        products.add(product);
//        return product;
//    }
}
