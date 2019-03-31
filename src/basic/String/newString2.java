package basic.String;

public class newString2 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";

        if(((String) s1).equals(s2)){
            System.out.println("s1과 s2는 같다");
        } else {
            System.out.println("s1과 s2는 다르다");
        }

        if(((String) s1).equals(s3)){
            System.out.println("s1과 s3은 같다");
        } else{
            System.out.println("s1과 s3은 다르다");
        }

    }
}
