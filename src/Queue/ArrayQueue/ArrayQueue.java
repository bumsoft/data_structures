package Queue.ArrayQueue;

import Queue.*;
import Queue.Exception.EmptyQueueException;
import Queue.Exception.FullQueueException;

public class ArrayQueue<E> implements Queue<E> {

    private E[] Q;
    private int f;
    private int r;

    public ArrayQueue(int capacity)
    {
        Q = (E[])new Object[capacity];
        f=0;
        r=0;
    }

    @Override
    public int getSize()
    {
        return (Q.length+r-f)%Q.length;
    }

    @Override
    public boolean isEmpty()
    {
        return getSize()==0;
    }

    @Override
    public void enqueue(E data)
    {
        if(getSize()+1==Q.length) throw new FullQueueException();
        Q[r++]=data;
        r%=Q.length;
    }

    @Override
    public E dequeue()
    {
        if(getSize()==0) throw new EmptyQueueException();
        E temp = Q[f++];
        f%=Q.length;
        return temp;
    }

    @Override
    public E front()throws EmptyQueueException
    {
        if(getSize()==0) throw new EmptyQueueException();
        return Q[f];
    }
}
