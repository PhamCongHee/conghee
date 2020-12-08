package process;

import java.io.File;
import java.io.*;
import java.util.*;
import Object.Person;



public class MyFiles {

    public static void textOutputFile() throws IOException{
        FileWriter OutFileWriter = new FileWriter("ABC.txt");
        PrintWriter out = new PrintWriter(OutFileWriter);
        Person[] list = MyArrays.generatePerson(30);
        for (Person p:list) {
            out.println(p);
        }
        out.println("HELLO WORLD");
        out.println(199.6789);
        out.println(false);

        out.close();
    }
    public static void textInputFile() throws IOException{
        FileReader InFileReader = new FileReader("ABC.txt");
        BufferedReader in = new BufferedReader(InFileReader);

        String tmpStr;
        int anInt;
        double aDouble;
        //boolean aBoolean;
        for (int i=0;i<30;i++)
        {
            tmpStr = in.readLine();
            System.out.println(tmpStr);
        }



        in.close();
    }

    public static void binaryOutPutFile() throws Exception{
        Random random = new Random();
        int n = 30 + random.nextInt(20);
        Person[] list = MyArrays.generatePerson(n);
        FileOutputStream outfile  = new FileOutputStream("abc.bin");
        DataOutputStream out = new DataOutputStream(outfile);
        out.writeInt(2); // so luong ban ghi tro giúp doc
        for(int i=0; i<2; i++) {
            out.writeInt(123+i);
            out.writeUTF("HELLO WORLD");
            out.writeDouble(123.45+i);
            out.writeBoolean(false);
        }
        out.close();
    }

    public static void binaryInPutFile() throws Exception{
        FileInputStream inFile  = new FileInputStream("abc.bin");
        DataInputStream in  = new DataInputStream(inFile);

        int resCount;
        String aStr;
        int anInt;
        double aDouble;
        boolean aBoolean;

        resCount = in.readInt();
        for(int i=0; i<resCount; i++) {

            anInt = in.readInt();
            System.out.println(anInt);

            aStr = in.readUTF();
            System.out.println(aStr);

            aDouble = in.readDouble();
            System.out.println(aDouble);

            aBoolean = in.readBoolean();
            System.out.println(aBoolean);
        }

        in.close();
    }

    public static void ViewFileDetail() {
        File file = new File("abc.txt");
        if(file.exists()){
            System.out.println("path is: " + file.getAbsolutePath());
            System.out.println("It's size is: " + file.length());
            System.out.println("It's is parent: "+ file.getParent());
            Date dateModified = new Date(file.lastModified());
            System.out.println("Last update: " + dateModified);
        }else {
            System.out.println("The file does not exist");
        }
    }

    public static void ViewFolderDetail(){
        File dir = new File(".");
        if (dir.isDirectory()){
            String[] subFiles = dir.list();
            for (int i=0;i<subFiles.length;i++){
                if (new File(subFiles[i]).isDirectory()){
                    System.out.println(subFiles[i] + " <DIR>");
                }
                else{
                    System.out.println(subFiles[i]);
                }
            }
        }else{
            System.out.println("Not a directory");
        }
    }


    public static void main(String[] args) {
//        try {
        try {
            MyFiles.textOutputFile();
            MyFiles.textInputFile();
        } catch (IOException e) {
            e.printStackTrace();
		}
//
//		try {
//			//cho phep dau du lieu o trong file abc.bin
//			System.out.print("\nnhap in file voi kieu binary\n");
//			MyFiles.binaryOutPutFile();
//			MyFiles.binaryInPutFile();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        ViewFileDetail();
//        ViewFolderDetail();

        return;
    }

}
