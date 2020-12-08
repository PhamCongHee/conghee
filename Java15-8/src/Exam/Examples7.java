package Exam;

/**
 * Lớp xây dựng các phương thức <b>nghiệp vụ</b> căn bản
 * <br/>
 *
 * @author  Công - Công Nghiệp
 */


public class Examples7 {
    /**
     * Phương thức này được sử dụng để lấy ra một <b>giá trị nguyên ngẫu nhiên</b> từ giá trị chặn trên MAX_VALUE
     * <br/>
     * <i>Cập nhật ngày: 22/09/2020</i>
     * @param MAX_VALUE
     * @return
     */
    public static int getRandomIntValue(int MAX_VALUE)
    {

        return (int)(Math.random()*MAX_VALUE);
    }
    public static boolean isPrime(int n)
    {
        boolean flag = true;
        if(n<2){
            flag = false;
        }
        else {
            for(int v=2;v<=(int)Math.sqrt(n);v++){
                if(n%v==0){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public static int getUCLN(int a,int b){
        int ucln = -1;
        if(a*b!=0){
            while (a!=b){
                if(a>b){
                    a-=b;
                }
                else {
                    b-=a;
                }
            }
            ucln = a;
        }
        return ucln;
    }
    public static void getQuadR2(int a,int b,int c){

        System.out.println("Phương trình bậc 2: " +a+" X^2 +" + b + "X +" + c + " = 0");

        if(a!=0){
            double delta = b*b-4*a*c;
            if(b%2==0){

            }
            if(delta>0){
                System.out.println("NGHIỆM PHÂN BIỆT");

                double x1= (-b-Math.sqrt(delta))/(2*a);
                double x2= (-b+Math.sqrt(delta))/(2*a);
                System.out.printf("Nghiệm x1=%10.2f\n",x1);
                System.out.printf("Nghiệm x2=%10.2f\n",x2);
            }
            else if(delta==0){
                System.out.println("NGHIỆM KÉP");
                double x = (-b)/(2*a);
                System.out.printf("Nghiệm x=%10.2f\n",x);
            }
            else {
                double d = Math.abs(delta);
                double r = (-b)/2*a;
                double v = Math.sqrt(d)/(2*a);
                System.out.println("Nghiệm phức x1="+(r)+" -i"+v);
                System.out.println("Nghiệm phức x2="+(r)+" +i"+v);
            }

        }
        else {
            System.out.println("SUY BIẾN");
            if(b!=0){
                System.out.println("Ngiệm là: " +(-c)/b);
            }
            else{
                System.out.println("Vô nghiệm");
            }
        }
    }
    public static int getUCLN(int a,int b,int c){
        return Examples7.getUCLN(Examples7.getUCLN(a,b),c);
    }
    public static void main(String[] args) {

        int a = Examples7.getRandomIntValue(10);
        int b = Examples7.getRandomIntValue(10);
        int c = Examples7.getRandomIntValue(10);
//        if(Examples7.isPrime(n)){
//            System.out.println("Giá trị của n: " +n+ " là số nguyên tố");
//        }
//        else {
//            System.out.println("Giá trị của n: " +n+ " KHÔNG là số nguyên tố");
//        }
//        System.out.println("UCLN cua " + n + " va " +m+ "là: " + Examples7.getUCLN(n,m));
            Examples7.getQuadR2(a,b,c);
    }
}
