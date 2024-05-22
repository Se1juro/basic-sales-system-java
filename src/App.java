import com.co.domain.Order;
import com.co.domain.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product coffee = new Product("Cafe", 3.99);
        Product rice = new Product("Arroz", 2.99);

        Order order = new Order();
        order.addProduct(coffee);
        order.addProduct(rice);

        order.printOrder();

        Order order2 = new Order();
        order2.addProduct(coffee);
        order2.printOrder();
    }
}
