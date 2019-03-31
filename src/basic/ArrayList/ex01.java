package basic.ArrayList;

public class ex01 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";
        String s4 = "ddd";

        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        print(list);

        System.out.println(list.contains("ddd"));
    }

    static void print(ArrayList list){
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i) + ",");
        }
        System.out.println();
    }
}
