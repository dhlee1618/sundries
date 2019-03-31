package basic.HashMap;

import java.util.HashMap;

public class HashMap_ex01 {
    public static void main(String[] args) {
        Member m1 = new Member("aaa", 10);
        Member m2 = new Member("bbb", 20);
        Member m3 = new Member("ccc", 30);
        Member m4 = new Member("ddd", 10);
        Member m5 = new Member("bbb", 20);

        HashMap map = new HashMap();
        map.put("s1", m1);
        map.put("s2", m2);
        map.put("s3", m3);
        map.put("s4", m4);
        // s4를 m5로 덮어 씌운다
        map.put("s4", m5);

        System.out.println(map.get("s1"));
        System.out.println(map.get("s2"));
        System.out.println(map.get("s3"));
        System.out.println(map.get("s4"));
        // s5는 없음
        System.out.println(map.get("s5"));
    }
}
