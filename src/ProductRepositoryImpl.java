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
    public Product removeProduct(Long id) {
        Product removeProduct = null;
        removeProduct = productList.stream()
                .filter(e-> e.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException(id));
        productList.remove(removeProduct);
        return removeProduct;
    }
}
