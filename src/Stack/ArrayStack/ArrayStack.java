package Stack.ArrayStack;
import Stack.*;
import Stack.Exception.EmptyStackException;
import Stack.Exception.FullStackException;

public class ArrayStack<E> implements Stack<E> {
    private E S[];
    private int size;
    private int top;

    public ArrayStack(int capacity)
    {
        S = (E[])new Object[capacity];
        size = 0;
        top = -1;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return size==0;
    }

    @Override
    public E top() throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException("top() attempted on an empty stack");
        }
        else
        {
            return S[top];
        }
    }

    @Override
    public void push(E data) throws FullStackException
    {
        if(top==S.length-1)
        {
            throw new FullStackException("push() attempted on an empty stack");
        }
        else
        {
            S[++top] = data;
            size++;
        }
    }

    @Override
    public E pop() throws EmptyStackException
    {
        if (isEmpty())
        {
            throw new EmptyStackException("pop() attempted on an empty stack");
        }
        else
        {
            E temp = S[top];
            S[top--] = null;
            size--;
            return temp;
        }
    }
}
