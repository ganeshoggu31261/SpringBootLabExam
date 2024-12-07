package com.klef.jfsd.springboot.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    private int orderId;

    private String productName;
    private int quantity;
    private LocalDate orderDate;
    private String customerName;

   
    public int getOrderId() { 
    	return orderId;
    	}
    public void setOrderId(int orderId) 
    {
    	this.orderId = orderId;
    }

    public String getProductName() 
    {
    	return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
}
