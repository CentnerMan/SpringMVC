package ru.vlsv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vlsv.models.Product;
import ru.vlsv.repositories.ProductsRepository;

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
public class ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Product getProductById(int id) {
        Product product = productsRepository.getProductById(id);
        return product;
    }

    public Object getAllProducts() {
        List<Product> products=new ArrayList<>();
        return products;
    }

    public void saveProduct(Product product) {

    }
}
