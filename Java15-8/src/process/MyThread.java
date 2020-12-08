package process;
 import java.util.*;

public class MyThread extends Thread {
    String msg="";
    public MyThread(String name,String msg){
        super(name);
        this.msg = msg;
    }
    @SuppressWarnings("static-access")
    public void run(){
        int timeSleep = (int)( Math.random()*5000);
        try{
            System.out.println(super.getName() + "\t" + this.msg + "\t" + timeSleep+"ms");
            this.sleep(timeSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread tm1 = new MyThread("Thread one: ","Hi");
        Thread tm2 = new MyThread("Thread two: ","Hello");
        Thread tm3 = new MyThread("Thread three: ","Hello everybody");
        Thread tm4 = new MyThread("Thread four: ","Hello word");
        tm1.start();
        tm2.start();
        tm3.start();
        tm4.start();
    }
}
