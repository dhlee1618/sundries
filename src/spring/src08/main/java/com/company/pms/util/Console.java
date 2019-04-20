package spring.src08.main.java.com.company.pms.util;

import java.util.Scanner;

public class Console {
    public static Scanner sc;

    public static boolean confirm(String message){
        System.out.printf("%s (y/N)", message);
        String input = sc.nextLine().toLowerCase();
        if(input.equals("y"))
            return true;
        else
            return false;
    }

    public static String[] prompt(){
        System.out.print("명령> ");
        return sc.nextLine().toLowerCase().split(" ");
    }
}
