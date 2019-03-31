package basic.HashSet;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class HashSet_ex02_02 {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        String s5 = new String("eee");

        Stack stack = new Stack();
        stack.add(s1);
        stack.add(s2);
        stack.add(s3);
        stack.add(s4);
        stack.add(s5);

        Iterator i = stack.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + ", ");
        }
        System.out.println();
    }
}
