package Linked_List.Singly;

import static java.util.Collections.swap;

public class SLL_Test {
    public static void main(String[] args)
    {
        SLL<Integer> sll = new SLL<>();
        for(int i=0;i<10;i++)
        {
            sll.addFirst(i);
        }
        while(sll.getSize()!=0)
        {
            System.out.println(sll.getFirst());
            sll.remove_first();
        }
//        int[] arr = new int[100];
//        for(int i=99;i>=0;i--)
//        {
//            arr[100-i-1] = i;
//        }
//        for(int i=1;i<arr.length;i++)
//        {
//            int temp = i;
//            for(int j = i-1;j>=0;j--)
//            {
//                if(arr[j]>arr[temp])
//                {
//                    int t = arr[j];
//                    arr[j] = arr[temp];
//                    arr[temp] = t;
//                    temp =j;
//                }
//            }
//        }
//        for(int i=0;i<100;i++)
//        {
//            System.out.println(arr[i]);
//        }


    }

}
