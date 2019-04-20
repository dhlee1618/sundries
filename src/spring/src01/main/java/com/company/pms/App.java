package spring.src01.main.java.com.company.pms;

import java.io.InputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("팀명? ");
        String teamName = sc.nextLine();

        System.out.print("설명? ");
        String description = sc.nextLine();

        System.out.print("최대인원? ");
        int maxQty = sc.nextInt();
        sc.nextLine();

        System.out.print("시작? ");
        String startDate = sc.nextLine();

        System.out.print("종료일? ");
        String endDate = sc.nextLine();

        System.out.println("------------------");
        System.out.println("팀명 : " + teamName);
        System.out.println("설명 : " + description);
        System.out.println("최대인원 : " + maxQty);
        System.out.println("시작일 : " + startDate);
        System.out.println("종료일 : " + endDate);
    }
}
