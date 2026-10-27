import java.util.List;

public class ProductRepository {
    private List<Product> productList;

    public ProductRepository(List<Product> productList) {
        this.productList = productList;
    }

    Product findProduct(Long id) {
        Product findProduct = productList.stream()
                .filter(e -> e.getId() == id)
                .findFirst().get();
        return findProduct;
    }
}
