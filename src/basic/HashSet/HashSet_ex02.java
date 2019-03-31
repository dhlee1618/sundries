package basic.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_ex02 {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        String s5 = new String("ccc");

        HashSet set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);


        // 저장한 순서대로 꺼낼 수 없기 때문에 index를 이용하여 값을 꺼낼 수 없다.
        // 1) HashSet에 있는 값을 배열로 받아 사용
        Object[] values = set.toArray();
        for(Object value : values){
            System.out.print(value + ", ");
        }
        System.out.println();

        // 2) 값을 꺼내주는 객체의 도움을 받는다.
        Iterator i = set.iterator();

        while(i.hasNext()){
            System.out.print(i.next() + ",");
        }
        System.out.println();
    }
}
