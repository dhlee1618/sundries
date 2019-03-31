package basic.String;

public class newString3 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = s1.replace("l","x");
        System.out.printf("%s : %s%n", s1,s2);

        String s3 = s1.concat(", world");
        System.out.printf("%s : %s%n", s1,s3);

        StringBuffer buf = new StringBuffer("Hello");
        buf.replace(2,4,"xx");
        System.out.println("buf");

        StringBuffer b1 = new StringBuffer("Hello");
        StringBuffer b2 = new StringBuffer("Hello");
        if(b1.equals(b2)){
            System.out.println("b1과 b2는 같다");
        } else{
            System.out.println("b1과 b2는 다르다");
        }

        if(b1 == b2){
            System.out.println("b1 == b2");
        } else{
            System.out.println("b1 != b2");
        }


        if(b1.toString().equals(b2.toString())){
            System.out.println("b1.toString() == b2.toString()");
        } else{
            System.out.println("b1.toString() != b2.toString()");
        }
    }
}
