package process;

import java.sql.SQLOutput;

public class Test1 {

    //Bai1
    public static void fillArray(int[][] arrInt){
        int sum=0;
        for (int i=0;i<arrInt.length;i++){
            for (int j=0;j<arrInt[0].length;j++){
                sum += arrInt[i][j];
            }
        }
        float TB = (float)sum/ (arrInt.length* arrInt[0].length);
        System.out.println("TB = " + TB);
        System.out.println("các phần tử nhỏ hơn tb");
        for (int i=0;i<arrInt.length;i++){
            for (int j=0;j<arrInt[0].length;j++){
                if (arrInt[i][j]<TB)
                    System.out.print(arrInt[i][j] + " ");
            }
        }
    }


    //Bai2
//    public static String getWords(String str, byte nWords){
//        str = MyStrings.formatString(str);
//        if (str==null) return  null;
//        int count=0;
//        String newWords ="";
//        int words = MyStrings.countWord(str);
//        for (int i=0;i<str.length();i++){
//            if (str.charAt(i)==' ')
//                count++;
//            if (count<nWords){
//                newWords+=str.charAt(i);
//            }
//        }
//        if (nWords>words)
//            return str;
//        else{
//            newWords = newWords + "...";
//        }
//        return newWords;
//    }
    public static String getWords(String str,byte nWOrds){
        //Chuẩn hóa chuỗi kí tự
        str = MyStrings.formatString(str);

        //Xác định vị trí để cắt chuỗi
        int i;
        int count = 0;
        for (i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
            if (count>=nWOrds){
                break;
            }
        }
        //Trả về kq
        if (i<str.length()-1){
            return str.substring(0, i)+"...";
        }
        else {
            return str;
        }

    }


    public static void main(String[] args) {
        //bai1
//        int[][] arrInt = MyArrays.generateArray(5,5);
//        MyArrays.sortArrayV22(arrInt,true);
//        MyArrays.fillArray(arrInt);
        //bai2
        String str = "Cộng hòa xã hội chủ nghĩa Việt Nam";
        System.out.println(str);
        System.out.println(MyStrings.getWords(str, (byte) 3));


    }
}
