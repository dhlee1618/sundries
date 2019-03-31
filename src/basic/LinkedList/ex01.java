package basic.LinkedList;

public class ex01 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";
        String s4 = "ddd";
        String s5 = "eee";

        LinkedList list = new LinkedList();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());

        System.out.println(list.remove(1));
        print(list);

        list.add(4);
        list.add(1, 5);
        print(list);

        list.add(0, s2);
        print(list);

        list.add(5,"xxx");
        print(list);

    }
    static void print(LinkedList list){
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + ", ");
        }
        System.out.println();
    }
}
