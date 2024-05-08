package Queue.SLLQueue;
import Linked_List.Singly.SLL;
import Queue.*;
import Queue.Exception.EmptyQueueException;
import Queue.Exception.FullQueueException;

public class SLLQueue<E> implements Queue<E>{
    SLL<E> sll;

    public SLLQueue()
    {
        sll = new SLL<>();
    }

    @Override
    public int getSize()
    {
        return sll.getSize();
    }

    @Override
    public boolean isEmpty()
    {
        return sll.getSize()==0;
    }

    @Override
    public void enqueue(E data) throws FullQueueException
    {
        sll.add(data);
    }

    @Override
    public E dequeue() throws EmptyQueueException
    {
        if(isEmpty()) throw new EmptyQueueException();
        E temp = sll.getFirst();
        sll.remove_first();
        return temp;
    }

    @Override
    public E front() throws EmptyQueueException
    {
        if(isEmpty()) throw new EmptyQueueException();
        return sll.getFirst();
    }
}
