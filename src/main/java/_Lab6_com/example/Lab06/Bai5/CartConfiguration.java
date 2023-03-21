package _Lab6_com.example.Lab06.Bai5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:product.properties")
@ComponentScan("_Lab6_com.example.Lab06.Bai5")
public class CartConfiguration {

    @Value("${vip.promotion:0}")
    private int vipPromotion;

    @Value("${summer.promotion:0}")
    private int summerPromotion;
    @Value("${product.promotion:0}")
    private int productPromotion;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean
    public Product cake() {
        Product cake = new Product("Chocolate", 17000, vipPromotion);
        return cake;
    }
    @Bean
    public Product water() {
        Product water = new Product("Number One", 10000, productPromotion);
        return water;
    }
    @Bean
    public Product noodle() {
        Product noodle = new Product("Omachi", 7000, summerPromotion);
        return noodle;
    }
}
