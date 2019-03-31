package basic.HashMap;

import java.util.HashMap;

public class HashMap_ex02 {
    static class MyKey{
        String major;
        int no;

        public MyKey(String major, int no){
            this.major = major;
            this.no = no;
        }

        @Override
        public String toString() {
            return "MyKey{" +
                    "major='" + major + '\'' +
                    ", no=" + no +
                    '}';
        }
    }

    public static void main(String[] args) {
        Member m1 = new Member("aaa", 10);
        Member m2 = new Member("bbb", 20);
        Member m3 = new Member("ccc", 30);
        Member m4 = new Member("ddd", 40);
        Member m5 = new Member("eee", 10);

        MyKey k1 = new MyKey("AAA",1);
        MyKey k2 = new MyKey("BBB",2);
        MyKey k3 = new MyKey("CCC",3);
        MyKey k4 = new MyKey("DDD",4);
        MyKey k5 = new MyKey("EEE",5);

        HashMap map = new HashMap();
        map.put(k1, m1);
        map.put(k2, m2);
        map.put(k3, m3);
        map.put(k4, m4);
        map.put(k5, m5);

        System.out.println(map.get(k1));
        System.out.println(map.get(k2));
        System.out.println(map.get(k3));
        System.out.println(map.get(k4));
        System.out.println(map.get(k5));

        // k3와 같은 값을 가지는 k6를 생성
        MyKey k6 = new MyKey("CCC", 3);

        System.out.println(map.get(k6));
        // null출력
    }
}
// => HashMap에서 값을 찾을 때 key가 같아야 한다.
//    key 객체가 다르더라도 hashCode()의 리턴 값이 같고,
//    equals()의 리턴 값이 true이면 두 개의 key는 같다고 간주한다.
// => 그러나 우리가 사용한 MyKey 클래스는 hashCode()와 equals()를
//    오버라이딩 하지 않았기 때문에,
//    값이 같더라도 인스턴스가 다르면 hashCode()의 리턴 값이 다르게 나온다.
//    equals() 또한 false를 리턴한다.
// 해결책?
// => key로 사용할 클래스는 항상 hashCode()와 equals()를 오버라이딩 하여
//    같은 값을 갖는 객체에 대해 같은 해시값을 리턴하게 해야 한다.