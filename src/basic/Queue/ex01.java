package basic.Queue;

import basic.LinkedList.LinkedList;

public class ex01 {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        String s5 = new String("eee");

        Queue queue = new Queue();
        queue.offer(s1);
        print(queue);

        queue.offer(s4);
        print(queue);
        queue.offer(s5);
        print(queue);

        String value;
        while((value = (String)queue.poll()) != null){
            System.out.println(value);
        }
    }

    static void print(LinkedList list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
}
