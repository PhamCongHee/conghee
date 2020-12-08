package Java.IO;

import java.io.FileOutputStream;
import  java.io.IOException;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file1.dat");
        String text = "The quick brown fox jumped over the lazy";
        byte[] textAsBytes = text.getBytes();
        fos.write(textAsBytes);
    }
}
