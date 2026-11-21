public class Product {
    private final Long id;
    private final String name;
    private final int price1;

    public Product(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price1 = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price1 +
                '}';
    }
}
