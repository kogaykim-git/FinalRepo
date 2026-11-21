import java.util.List;

/**
 * Поиск пользователя по id
 * @return product
 * @throws ProductNotFoundException
 */
public interface ProductRepository {
    Product findProduct(Long id);

    Product findMaxProduct();

    Product findMinProduct();

    /**
     * Поиск средней цены среди всех продуктов
     * @return Product
     */
    double findAveragePrice();

    void devA();
}
