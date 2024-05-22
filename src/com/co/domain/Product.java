package com.co.domain;

public class Product {
  private int id;
  private String name;
  private double price;
  private static int count;

  private Product() {
    this.id = count + 1;
    count++;
  }

  public Product(String name, double price) {
    this();
    this.name = name;
    this.price = price;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", name='" + getName() + "'" +
        ", price='" + getPrice() + "'" +
        "}";
  }

}
