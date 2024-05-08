package Stack;

import Stack.Exception.EmptyStackException;
import Stack.Exception.FullStackException;

public interface Stack<E> {
    public int size();
    public boolean isEmpty();
    public E top()
        throws EmptyStackException;
    public void push(E data)
        throws FullStackException;
    public E pop()
        throws EmptyStackException;
}
