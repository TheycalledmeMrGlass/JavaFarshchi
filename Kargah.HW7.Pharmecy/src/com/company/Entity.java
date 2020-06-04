package com.company;

public class Entity {
    private int id;
    private String name,price,category;

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPrice() { return price; }
    public String getCategory() { return category; }
    public Entity setId(int id){ this.id=id;return this;}
    public Entity setName(String name){ this.name=name;return this; }
    public Entity setPrice(String price){this.price=price; return this;}
    public Entity setCategory(String category){this.category=category;return this;}
}
