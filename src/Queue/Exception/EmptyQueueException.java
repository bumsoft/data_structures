package Queue.Exception;

public class EmptyQueueException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public EmptyQueueException()
    {
        super();
    }
    public EmptyQueueException(String e)
    {
        super(e);
    }
}
