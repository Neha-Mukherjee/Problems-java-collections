public class Product {
    private Long productId;
    private String productName;
    private String category;
    private Double price;

    public Product(Long productId, String productName, String category, Double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return productId + " " + productName + " " + category + " " + price;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId.equals(product.productId);

    }
    @Override
    public int hashCode() {
        return productId.hashCode();
    }

}
