package ru.vlsv.models;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * GeekBrains Java, SpringMVC.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 20.10.2019
 * @link https://github.com/Centnerman
 */

public class Product {
    private int id;
    private String title;
    private long coast;

    public Product() {
    }

    public Product(int id, String title, long coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCoast() {
        return coast;
    }

    public void setCoast(long coast) {
        this.coast = coast;
    }
}
