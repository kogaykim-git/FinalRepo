import java.util.List;

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
}
