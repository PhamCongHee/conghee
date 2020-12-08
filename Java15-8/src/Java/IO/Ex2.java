package Java.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file1.dat");
        int c;
        while((c= fis.read()) !=-1){
            System.out.print((char)c);
        }
        fis.close();
    }
}
