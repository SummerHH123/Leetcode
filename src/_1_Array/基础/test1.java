package _1_Array.基础;

public class test1 {
    public static void main(String[] args) {

        Thread t1=new Thread(new th());
        Thread t2=new Thread(new th());
        Thread t3=new Thread(new th());


        t2.start();
        t3.start();
        t1.start();
    }


}
class th implements Runnable{

    private static int count=1;
    private String lock = "";
    private Integer l=1;

    @Override
    public void run() {
        synchronized (l){
        while(count<=30){

                switch (count%3){
                    case 1:
                        System.out.println("A");
                        break;
                    case 2:
                        System.out.println("B");
                        break;
                    case 0:
                        System.out.println("C");
                        break;
                }
                count++;
            }
        }


    }
}

