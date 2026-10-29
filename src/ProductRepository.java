import java.util.List;

/**
 * Поиск пользователя по id
 * @return product
 * @throws ProductNotFoundException
 */
public interface ProductRepository {
    Product findProduct(Long id);
}
