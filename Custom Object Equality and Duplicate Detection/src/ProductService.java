
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductService {
    public void storeProduct(List<Product> product){
        System.out.println("Stored products");

        for (Product p : product){
            System.out.println(p);
        }
    }
  public static <Product> Set <Product> getDuplicates(List<Product> list){
        Set <Product> seen = new HashSet<Product>();
      Set <Product> duplicates = new HashSet<Product>();
        for (Product product : list){
            if (!seen.add(product)){
                duplicates.add(product);

            }
        }
        return duplicates;
  }
}
