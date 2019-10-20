package ru.vlsv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vlsv.models.Product;
import ru.vlsv.services.ProductsService;

/**
 * GeekBrains Java, SpringMVC.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 20.10.2019
 * @link https://github.com/Centnerman
 */

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/showAllProducts")
    public String showSimpleForm(Model model) {
        Product product = new Product();
        model.addAttribute("products", productsService.getAllProducts());
        return "products-list";
    }

    @RequestMapping("/formAddProductShow")
    public String formAddProductShow(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "product-form";
    }

    @RequestMapping("/formAddProductProcess")
    public String formAddProductProcess(@ModelAttribute("product") Product product){
    productsService.saveProduct(product);
        return "redirect:/product/showAllProducts";
    }

}
