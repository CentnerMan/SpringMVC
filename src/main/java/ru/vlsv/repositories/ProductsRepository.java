package ru.vlsv.repositories;

import org.springframework.stereotype.Component;
import ru.vlsv.models.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * GeekBrains Java, SpringMVC.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 20.10.2019
 * @link https://github.com/Centnerman
 */

@Component
public class ProductsRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Чемодан", 1000));
        products.add(new Product(2L, "Сундук", 2000));
        products.add(new Product(3L, "Портфель", 3000));
        products.add(new Product(4L, "Кошёлка", 1000));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
