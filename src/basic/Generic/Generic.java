package basic.Generic;

import java.util.HashMap;

public class Generic {
    public static void main(String[] args) {
        // key, value를 어떤 클래스를 사용할 것인지 명시하지 않는것 보다
        // Object 타입으로라도 클래스 이름을 명시하는 것이 좋음
        HashMap map = new HashMap();
        map.put("aaa", "문자열");
        map.put(new Integer(100), new Member("홍길동", 20));

        HashMap<Object, Object> map2 = new HashMap<>();
        map2.put("aaa", "문자열");
        map2.put(new Integer(100), new Member("홍길동", 20));

         // key : String
        // value : Member
        HashMap<String, Member> map3 = new HashMap<>();
        // map3.put("aaa", "문자열");
        // map3.put(new Integer(100), new Member("홍길동", 20));
        map3.put("aaa", new Member("홍길동", 20));

        // 제네릭을 지정하면 형변환을 안해도 된다.
        Member m = map3.get("aaa");
    }
}
