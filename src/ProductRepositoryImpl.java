import java.util.List;
import java.util.Optional;

public class ProductRepositoryImpl implements ProductRepository{
    private List<Product> productList;

    public ProductRepositoryImpl(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product findProduct(Long id) {
        Product findProduct = productList.stream()
                .filter(e-> e.getId() == id)
                .findFirst()
                .orElseThrow(()-> new ProductNotFoundException(id));
        return findProduct;
    }

    @Override
    public Product findMax() {
        int maxPrice = productList.stream()
                .mapToInt(e-> e.getPrice())
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Max product not found"));
        Optional<Product> maxProduct = productList.stream()
                .filter(e-> e.getPrice() == maxPrice)
                .findFirst();
        return maxProduct.get();
    }
}
