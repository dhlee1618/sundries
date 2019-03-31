package basic.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_ex05 {
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

        // key, value 가 한 쌍으로 묶여있는 객체가 들어있음
        Set entrySet =  map.entrySet();

        for(Object obj : entrySet){
            // Set Collection에 들어있는 객체는 원래 Entry 객체이다
            // Entry 객체에서 key와 value를 꺼내려면 원래의 타입으로 형 변환 해야한다.
            Entry entry = (Entry) obj;
            System.out.printf("%s ===> %s%n", entry.getKey(), entry.getValue());
        }
    }
}