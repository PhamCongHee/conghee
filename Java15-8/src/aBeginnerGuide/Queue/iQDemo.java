package aBeginnerGuide.Queue;

public class iQDemo{
    static class FixedQueue implements iCharQ{
        private char q[];
        private int putloc,getloc;

        public FixedQueue(int size){
            q = new char[size+1];
            putloc = getloc=0;
        }
        public char put(char ch){
            if(putloc ==q.length-1){
                System.out.println("Hang doi da dau");
                return ch;
            }
            putloc++;
            q[putloc]=ch;
            return ch;
        }
        public char get(){
            if(getloc==putloc){
                System.out.println("Hang doi rong");
                return (char) 0;
            }
            getloc++;
            return q[getloc];
        }
    }

    static class CircilarQueue implements iCharQ{
        private char q[];
        private int putloc,getloc;

        public CircilarQueue(int size){
            q = new char[size+1];
            putloc = getloc=0;
        }
        public char put(char ch){
            if(putloc +1==getloc | ((putloc== q.length-1) & (getloc==0))){
                System.out.println("Hang doi da dau");
                return ch;
            }
            putloc++;
            if (putloc== q.length) putloc = 0;
            q[putloc] = ch;
            return ch;
        }
        public char get(){
            if(getloc==putloc){
                System.out.println("Hang doi rong");
                return (char) 0;
            }
            getloc++;
            if(getloc==q.length) getloc=0;
            return q[getloc];
        }
    }

    static class DynQueue implements iCharQ{
        private char q[];
        private int putloc,getloc;

        public DynQueue(int size){
            q = new char[size+1];
            putloc = getloc=0;
        }
        public char put(char ch){
            if(putloc==q.length-1){
                char t[] = new char[q.length*2];
                for(int i=0;i<q.length;i++)
                    t[i] = q[i];
                    q=t;


            }
            putloc++;
            q[putloc] = ch;
            return ch;
        }

        public  char get(){
            if(getloc==putloc){
                System.out.println("Hang doi rong");
                return (char) 0;
            }
            getloc++;
            return q[getloc];
        }


    }

    public static void main(String[] args) {
        FixedQueue ql = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircilarQueue q3 = new CircilarQueue(10);

        iCharQ iQ;
        char ch;
        int i;
        iQ = ql;
        for(i =0;i<10;i++)
            iQ.put((char) ('A'+i));
        System.out.println("Noi dung hang doi co dinh: ");
        for(i=0;i<10;i++){
            ch = iQ.get();
            System.out.println(ch);
        }

        iQ = q2;
        for(i=0;i<10;i++){
            ch = iQ.put((char) ('Z' -i));
        }

        System.out.println("Noi dung cua hang doi dong");
        for(i=0;i<10;i++){
            ch = iQ.get();
            System.out.println(ch);
        }
        iQ = q3;
        for (i=0;i<10;i++){
            iQ.put((char) ('A'+i));
        }

        System.out.println("Noi dung cua hang doi vong: ");
        for(i=0;i<10;i++){
            ch = iQ.get();
            System.out.println(ch);
        }

        for (i=10;i<20;i++){
            iQ.put((char) ('A' +i));
        }

        System.out.println("Noi dung cua hang doi vong");
        for(i = 0;i<10;i++){
            ch =iQ.get();
            System.out.println(ch);
        }

        System.out.println("\nLuu tru va lay du lieu tu" + "hang doi vong");
        for(i=0;i<20;i++){
            iQ.put((char)('A' +i));
            ch = iQ.get();
            System.out.println(ch);
        }
    }
}
