package process;
import java.io.*;

public class MyIO {

    public static void copy(InputStream in, OutputStream out) throws IOException{
        int c;
        while((c = in.read()) != -1) {
            out.write(c);
        }
    }
    public static void copy(Reader in, Writer out) throws IOException{
        int c;
        while((c = in.read()) != -1) {
            out.write(c);
        }
    }
    public static void copy2(Reader in, Writer out) throws IOException{
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);
        String line;
        while((line = br.readLine()) != null) {
            //khoi lenh
            bw.write(line);
        }
    }
    public static void main(String[] args) {
        try {
            //Doc tu file
            FileReader in12 = new FileReader("file0.txt");
            FileWriter out12 = new FileWriter("file12.txt");
            long bl = System.nanoTime();
            MyIO.copy(in12, out12);
            long al = System.nanoTime();
            System.out.println(al-bl);
            in12.close();
            out12.close();

            FileReader in22 = new FileReader("file0.txt");
            FileWriter out22 = new FileWriter("file22.txt");
            bl = System.nanoTime();
            MyIO.copy(in22, out22);
            al = System.nanoTime();
            System.out.println(al-bl);
            in22.close();
            out22.close();



            //luong chuoi
            String msg = "java rulez";
            StringReader in2 = new StringReader(msg);
            FileWriter out2 = new FileWriter("file2.txt");
            MyIO.copy(in2, out2);
            in2.close();
            out2.close();
        } catch (IOException exc) {
            // TODO: handle exception
            exc.printStackTrace();
        }
    }

}