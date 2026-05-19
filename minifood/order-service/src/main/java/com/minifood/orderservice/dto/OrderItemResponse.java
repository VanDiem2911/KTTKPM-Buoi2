package com.minifood.orderservice.dto;

public class OrderItemResponse {
    private Long id;
    private String name;
    private double price;
    private int quantity;

    public OrderItemResponse(Long id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}
