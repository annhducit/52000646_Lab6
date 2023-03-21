package _Lab6_com.example.Lab06.Bai1;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
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
}
