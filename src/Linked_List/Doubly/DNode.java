package Linked_List.Doubly;

public class DNode<T> {

    private T data;
    private DNode<T> prev;
    private DNode<T> next;

    public void setData(T data)
    {
        this.data = data;
    }

    public void setPrev(DNode<T> prev)
    {
        this.prev = prev;
    }

    public void setNext(DNode<T> next)
    {
        this.next = next;
    }
}
