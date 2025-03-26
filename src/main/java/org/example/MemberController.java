package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberController {

    Scanner sc;
    List<Member> members;

    int lastMemberId = 3;

    public MemberController(Scanner sc) {
        this.sc = sc;
        members = new ArrayList<>();
    }

    public void doJoin() {
        System.out.println("==회원가입==");
        int id = lastMemberId + 1;
        String regDate = Util.getNowStr();
        String loginId = null;
        while (true) {
            System.out.print("로그인 아이디 : ");
            loginId = sc.nextLine().trim();
            if (isJoinableLoginId(loginId) == false) {
                System.out.println("이미 사용중이야");
                continue;
            }
            break;
        }
        String password = null;
        while (true) {
            System.out.print("비밀번호 : ");
            password = sc.nextLine().trim();
            System.out.print("비밀번호 확인: ");
            String passwordConfirm = sc.nextLine().trim();

            if (password.equals(passwordConfirm) == false) {
                System.out.println("비번 확인해");
                continue;
            }
            break;
        }

        System.out.print("이름 : ");
        String name = sc.nextLine().trim();

        Member member = new Member(id, regDate, loginId, password, name);
        members.add(member);

        System.out.println(id + "번 회원이 가입되었습니다");
        lastMemberId++;
    }

    private boolean isJoinableLoginId(String loginId) {
        for (Member member : members) {
            if (member.getLoginId().equals(loginId)) {
                return false;
            }
        }
        return true;
    }

    void makeTestData() {
        System.out.println("==회원 테스트 데이터 생성==");
        members.add(new Member(1, Util.getNowStr(), "test1", "test1", "test1"));
        members.add(new Member(2, Util.getNowStr(), "test2", "test2", "test2"));
        members.add(new Member(3, Util.getNowStr(), "test3", "test3", "test3"));
    }
}
