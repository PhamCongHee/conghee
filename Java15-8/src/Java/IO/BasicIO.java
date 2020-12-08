package Java.IO;
import java.io.*;
public class BasicIO {
    public static void main(String[] args) {
        int n= Integer.MAX_VALUE;
        BufferedReader in =
                new BufferedReader(
                        new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("so vua nhap: " + n);
    }
}
