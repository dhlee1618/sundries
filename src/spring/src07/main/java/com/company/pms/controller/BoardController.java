package spring.src07.main.java.com.company.pms.controller;

import spring.src07.main.java.com.company.pms.domain.Board;
import spring.src07.main.java.com.company.pms.util.Console;

import java.util.Scanner;

public class BoardController {
    public Scanner sc;

    Board[] boards = new Board[1000];
    int boardIndex = 0;
    int boardNo = 0;

    public void service(String menu, String option){
        if (menu.equals("board/add")) {
            onBoardAdd();
        } else if (menu.equals("board/list")) {
            onBoardList();
        } else if (menu.equals("board/view")) {
            onBoardView(option);
        } else if (menu.equals("board/update")) {
            onBoardUpdate(option);
        } else if (menu.equals("board/delete")) {
            onBoardDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    void onBoardAdd() {
        System.out.println("[게시물 입력]");
        Board board = new Board();

        board.no = ++boardNo;

        System.out.print("제목? ");
        board.title = sc.nextLine();

        System.out.print("내용? ");
        board.content = sc.nextLine();

        System.out.print("등록일? ");
        board.createdDate = sc.nextLine();

        boards[boardIndex++] = board;
    }

    void onBoardList() {
        System.out.println("[게시물 목록]");
        for (int i = 0; i < boardIndex; i++) {
            if(boards[i] == null) continue;
            System.out.printf("%d ,%s, %s, %s%n",
                    boards[i].no, boards[i].title,
                    boards[i].content, boards[i].createdDate);
        }
    }

    void onBoardView(String option) {
        System.out.println("[게시물 조회]");
        if(option == null) {
            System.out.println("게시물 번호를 입력하시기 바랍니다.");
            return;
        }
        int i = Integer.parseInt(option);

        if(i <= 0 || i > boardIndex+1){
            System.out.println("유효하지 않은 게시물 번호입니다.");
        } else{
            Board board = boards[i-1];
            System.out.printf("게시물 번호 : %d%n", board.no);
            System.out.printf("게시물 제목 : %s%n", board.title);
            System.out.printf("게시물 내용 : %s%n", board.content);
            System.out.printf("게시물 생성일 : %s%n", board.createdDate);
        }
    }

    void onBoardUpdate(String option) {
        System.out.println("[게시물 변경]");
        if(option == null){
            System.out.println("게시물 번호를 입력하시기 바랍니다.");
            return;
        }

        int i = Integer.parseInt(option);

        if(i <= 0 || i > boardIndex+1){
            System.out.println("유효하지 않는 게시물 번호입니다.");
        } else {
            Board board = boards[i-1];
            Board updateBoard = new Board();
            updateBoard.no = board.no;
            System.out.printf("게시물 제목(%s)? ", board.title);
            updateBoard.title = sc.nextLine();
            System.out.printf("게시물 내용(%s)? ", board.content);
            updateBoard.content = sc.nextLine();
            System.out.printf("게시물 생성일(%s)? ", board.createdDate);
            updateBoard.createdDate = sc.nextLine();

            boards[i-1] = updateBoard;
            System.out.println("변경하였습니다.");
        }
    }

    void onBoardDelete(String option) {
        System.out.println("[게시물 삭제]");
        if (option == null) {
            System.out.println("게시물 번호를 입력하시기 바랍니다.");
            return;
        }

        int i = Integer.parseInt(option);

        if(i <= 0 || i > boardIndex+1){
            System.out.println("유효하지 않은 게시물 번호입니다.");
        } else{
            if(Console.confirm("삭제하시겠습니까?")){
                boards[i-1] = null;
                System.out.println("삭제하였습니다.");
            }
        }
    }
}
