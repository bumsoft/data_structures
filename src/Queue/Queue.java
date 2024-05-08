package Queue;

import Queue.Exception.EmptyQueueException;
import Queue.Exception.FullQueueException;

public interface Queue<E> {
    public int getSize();
    public boolean isEmpty();
    public void enqueue(E data)
        throws FullQueueException;
    public E dequeue()
        throws EmptyQueueException;
    public E front()
            throws EmptyQueueException;

}
