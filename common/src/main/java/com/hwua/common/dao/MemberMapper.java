package com.hwua.common.dao;


import com.hwua.common.po.Member;

import java.util.List;
import java.util.Map;

public interface MemberMapper {
    /**
     * 用户注册
     * @param member
     * @return
     */
    public int insertMember(Member member);

    /**
     * 用户登录
     * @param param
     * @return
     */
    public List<Member> loginMember(Map<String, Object> param);

    /**
     * 查询所有会员
     * @return
     */
    public List<Member> memberList();

    /**
     * 启用会员
     * @param memberId
     * @return
     */
    public int startMember(Integer memberId);

    /**
     * 停用会员
     * @param memberId
     * @return
     */
    public int stopMember(Integer memberId);

    /**
     * 查询用户当前状态
     * @param memberId
     * @return
     */
    public int querystartMember(Integer memberId);
}
