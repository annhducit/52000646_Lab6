package _Lab6_com.example.Lab06.Bai4;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PdfTextWriter implements TextWriter {

    public void write(String filename, String text) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(filename));
        writer.write(text);
        writer.close();
    }
}
