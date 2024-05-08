package Stack.ArrayStack;

class node {
    int data;
    public String toString()
    {
        return Integer.toString(data);
    }

    public node(int data)
    {
        this.data = data;
    }
}
public class ArrayStackTest {

    public static void main(String[] args)
    {
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>(100);
        for(int i=0;i<10;i++)
        {
            arrayStack.push(i);
        }
        while(!arrayStack.isEmpty())
        {
            System.out.println(arrayStack.pop());
        }
        //System.out.println(arrayStack.pop());
    }


}
