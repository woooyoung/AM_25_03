package org.example.dao;

import org.example.dto.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    public List<Member> members;

    public MemberDao() {
        members = new ArrayList<>();
    }

}
