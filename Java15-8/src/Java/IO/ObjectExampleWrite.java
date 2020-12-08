package Java.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectExampleWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fileobject.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Stock[] stocks = {new Stock(1001,"CD ROM",100.00,20),
                new Stock(1002,"DRAM",800.00,200),
                new Stock(1003,"P$ Processer",400.00,100),
                new Stock(1004,"Cannon Jet",200.00,20)
        };
        oos.writeObject(stocks);
        oos.close();
    }
}
