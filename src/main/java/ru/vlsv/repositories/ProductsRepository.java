package ru.vlsv.repositories;

import org.springframework.stereotype.Component;
import ru.vlsv.models.Product;
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
    public List<Product> products;

    public ProductsRepository() {
        products = new ArrayList<>();
    }

    public Product getProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return products;
    }

}
