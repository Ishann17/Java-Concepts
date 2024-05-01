import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        //buffer acts as the shared resource between the producer and consumer threads.
        Queue<Integer> buffer = new LinkedList<>();
        //maximum size of the buffer
        int maxSize = 5;
        //Creating Producer Thread using Lambda
        Thread producer = new Thread(() -> {
            for(int i=1; i<=10; i++){
                //only one thread can access the buffer at a time
                synchronized (buffer){
                    while(buffer.size()==maxSize){
                        //If the buffer is full, the producer thread waits and releases the lock on the buffer
                        try{
                            buffer.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    buffer.add(i);
                    System.out.println("Produced Data : " + i);
                    //This line wakes up Consumer Thread that is waiting on the buffer’s lock
                    buffer.notify();
                }
            }
        });

        //Creating a Consumer Thread using Lambda
        Thread consumer = new Thread(() -> {
            for(int i=1; i<=10; i++){
                //only one thread can access the buffer at a time
                synchronized (buffer){
                    while(buffer.isEmpty()){
                        try{
                            buffer.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    //The consumer removes an item from the buffer
                    int data = buffer.poll();
                    System.out.println("Consumed Data : " + data);
                    buffer.notify();
                }
            }
        });
        producer.start();
        consumer.start();
        System.out.println("Thread Count: " + Thread.activeCount());
    }
}
