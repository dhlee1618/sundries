package basic.Generic;

import java.util.ArrayList;
import java.util.HashSet;

public class Before {
    public static void main(String[] args) {
        // ArrayList에 어떤 종류(타입, 클래스)의 객체를 저장할지 지정하지 않으면
        // 기본적으로 Object 타입의 객체를 다루는 것으로 간주
        ArrayList list = new ArrayList();
        list.add(new Member("aaa", 20));
        list.add(new String("Hello"));
        list.add(new Integer(100));
        list.add(new HashSet());

        // 객체의 값을 꺼낼 때는 해당 클래스로 형변환 한 다음에 사용
        // => get() 메서드의 리턴 타입이 Object이기 때문이다.
        Member member = (Member) list.get(0);
        System.out.println(member.name);
        System.out.println(member.age);
    }
}
