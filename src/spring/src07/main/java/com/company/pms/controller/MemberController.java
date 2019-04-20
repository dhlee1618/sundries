package spring.src07.main.java.com.company.pms.controller;

import spring.src07.main.java.com.company.pms.domain.Member;
import spring.src07.main.java.com.company.pms.util.Console;

import java.util.Scanner;

public class MemberController {
    public  Scanner sc;

    Member[] members = new Member[1000];
    int memberIndex = 0;

    public void service(String menu, String option){
        switch (menu){
            case "member/add" : onMemberAdd(); break;
            case "member/list" : onMemberList(); break;
            case "member/view" : onMemberView(option); break;
            case "member/update" : onMemberUpdate(option); break;
            case "member/delete" : onMemberDelete(option); break;
            default :
                System.out.println("명령어가 올바르지 않습니다."); break;
        }
    }


    int getMemberIndex(String id) {
        int i = 0;
        for (i = 0; i < memberIndex; i++) {
            if (members[i] == null) continue;
            if (id.equals(members[i].id.toLowerCase()))
                return i;
        }
        return -1;
    }

    void onMemberAdd() {
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

    void onMemberList() {
        System.out.println("[회원 목록]");
        for (int i = 0; i < memberIndex; i++) {
            System.out.printf("%s, %s, %s%n",
                    members[i].id, members[i].pwd, members[i].email);
        }
    }


    void onMemberView(String option) {
        System.out.println("[회원 정보 조회]");
        if (option == null) {
            System.out.println("아이디를 입력해 주세요.");
            return;
        }

        int i = getMemberIndex(option);


        if (i == -1) {
            System.out.println("해당 아이디의 회원이 없습니다.");
        } else {
            Member member = members[i];
            System.out.printf("아이디 : %s%n", member.id);
            System.out.printf("비밀번호 : %s%n", member.pwd);
            System.out.printf("이메일 : %s%n", member.email);
        }
    }

    void onMemberUpdate(String option) {
        System.out.println("[회원 정보 변경]");
        if (option == null) {
            System.out.println("아이디를 입력해 주세요.");
            return;
        }

        int i = getMemberIndex(option);

        if (i == -1) {
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

    void onMemberDelete(String option) {
        System.out.println("[회원 정보 삭제]");
        if (option == null) {
            System.out.println("회원 아이디를 입력해 주세요.");
            return;
        }

        int i = getMemberIndex(option);

        if (i == -1) {
            System.out.println("해당 회원이 없습니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                members[i] = null;
                System.out.println("삭제하였습니다.");
            }
        }
    }
}
