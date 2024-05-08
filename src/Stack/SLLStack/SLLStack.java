package Stack.SLLStack;

import Linked_List.Singly.SLL;
import Stack.*;
import Stack.Exception.EmptyStackException;
import Stack.Exception.FullStackException;

public class SLLStack<E> implements Stack<E> {
    private SLL<E> sll;

    public SLLStack()
    {
        sll = new SLL<>();
    }

    public int size()
    {
        return sll.getSize();
    }

    @Override
    public boolean isEmpty()
    {
        return sll.getSize()==0;
    }

    @Override
    public E top() throws EmptyStackException
    {
        if(sll.getSize()==0)
        {
            throw new EmptyStackException();
        }
        return sll.getFirst();
    }

    @Override
    public void push(E data) throws FullStackException
    {
        sll.addFirst(data);
    }

    @Override
    public E pop() throws EmptyStackException
    {
        if(sll.getSize()==0) throw new EmptyStackException();
        E temp = sll.getFirst();
        sll.remove_first();
        return temp;
    }
}
