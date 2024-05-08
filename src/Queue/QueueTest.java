package Queue;

import Queue.ArrayQueue.ArrayQueue;
import Queue.SLLQueue.SLLQueue;

public class QueueTest {
    public static void main(String[] args)
    {
//        Queue<Integer> queue = new ArrayQueue<>(10);
        Queue<Integer> queue = new SLLQueue<>();

        queue.enqueue(1);
        System.out.println("size"+queue.getSize());//1
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("size"+queue.getSize());//5
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
      //  queue.enqueue(10);
        System.out.println(queue.dequeue());
        System.out.println("size:"+queue.getSize());//8
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("size:"+queue.getSize());//1
        System.out.println(queue.dequeue());
        System.out.println("size:"+queue.getSize());//0
        queue.enqueue(1);
        System.out.println("size:"+queue.getSize());//1
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
