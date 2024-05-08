package Linked_List.Singly;

public class SNode<T> {

    private T data;
    private SNode<T> next;


    public SNode()
    {
        this(null,null);
    }

    public SNode(T data)
    {
        this(data, null);
    }

    public SNode(T data, SNode<T> next)
    {
        this.data = data;
        this.next = next;
    }

    public T getData()
    {
        return data;
    }

    public SNode<T> getNext()
    {
        return next;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public void setNext(SNode<T> next)
    {
        this.next = next;
    }
}
