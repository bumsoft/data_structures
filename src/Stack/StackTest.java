package Stack;

import Stack.ArrayStack.ArrayStack;
import Stack.SLLStack.SLLStack;

import java.util.Scanner;

public class StackTest {
    public static void main(String[] args)
    {
        //Stack<Integer> stack = new ArrayStack<>(1000);
       // Stack<Integer> stack = new SLLStack<>();
        Stack<String> num = new SLLStack<>();
        Stack<String> op = new SLLStack<>();

        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();

        int start = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='+');
            if(str.charAt(i)=='-');
            if(str.charAt(i)=='*');
            if(str.charAt(i)=='/');
        }


    }

}
