package _Lab6_com.example.Lab06.Bai4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TextConfiguration.class);
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
        textEditor.input("Spring is coming");

        try {
            System.out.println("Hello Spring Core");
            textEditor.save("springEx4.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
