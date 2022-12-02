import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(70,"name",Category.Book);
        Product product1 = new Product(80,"name",Category.Book);
        Product product2 = new Product(90,"name",Category.Book);
        Product product3 = new Product(100,"name",Category.Book);
        Product product4 = new Product(110,"name",Category.Book);
        Product product5 = new Product(120,"name",Category.Book);
        Product product6 = new Product(130,"name",Category.Baby);
        Product product7 = new Product(140,"name",Category.Baby);
        Product product8 = new Product(150,"name",Category.Baby);
        Product product9 = new Product(160,"name",Category.Baby);
        List<Product> productList = new LinkedList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);
        List<Product> bookList = new LinkedList<>();
        productList.stream().filter(x -> x.category == Category.Book)
                .forEach(bookList::add);
        List<Product> bookListOverHundred = new LinkedList<>();
        bookList.stream()
                .filter(x -> x.price > 100)
                .forEach(bookListOverHundred::add);
        System.out.println(bookListOverHundred);
        List<Product> babyList = new LinkedList<>();
        productList.stream().filter(x -> x.category == Category.Baby)
                .forEach(babyList::add);
        babyList = babyList.stream()
                .sorted(Comparator.comparingInt(Product::getPrice))
                .collect(Collectors.toList());
        System.out.println(babyList);
    }
}
