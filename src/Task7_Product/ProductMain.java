package Task7_Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many product you inserted?");
        int productCount = Integer.parseInt(sc.nextLine());
        int currentCount =0;
        while (currentCount<productCount){
            System.out.println("Name : ");
            String name = sc.nextLine();


            System.out.println("Count : ");
            int count = Integer.parseInt(sc.nextLine());

            System.out.println("Price : ");
            double price = Double.parseDouble(sc.nextLine());

            Product product = new Product(name,count,price);
            products.add(product);
            currentCount++;

        }
        //? stream olmasas itarable a gedir
        products.stream().forEach(p->p.setSalary(p.getCount()*p.getPrice()));

        for(Product p:products){
            System.out.println(p.toString());
        }
    }
}
