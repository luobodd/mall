package com.luobodd.front.service.impl;

import com.luobodd.common.dao.MemberMapper;
import com.luobodd.common.po.Member;
import com.luobodd.front.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public int insertMember(Member member) {

        return memberMapper.insertMember(member);
    }

    @Override
    public List<Member> loginMember(Map<String, Object> param) {
        return memberMapper.loginMember(param);
    }
}
