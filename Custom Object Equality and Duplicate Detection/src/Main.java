import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<Product>();
        productList.add(new Product(101L, "Laptop", "Electronics", 55000.0));
        productList.add(new Product(102L, "Mouse", "Electronics", 800.0));
        productList.add(new Product(103L, "Keyboard", "Electronics", 1500.0));
        productList.add(new Product(101L, "Gaming Laptop", "Electronics", 65000.0));
        productList.add(new Product(104L, "Chair", "Furniture", 4000.0));
        productList.add(new Product(105L, "Desk", "Furniture", 7000.0));
        productList.add(new Product(102L, "Wireless Mouse", "Electronics", 1200.0));
        productList.add(new Product(106L, "Headphones", "Accessories", 2000.0));
        productList.add(new Product(103L, "Mechanical Keyboard", "Electronics", 3000.0));
        productList.add(new Product(107L, "Monitor", "Electronics", 12000.0));

        ProductService products=new ProductService();

        Set<Product> uniqueProducts=new HashSet<Product>();
        uniqueProducts.addAll(productList);
//        products.storeProduct(productList);
     System.out.println(uniqueProducts.toString());
        Set<Product> duplicates = products.getDuplicates(productList);

        System.out.println("Duplicate products:");
        duplicates.forEach(System.out::println);

    }
}