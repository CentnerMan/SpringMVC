package ru.vlsv.models;

/**
 * GeekBrains Java, SpringMVC.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 20.10.2019
 * @link https://github.com/Centnerman
 */

public class Product {
    private Long id;
    private String title;
    private int cost;

    public Product() {
    }

    public Product(Long id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
