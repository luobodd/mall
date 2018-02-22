package com.luobodd.admin.service;

import com.luobodd.common.po.Member;

import java.util.List;

public interface MemberService {
    public List<Member> memberList();
    public int startMember(Integer memberId);
    public int shopMember(Integer memberId);
    public int querystartMember(Integer memberId);
}
