package Java.IO;
import java.util.*;
public class xla {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("\nNhập vào số cột : ");
        int n = sc.nextInt();
        System.out.print("\nNhập vào số hàng : ");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\nNhập vào vị trí [" +i +"," + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("" +arr[i][j] + "\t" );
            }
            System.out.print("\n");
        }
        System.out.print("\nNhập vào điểm ảnh cần tìm: ");
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int h = 0,l = 0,o = 0;
            boolean a = false;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    if(!a) {
                        h = i;
                        l = j;
                        o++;
                        a = true;
                    }else {
                        o++;
                    }
                }
            }
            if(o > 0) {
                System.out.print("{[" + h + "," + l + "]," + o + "}");
            }
        }
    }
}

