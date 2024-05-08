package Linked_List.Singly;

public class SLL<E> {

    private SNode<E> head;
    private SNode<E> tail;
    private int size;

    public SLL()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize()
    {
        return size;
    }
    public void  add(E n)
    {
        if(head==null)
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

    public void addFirst(E n)
    {
        if(size==0)
        {
            add(n);
            return;
        }
        head = new SNode<>(n,head);
        size++;
    }

    public void addNext(SNode<E> p, E n) //add n next to p
    {
        SNode<E> t = head;
        while(t!=null)
        {
            if(t.equals(p))
            {
                SNode<E> temp = new SNode<>(n,t.getNext());
                t.setNext(temp);
                size++;
                return;
            }
            t = t.getNext();
        }
    }


    public void remove(SNode<E> n)
    {
        if(head==null) return;
        if(head.equals(n))
        {
            size--;
            head = head.getNext();
            return;
        }
        SNode<E> t = head;
        while(t!=null)
        {
            if(t.getNext().equals(n))
            {
                t.setNext(t.getNext().getNext());
                size--;
                return;
            }
            t = t.getNext();
        }
    }

    public void remove_last()
    {
        if(head==null)return;
        if(size==1)
        {
            head = tail = null;
            return;
        }
        SNode<E> t = head;
        for(int i=0;i<size-1;i++)
        {
            t = t.getNext();
        }
        t.setNext(null);
        size--;
        tail = t;
    }
    public void remove_first()
    {
        if(head==null)return;
        head = head.getNext();

        size--;
    }
    public E getFirst()
    {
        if(tail==null)
        {
            return null;
        }
        return head.getData();
    }
    public E getLast()
    {
        if(tail==null) return null;
        return tail.getData();
    }
}
