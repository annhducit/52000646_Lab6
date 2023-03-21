package _Lab6_com.example.Lab06.Bai3;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public interface TextWriter {
    public void write(String filename, String text) throws IOException;
}
