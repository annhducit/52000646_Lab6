package _Lab6_com.example.Lab06.Bai3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TextConfiguration.class);
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
        textEditor.input("Spring is coming");

        try {
            System.out.println("Hello Spring Core");
            textEditor.save("springEx3.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
