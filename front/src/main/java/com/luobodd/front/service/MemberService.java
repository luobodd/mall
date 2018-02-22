package com.luobodd.front.service;



import com.luobodd.common.po.Member;

import java.util.List;
import java.util.Map;

public interface MemberService {
    public int  insertMember(Member member);
    public List<Member> loginMember(Map<String,Object> param);
}
