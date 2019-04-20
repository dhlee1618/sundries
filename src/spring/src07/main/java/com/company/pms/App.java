package spring.src07.main.java.com.company.pms;

import spring.src07.main.java.com.company.pms.controller.BoardController;
import spring.src07.main.java.com.company.pms.controller.MemberController;
import spring.src07.main.java.com.company.pms.controller.TeamController;
import spring.src07.main.java.com.company.pms.util.Console;

import java.util.Scanner;


// ver 0.6 - 인스턴스 변수, 인스턴스 메서드로 바꿈
public class App {
    static Scanner sc = new Scanner(System.in);
    public static String option = null;


    static void onQuit(){
        System.out.println("Bye!");

    }

    static void onHelp(){
        System.out.println("[도움말]");
        System.out.println("팀 등록 명령 : team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상세조회 명령 : team/view 팀명");
        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세조회 명령 : member/view 아이디");
        System.out.println("종료 : quit");
    }

    public static void main(String[] args) {
        TeamController teamController = new TeamController();
        teamController.sc = sc;

        MemberController memberController = new MemberController();
        memberController.sc = sc;

        BoardController boardController = new BoardController();
        boardController.sc = sc;

        Console.sc = sc;

        boolean state = true;
        while(state){
            String[] arr = Console.prompt();

            String menu = arr[0];
            if(arr.length == 2){
                option = arr[1];
            } else {
                option = null;
            }

            if(menu.equals("quit")){
                onQuit();
                break;
            } else if(menu.equals("help")){
                onHelp();
            } else if(menu.startsWith("team/")){
                teamController.service(menu, option);
            } else if(menu.startsWith("member/")){
                memberController.service(menu, option);
            } else if(menu.startsWith("board/")){
                boardController.service(menu, option);
            } else {
                System.out.println("명령어가 올바르지 않습니다.");
            }
        }
    }
}
