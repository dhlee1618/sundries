package basic.HashMap;

import java.util.Collection;
import java.util.HashMap;

public class HashMap_ex06 {
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

        Collection values = map.values();

        for(Object value : values){
            System.out.println(value);
        }
    }
}
