package practice.entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
   private long id;
   private String status;
   private LocalDate orderDate;
   private LocalDate deliveryDate;
   private List<Product> products;
   private Customer customer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(Customer customer, List<Product> products, LocalDate deliveryDate, LocalDate orderDate, String status, long id) {
        this.customer = customer;
        this.products = products;
        this.deliveryDate = deliveryDate;
        this.orderDate = orderDate;
        this.status = status;
        this.id = id;
    }
}
