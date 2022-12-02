public class Product {
    int price;
    String name;
    Category category;

    public Product(int price, String name, Category category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "price=" + price;
    }
}
