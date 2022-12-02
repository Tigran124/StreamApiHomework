public class Product {
    int price;
    String name;
    Category category;

    public Product(int price, String name, Category category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "price=" + price;
    }
}
