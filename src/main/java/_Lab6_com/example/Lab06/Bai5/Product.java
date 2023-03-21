package _Lab6_com.example.Lab06.Bai5;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private String name;
    private float price;
    private int promotion;

    @Override
    public String toString() {
        return  name + " " + price + " - " + promotion + "% promotion!";
    }
}
