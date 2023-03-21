package _Lab6_com.example.Lab06.Bai4;

import org.springframework.context.annotation.Bean;

public class TextConfiguration {

    @Bean
    public TextWriter plainTextWriter() {return new PlainTextWriter();}

    @Bean
    public TextWriter pdfTextWriter() {return new PdfTextWriter();}

    @Bean
    public TextEditor textEditor() {return new TextEditor();}
}
