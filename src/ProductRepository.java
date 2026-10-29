import java.util.List;

/**
 * Метод для поиска продукта по его ID
 * @author Kogay K.V.
 */
public interface ProductRepository {
    Product findProduct(Long id);
}
