package basic.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_ex04 {
    public static void main(String[] args) {
        Member m1 = new Member("aaa", 10);
        Member m2 = new Member("bbb", 20);
        Member m3 = new Member("ccc", 30);
        Member m4 = new Member("ddd", 40);
        Member m5 = new Member("eee", 10);

        HashMap map = new HashMap();
        map.put("s1", m1);
        map.put("s2", m2);
        map.put("s3", m3);
        map.put("s4", m4);
        map.put("s5", m5);


        // HashMap에서 key 목록을 꺼내기
        Set keys = map.keySet();

        // key가 들어있는 Set에서 값을 꺼내는 방법
        // 1) Iterator 사용
        Iterator i = keys.iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(map.get(key));
        }
        System.out.println("---------------------------------------------------");

        // 2) 배열 사용
        Object[] keyArray = keys.toArray();
        for (Object key : keyArray){
            System.out.println(map.get(key));
        }
        System.out.println("---------------------------------------------------");

        // 3) 컬렉션 객체가 java.util.Collection 규칙을 따라 만든 클래스라면
        //      for(:) 반복문을 사용할 수 있다.
        for (Object key : keys){
            System.out.println(map.get(key));
        }
    }
}
