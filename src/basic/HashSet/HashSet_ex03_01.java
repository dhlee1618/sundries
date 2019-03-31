package basic.HashSet;

import java.util.HashSet;

public class HashSet_ex03_01 {
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

        @Override
        public int hashCode(){
            final int prime = 31;
            int result = 1;
            result = prime * result + age;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj){
            if(this == obj)
                return true;
            if(obj == null)
                return false;
            if(getClass() != obj.getClass())
                return  false;
            Member other = (Member) obj;
            if(age != other.age)
                return false;
            if(name == null){
                if(other.name != null){
                    return  false;
                }
            } else if(!name.equals(other.name))
                return false;
            return true;
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