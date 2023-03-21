package _Lab6_com.example.Lab06.Bai4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TextEditor {
    private String text;
    @Autowired
    @Qualifier("pdfTextWriter")
    private TextWriter writer;

    public void save(String filename) throws IOException {
        this.writer.write(filename, this.text);
    }
    public void input(String text) {
        this.text = text;
    }
}
