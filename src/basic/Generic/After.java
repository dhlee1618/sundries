package basic.Generic;

import java.util.ArrayList;
import java.util.HashSet;

public class After {
    public static void main(String[] args) {
        // Generic 사용
        // 특징 1 : 다루는 타입을 제한 할 수 있다.
        ArrayList<Member> list = new ArrayList<>();
        list.add(new Member("aaa", 10));


        // 지정한 타입이 아닌 경우에는 컴파일 오류가 발생
        // list.add(new String("Hello"));
        // list.add(new Integer(100));
        // list.add(new HashSet());

        // 특징 2 : Generic을 지정하면 그와 관련된 메서드의 타입정보가 자동으로 바뀜
        Member member = list.get(0);
        System.out.println(member.name);
        System.out.println(member.age);

        // Generic 문법으로 인해 한 개의 클래스로 형변환 없이 여러 타입의 객체를 다룰 수 있다.
    }
}
