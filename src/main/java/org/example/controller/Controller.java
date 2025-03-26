package org.example.controller;

import org.example.dto.Member;

public class Controller {

    protected static Member loginedMember = null;

    protected boolean isLogined() {
        return loginedMember != null;
    }

    public void doAction(String cmd, String actionMethodName) {
        // 구현 하지 마세요
    }



}
