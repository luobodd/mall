package com.hwua.admin.service.impl;

import com.hwua.admin.service.MemberService;
import com.hwua.common.dao.MemberMapper;
import com.hwua.common.po.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public List<Member> memberList() {
        return memberMapper.memberList();
    }

    @Override
    public int startMember(Integer memberId) {
        return memberMapper.startMember(memberId);
    }

    @Override
    public int shopMember(Integer memberId) {
        return memberMapper.stopMember(memberId);
    }

    @Override
    public int querystartMember(Integer memberId) {
        return memberMapper.querystartMember(memberId);
    }
}
