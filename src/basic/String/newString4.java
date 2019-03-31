package basic.String;

public class newString4 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        System.out.println(s1);
        System.out.println(s1.toString());

        String s2 = s1.toString();

        if(s1 == s2){
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        Object obj = new String("Hello");

        String x1 = (String)obj;
        String x2 = obj.toString();

        x1.toLowerCase();
        ((String)obj).toLowerCase();

        x2.toLowerCase();
        obj.toString().toLowerCase();

        if(x1 == x2){
            System.out.println("x1 == x2");
        } else{
            System.out.println("x1 != x2");
        }
    }
}
