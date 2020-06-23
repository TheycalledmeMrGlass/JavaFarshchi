package com.company;

public class Entity {
    private int id;
    private String Name,Price,Category;

    public int getId() {
        return id;
    }

    public Entity setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return Name;
    }

    public Entity setName(String name) {
        Name = name;
        return this;
    }

    public String getPrice() {
        return Price;
    }

    public Entity setPrice(String price) {
        Price = price;
        return this;
    }

    public String getCategory() {
        return Category;
    }

    public Entity setCategory(String category) {
        Category = category;
        return this;
    }
}
