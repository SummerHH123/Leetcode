package _1_Array.基础;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class array {

    public static void main(String[] args) {

        BlockingQueue queue = new ArrayBlockingQueue(10);
//        new Thread(new Producer(queue)).start();
//        new Thread(new Consumer(queue)).start();
//        new Thread(new Consumer(queue)).start();
//        new Thread(new Consumer(queue)).start();
        Thread pro1=new Producer(queue);
        Thread con1=new Consumer(queue);
        Thread con2=new Consumer(queue);

        pro1.start();
        con1.start();
        con2.start();
    }

}

class Producer extends Thread {

    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(20);
                queue.put(i);
                System.out.println(Thread.currentThread().getName() + "生产:" + queue.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Consumer extends Thread {

    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(new Random().nextInt(1000));
                queue.take();
                System.out.println(Thread.currentThread().getName() + "消费:" + queue.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
