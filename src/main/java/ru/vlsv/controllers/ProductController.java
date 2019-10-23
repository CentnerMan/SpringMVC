package ru.vlsv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping("/addProduct")
    public String formAddProductShow(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "products-form";
    }

//    @RequestMapping("/addProductProcess")
//    public String formAddProductProcess(@ModelAttribute("product") Product product) {
//        productsService.saveProduct(product);
//        return "redirect:/products/showAllProducts";
//    }
//
//    @RequestMapping(path="/showProductsById", method= RequestMethod.GET)
//    public String showProductsById(Model model, @RequestParam Long id) {
//        Product product = productsService.getProductById(id);
//        model.addAttribute("product", product);
//        return "product-form-result";
//    }
//
//    @GetMapping("/showAllProducts")
//    public String showAllProducts(Model model) {
//        model.addAttribute("products", productsService.getAllProducts());
//        return "products-list";
//    }

}
