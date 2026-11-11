import java.util.Comparator;
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
    public Product findMaxProduct() {
        Product maxProduct = productList.stream()
                .max(Comparator.comparing(e-> e.getPrice()))
                .orElseThrow(() -> new IllegalArgumentException("Max price not found"));
        return maxProduct;
    }

    @Override
    public Product findMinProduct() {
        Product minProduct = productList.stream()
                .min(Comparator.comparing(e-> e.getPrice()))
                .orElseThrow(() -> new IllegalArgumentException("Min product not found"));
        return minProduct;
    }

}
