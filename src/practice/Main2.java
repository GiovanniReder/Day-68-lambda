package practice;

import practice.entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("--------------PRODOTTI-------------");
        Product prodotto1= new Product(1L,120,"Bibbia","Books");
        Product prodotto2= new Product(2L,90,"Bibbia low price","Books");
        Product prodotto3= new Product(3L,150,"Bibbia premium","Books");
        Product prodotto4= new Product(4L,20,"vangelo","Books");
        Product prodotto5= new Product(5L,40,"Bibbia starter pack","Books");
        Product prodotto6= new Product(6L,10,"Ciuccio","Baby");
        Product prodotto7= new Product(7L,5,"Biberon","Baby");
        Product prodotto8= new Product(8L,30,"Peluche","Baby");
        Product prodotto9= new Product(9L,7,"Pannolino","Baby");
        Product prodotto10= new Product(10L,40,"Sniper rifle","Boys");
        Product prodotto11= new Product(11L,40,"Shotgun","Boys");


        List<Product> prodotti=new ArrayList<>();
        List<Product> books=new ArrayList<>();
        List<Product> baby=new ArrayList<>();
        List<Product> boys=new ArrayList<>();




        prodotti.add(prodotto1);
        prodotti.add(prodotto2);
        prodotti.add(prodotto3);
        prodotti.add(prodotto4);
        prodotti.add(prodotto5);
        prodotti.add(prodotto6);
        prodotti.add(prodotto7);
        prodotti.add(prodotto8);
        prodotti.add(prodotto9);
        prodotti.add(prodotto10);
        prodotti.add(prodotto11);

        books.add(prodotto1);
        books.add(prodotto2);
        books.add(prodotto3);
        books.add(prodotto4);
        books.add(prodotto5);

        baby.add(prodotto6);
        baby.add(prodotto7);
        baby.add(prodotto8);
        baby.add(prodotto9);

        boys.add(prodotto10);
        boys.add(prodotto11);

        prodotti.forEach(System.out::println);


        Predicate<Double> isPriceLessThan100= price -> price < 100;
        Predicate<Product> isBooks= Prod -> Prod.getCategory() == "Books";

        Predicate<Product> isBoys= Prod -> Prod.getCategory() == "Boys";

        Supplier<Product> sconto= Prod -> (Prod.getPrice() / 10) * 10;






        prodotti.forEach(product -> System.out.println(isPriceLessThan100.test(product.getPrice()))  );
        books.forEach(product -> System.out.println(isBooks.test(product)));



    }
}
