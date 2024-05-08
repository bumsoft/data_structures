package Linked_List.Singly;

public class SLL<E> {

    private SNode<E> head;
    private SNode<E> tail;
    private long size;

    public SLL()
    {
        head = null;
        tail = null;
        size = 0;
    }

    void  add(E n)
    {
        if(size==0)
        {
            head = new SNode<E>(n);
            tail = head;
            size++;
            return;
        }
        tail.setNext(new SNode<E>(n));
        tail = tail.getNext();
        size++;
    }

    void addFirst(E n)
    {
        if(size==0)
        {
            add(n);
            return;
        }
        head = new SNode<>(n,head);
        size++;
    }

    void addLast(E n)
    {
        if(size==0)
        {
            add(n);
        }
    }
    void addNext(SNode<E> p, E n) //add n next to p
    {

    }


    void remove(SNode<E> n)
    {

    }




}
