package practice.entities;

public class Product {
   private Long id;
   private String name;
   private static String category;
   private double price;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public String getCategory() {
      return this.category;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Product(Long id, double price, String name, String category) {
      this.id = id;
      this.price = price;
      this.name = name;
      this.category = category;
   }

}
