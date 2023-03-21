package _Lab6_com.example.Lab06.Bai2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {
    @Bean
    @Scope ("prototype")
    public Product product1() {
        Product product1 = new Product("product1", "Iphone", 12000, "Beautiful");
        return product1;
    }
    @Bean
    @Scope ("prototype")
    public Product product2() {
        return new Product(product1());
    }

    @Bean
    @Scope ("singleton")
    public Product product3() {
        Product product3 = new Product("product3", "Xbox", 14000, "Beautiful");
        return product3;
    }

}
