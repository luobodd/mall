package com.hwua.front.service;



import com.hwua.common.po.Member;

import java.util.List;
import java.util.Map;

public interface MemberService {
    public int  insertMember(Member member);
    public List<Member> loginMember(Map<String,Object> param);
}
