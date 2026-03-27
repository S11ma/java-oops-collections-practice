//get product id,score, category. constraint is product should be not null, output: return products top 3 sorted by score//

import java.util.*;
import java.util.stream.*;

class Product {
    private int productId;
    private String category;
    private double score;

    public Product(int productId, String category, double score) {
        this.productId = productId;
        this.category = category;
        this.score = score;
    }

    public int getProductId() { return productId; }
    public String getCategory() { return category; }
    public double getScore() { return score; }
}

public class ProductService {

    public static List<Product> getTopProducts(List<Product> products) {

        if (products == null) {
            return Collections.emptyList();
        }

        return products.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Product::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Product(1, "A", 4.5),
                new Product(2, "B", 3.2),
                new Product(3, "C", 5.0),
                new Product(4, "D", 4.8)
        );

        List<Product> top = getTopProducts(list);

        for (Product p : top) {
            System.out.println(p.getProductId() + " " + p.getScore());
        }
    }
}