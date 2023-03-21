package _Lab6_com.example.Lab06.Bai2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class Product {
    private Product product;
    private String id;
    private String name;
    private float price;
    private String description;

    public Product(Product product){
        this.product = product;

    }

    public Product(String id, String name, float price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
