package spring.src03.main.java.com.company.pms;

import spring.src03.main.java.com.company.pms.domain.Member;
import spring.src03.main.java.com.company.pms.domain.Team;

import java.util.Scanner;

// ver 0.2 - 팀명으로 배열에서 팀 정보를 찾는 코드를 메서드로 분리
//            => getTeamIndex() 추가
//           회원아이디로 배열에서 회원 정보를 찾는 코드를 메서드로 분리
//            => getMemberIndex() 추가
//           사용자에게 y/N을 묻는 코드를 메서드로 분리
//            => confirm() 추가
public class App {
    static Scanner sc = new Scanner(System.in);

    static Team[] teams = new Team[1000];
    static int teamIndex = 0;
    static String option = null;
    static Member[] members = new Member[1000];
    static int memberIndex = 0;

    static boolean confirm(String message){
        System.out.printf("%s (y/N)", message);
        String input = sc.nextLine();
        if(input.toLowerCase().equals("y"))
            return true;
        else
            return false;
    }

    static int getTeamIndex(String name){
        for (int i = 0; i < teamIndex; i++) {
            if(teams[i] == null) continue;
            if(name.equals(teams[i].teamName.toLowerCase()))
                return i;
        }
        return -1;
    }

    static int getMemberIndex(String id){
        for (int i = 0; i < memberIndex; i++) {
            if(members[i] == null) continue;
            if(id.equals(members[i].id.toLowerCase()))
                return i;
        }
        return -1;
    }

    static String[] prompt(){
        System.out.print("명령> ");
        return sc.nextLine().toLowerCase().split(" ");
    }

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

    static void onTeamAdd(){
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

    static void onTeamList(){
        System.out.println("[팀 목록]");
        for (int i = 0; i < teamIndex; i++) {
            System.out.printf("%s, %s, %d, %s%n",
                    teams[i].teamName, teams[i].description,
                    teams[i].maxQty, teams[i].creationDate);
        }
    }

    static void onTeamView(){
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

    static void onTeamUpdate(){
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
            System.out.printf("팀명(%s)? ", team.creationDate);
            updateTeam.creationDate = sc.nextLine();
            teams[i] = updateTeam;
            System.out.println("변경하였습니다.");
        }
    }

    static void onTeamDelete(){
        System.out.println("[팀 정보 삭제]");
        if(option == null){
            System.out.println("팀명을 입력해 주세요.");
            return;
        }

        int i = getTeamIndex(option);

        if (i == -1){
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            if(confirm("정말 삭제하시겠습니까?")){
                teams[i] = null;
                System.out.println("삭제하였습니다.");
            }
        }
    }

    static void onMemberAdd(){
        System.out.println("[회원 정보 입력]");
        Member member = new Member();

        System.out.print("아이디? ");
        member.id = sc.nextLine();

        System.out.print("비밀번호? ");
        member.pwd = sc.nextLine();

        System.out.print("이메일? ");
        member.email = sc.nextLine();

        members[memberIndex++] = member;
    }

    static void onMemberList(){
        System.out.println("[회원 목록]");
        for (int i = 0; i < memberIndex; i++) {
            System.out.printf("%s, %s, %s%n",
                    members[i].id, members[i].pwd, members[i].email);
        }
    }


    static void onMemberView(){
        System.out.println("[회원 정보 조회]");
        if(option == null){
            System.out.println("아이디를 입력해 주세요.");
            return;
        }

       int i = getMemberIndex(option);


        if(i == -1){
            System.out.println("해당 아이디의 회원이 없습니다.");
        } else {
            Member member = members[i];
            System.out.printf("아이디 : %s%n", member.id);
            System.out.printf("비밀번호 : %s%n", member.pwd);
            System.out.printf("이메일 : %s%n", member.email);
        }
    }

    static void onMemberUpdate(){
        System.out.println("[회원 정보 변경]");
        if(option == null){
            System.out.println("아이디를 입력해 주세요.");
            return;
        }

        int i = getMemberIndex(option);

        if(i == -1){
            System.out.println("해당 아이디의 회원이 없습니다.");
        } else {
            Member member = members[i];
            Member updateMember = new Member();
            System.out.printf("아이디(%s)? ", member.id);
            updateMember.id = sc.nextLine();
            System.out.printf("비밀번호(%s)? ", member.pwd);
            updateMember.pwd = sc.nextLine();
            System.out.printf("이메일(%s)? ", member.email);
            updateMember.email = sc.nextLine();

            members[i] = updateMember;
            System.out.println("변경하였습니다.");
        }
    }

    static void onMemberDelete(){
        System.out.println("[회원 정보 삭제]");
        if(option == null){
            System.out.println("회원 아이디를 입력해 주세요.");
            return;
        }

        int i = getMemberIndex(option);

        if(i == -1){
            System.out.println("해당 회원이 없습니다.");
        } else {
            if(confirm("정말 삭제하시겠습니까?")){
                members[i] = null;
                System.out.println("삭제하였습니다.");
            }
        }
    }

    public static void main(String[] args) {
        boolean state = true;
        while(state){
            String[] arr = prompt();

            String menu = arr[0];
            if(arr.length == 2){
                option = arr[1];
            } else {
                option = null;
            }

            switch (menu){
                case "quit" : onQuit(); state = false; break;
                case "help" : onHelp(); break;
                case "team/add" : onTeamAdd(); break;
                case "team/list" : onTeamList(); break;
                case "team/view" : onTeamView(); break;
                case "team/update" : onTeamUpdate(); break;
                case "team/delete" : onTeamDelete(); break;
                case "member/add" : onMemberAdd(); break;
                case "member/list" : onMemberList(); break;
                case "member/view" : onMemberView(); break;
                case "member/update" : onMemberUpdate(); break;
                case "member/delete" : onMemberDelete(); break;
                default : System.out.println("명령어가 올바르지 않습니다.");  break;
            }
        }
    }
}
