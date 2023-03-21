package _Lab6_com.example.Lab06.Bai3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;

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
