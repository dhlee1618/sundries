package basic.Generic;

public class Member {
    String name;
    int age;

    public Member(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
