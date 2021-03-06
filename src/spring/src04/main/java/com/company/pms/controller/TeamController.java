package spring.src04.main.java.com.company.pms.controller;

import spring.src04.main.java.com.company.pms.domain.Team;
import spring.src04.main.java.com.company.pms.util.Console;

import java.util.Scanner;

public class TeamController {
    public static Scanner sc;

    static Team[] teams = new Team[1000];
    static int teamIndex = 0;

    public static int getTeamIndex(String name){
        for (int i = 0; i < teamIndex; i++) {
            if(teams[i] == null) continue;
            if(name.equals(teams[i].teamName.toLowerCase()))
                return i;
        }
        return -1;
    }

    public static void onTeamAdd(){
        System.out.println("[팀 정보 입력]");
        Team team = new Team();

        System.out.print("팀명? ");
        team.teamName = sc.nextLine();

        System.out.print("설명? ");
        team.description = sc.nextLine();

        System.out.print("최대인원? ");
        team.maxQty = sc.nextInt();
        sc.nextLine();

        System.out.print("창단일? ");
        team.creationDate = sc.nextLine();

        teams[teamIndex++] = team;
    }

    public static void onTeamList(){
        System.out.println("[팀 목록]");
        for (int i = 0; i < teamIndex; i++) {
            System.out.printf("%s, %s, %d, %s%n",
                    teams[i].teamName, teams[i].description,
                    teams[i].maxQty, teams[i].creationDate);
        }
    }

    public static void onTeamView(String option){
        System.out.println("[팀 정보 조회]");

        if(option == null){
            System.out.println("팀명을 입력해 주세요.");
            return;
        }

        int i = getTeamIndex(option);

        if(i == -1){
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            Team team = teams[i];
            System.out.printf("팀명 : %s%n", team.teamName);
            System.out.printf("설명 : %s%n", team.description);
            System.out.printf("최대인원 : %d%n", team.maxQty);
            System.out.printf("창설일 : %s%n", team.creationDate);
        }
    }

    public static void onTeamUpdate(String option){
        System.out.println("[팀 정보 변경]");

        if(option == null){
            System.out.println("팀명을 입력해 주세요.");
            return;
        }

        int i = getTeamIndex(option);

        if(i == -1){
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            Team team = teams[i];
            Team updateTeam = new Team();
            System.out.printf("팀명(%s)? ", team.teamName);
            updateTeam.teamName = sc.nextLine();
            System.out.printf("설명(%s)? ", team.description);
            updateTeam.description = sc.nextLine();
            System.out.printf("최대인원(%d)? ", team.maxQty);
            updateTeam.maxQty = sc.nextInt();
            sc.nextLine();
            System.out.printf("창설일(%s)? ", team.creationDate);
            updateTeam.creationDate = sc.nextLine();
            teams[i] = updateTeam;
            System.out.println("변경하였습니다.");
        }
    }

    public static void onTeamDelete(String option){
        System.out.println("[팀 정보 삭제]");
        if(option == null){
            System.out.println("팀명을 입력해 주세요.");
            return;
        }

        int i = getTeamIndex(option);

        if (i == -1){
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            if(Console.confirm("정말 삭제하시겠습니까?")){
                teams[i] = null;
                System.out.println("삭제하였습니다.");
            }
        }
    }
}
