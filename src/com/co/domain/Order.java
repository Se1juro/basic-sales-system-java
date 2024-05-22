package com.co.domain;

public class Order {
  private int id;
  private final int MAX_PRODUCTS = 10;
  private Product[] products = new Product[MAX_PRODUCTS];
  private int productOrdered = 0;
  private static int count;

  public Order() {
    this.id = count + 1;
    count++;
  }

  public void addProduct(Product product) {
    if (this.productOrdered == MAX_PRODUCTS) {
      System.out.println("La lista esta llena");
      return;
    }
    this.products[productOrdered] = product;
    this.productOrdered++;
  }

  public double calcTotal() {
    double total = 0;
    for (int i = 0; i < products.length; i++) {
      if (products[i] == null)
        continue;
      double currentValue = this.products[i].getPrice();
      total += currentValue;
    }
    return total;
  }

  public void printOrder() {
    System.out.println("===============");
    System.out.println("Order Number ~ " + this.id);
    System.out.println("Products: \n");
    for (int i = 0; i < products.length; i++) {
      if (products[i] == null)
        continue;
      System.out.println(products[i].toString());
    }
    System.out.println("Total: " + this.calcTotal());
    System.out.println("===============");

  }

}
