package process;


import java.util.*;

public class MyStrings {
    public static  int countChar(String str, char ch,boolean isIgnoreCase){

        //Nếu có bỏ qua kiểu chữ
        if (isIgnoreCase){
            str = str.toLowerCase();
            ch = Character.toLowerCase(ch);
        }
        int count =0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    
    public static int countWord(String str){

        str = MyStrings.formatString(str);
        int count = MyStrings.countChar(str,' ',false) +1;

        return count;
    }
    public static String formatString(String str){
        //Danh sách các kí tự đặc biệt trong chuỗi
        char[] chs = {
             '~','!','@','#','$','%',
                '^','&','*','(',')','_',
                '+','{','}','|',':','"',
                '<','>','?','-','='
                
        };
        //Loại bỏ các kí tự khỏi chuỗi
        for (char ch: chs){
            str = str.replace(ch,' ');
        }
        //Loại bỏ các dấu cách thừa
        str = str.trim();
        while (str.indexOf("  ") != -1){
            str = str.replace("  "," ");
        }
        return str;
    }
//    public static void returnString(String str, int n){
//        String[] ch = str.split(" ");
//        char h = ' ';
//        for (int i=1;i<=ch.length;i++){
//            if(h==i){
//                System.out.println(ch);
//            }
//        }
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

    public static ArrayList<String> statisticWords(String str,String split_ch){
        //Lấy ra mảng các từ
        String[] words_tmp = str.split(split_ch);

        ArrayList<String> words = new ArrayList<>();
        for (String word: words_tmp){
            word = word.trim();

            if (!word.equalsIgnoreCase("") && words.contains(word)){
                words.add(word);
            }
        }

        //Kết quả
        ArrayList<String> results = new ArrayList<>(words.size());
        int count=0;
        for (String w:words_tmp){
            for (String w2:words_tmp){
                if (w.equalsIgnoreCase(w2.trim())){
                    count++;
                }
            }
            results.add(w+ "  (" + count + ") ");
        }

        return results;
    }

    
    
    public static void main(String[] args) {
        String str = "abc#   dcbb#  abc #cba #dcbb # dcbb";
        //System.out.println("Có tất cả: " + MyStrings.countChar(str,'e',false)+"Kí tự e");
        System.out.println(str);
//        System.out.println(MyStrings.getWords(str, (byte) 4));
        System.out.println(MyStrings.statisticWords(str,"#"));
    }


}
