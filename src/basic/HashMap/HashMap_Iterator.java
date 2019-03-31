package basic.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Iterator {
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

        Set keys = map.keySet();
        map.remove("s1");
        map.remove("s2");
        map.remove("s3");

        // Set 객체를 통해 key를 꺼낼 때
        // 그 순간의 HashSet에 있는 key를 꺼낸다.
        // keySet()을 호출할 때 모든 key목록을 리턴하지 않는다.
        for(Object key : keys){
            System.out.println(key);
        }
    }
}
