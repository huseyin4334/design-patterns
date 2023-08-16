package com.patterns.solid.openClosed;


import com.patterns.solid.openClosed.enums.Color;
import com.patterns.solid.openClosed.enums.Size;
import com.patterns.solid.openClosed.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SolidApplication {

    private static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i<10; i++) {
            products.add(
              Product.builder()
                      .color(Color.values()[rand.nextInt(Color.values().length)])
                      .size(Size.values()[rand.nextInt(Size.values().length)])
                      .name("Product-" + i)
                      .build()
            );
        }
        return products;
    }

    private static void print(Product product) {
        System.out.println(product.toString());
    }

    public static void main(String[] args) throws Exception{

        List<Product> products = getProducts();

        // Old way
        System.out.println("Exp - 1 ---------------------");
        ProductFilter pf = new ProductFilter();
        pf.filterByColor(products, Color.BLACK)
                .forEach(p -> print((Product) p));


        // Open-Closed Principle
        System.out.println("\nExp - 2 ---------------------");
        OCPFilter f = new OCPFilter();
        f.filter(products, new ColorSpecification(Color.BLACK))
                .forEach(p -> print((Product) p));


        // Multi filtered through OCP
        System.out.println("\nExp - 3 ---------------------");
        f.filter(
                products,
                new OrSpecification<>(
                        new ColorSpecification(Color.BLACK),
                        new ColorSpecification(Color.GREEN)
                )
        ).forEach(p -> print((Product) p));

        System.out.println("\nExp - 4 ---------------------");
        f.filter(
                products,
                new AndSpecification<>(
                        new ColorSpecification(Color.BLACK),
                        new SizeSpecification(Size.LARGE)
                )
        ).forEach(p -> print((Product) p));
    }
}
