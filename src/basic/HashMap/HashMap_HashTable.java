package basic.HashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMap_HashTable {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(null, "aaa"); // 1) key에 null 사용 가능
        map.put("s1", null);  // 2) value에 null 사용 가능
                              // 3) 동기화를 지원하지 않음 -> 멀티스레드가 동시에 사용 할 때 문제가 발생할 수 있다.
                              //     => 속도가 빠르다.

        Hashtable table = new Hashtable();
        //table.put(null, "aaa"); // 1) key에 null 사용 불가
        //table.put("s2",null)    // 2) value에 null 사용 불가
                                  // 3) 동기화 지원
    }
}
