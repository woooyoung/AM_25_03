package org.example;

import java.util.Scanner;

public class App {

    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("==프로그램 시작==");

        MemberController memberController = new MemberController(sc);
        ArticleController articleController = new ArticleController(sc);

        articleController.makeTestData();
        memberController.makeTestData();

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.length() == 0) {
                System.out.println("명령어를 입력하세요");
                continue;
            }
            if (cmd.equals("exit")) {
                break;
            }

            if (cmd.equals("member join")) {
                memberController.doJoin();
            } else if (cmd.equals("article write")) {
                articleController.doWrite();
            } else if (cmd.startsWith("article list")) {
               articleController.showList(cmd);
            } else if (cmd.startsWith("article detail")) {
               articleController.showDetail(cmd);
            } else if (cmd.startsWith("article delete")) {
               articleController.doDelete(cmd);
            } else if (cmd.startsWith("article modify")) {
              articleController.doModify(cmd);
            } else {
                System.out.println("사용할 수 없는 명령어입니다");
            }

        }

        System.out.println("==프로그램 끝==");
        sc.close();
    }
}
