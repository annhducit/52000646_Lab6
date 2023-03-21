package _Lab6_com.example.Lab06.Bai5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CartConfiguration.class);

        Product cake = context.getBean("cake", Product.class);
        Product water = context.getBean("water", Product.class);
        Product noodle = context.getBean("noodle", Product.class);

        CartShopping cartShopping = new CartShopping();
        cartShopping.addProduct(cake);
        cartShopping.addProduct(water);
        cartShopping.addProduct(noodle);
        System.out.println("List product: ");
        System.out.println(cartShopping.getProductList());

    }
}
