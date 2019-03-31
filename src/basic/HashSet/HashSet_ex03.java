package basic.HashSet;

import java.util.HashSet;

public class HashSet_ex03 {
    static class Member{
        String name;
        int age;

        public Member(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Member{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Member m1 = new Member("aaa", 10);
        Member m2 = new Member("bbb", 20);
        Member m3 = new Member("ccc", 30);
        Member m4 = new Member("ddd", 10);
        Member m5 = new Member("bbb", 20);

        HashSet set = new HashSet();
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        set.add(m5);

        print(set);
    }
    static void print(HashSet set){
        Object[] values = set.toArray();
        for(Object value : values){
            System.out.println(value);
        }
    }
}

// HashSet이 중복여부를 검사할 때 hashCode()와 equals()의 리턴값으로 판단한다.
// => Member 클래스에서 hashCode()와 equals()를 오버라이딩 하지 않았기 때문에
//    Object로부터 상속 받은 hashCode()와 equals()를 그대로 사용하였고,
//    Object의 hashCode()는 인스턴스가 다르면 무조건 다른 해시값을 리턴한다.
//    Object의 equals()는 인스턴스의 주소가 같은 지 검사한다.
// => 그래서 "bbb,20" 데이터가 같더라도 인스턴스가 다르기 때문에
//    같은 값으로 간주하지 않은 것이다.