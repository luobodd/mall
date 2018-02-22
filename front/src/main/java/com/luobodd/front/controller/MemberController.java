package com.luobodd.front.controller;

import com.luobodd.common.po.Member;
import com.luobodd.front.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @RequestMapping("/register")
    public String insertMember(Member member, String memberName, String memberPassword, String memberTel, String memberMail){
        System.out.println("member = [" + member + "], memberName = [" + memberName + "], memberPassword = [" + memberPassword + "], memberTel = [" + memberTel + "], memberMail = [" + memberMail + "]");
        member.setMemberName(memberName);
        member.setMemberPassword(memberPassword);
        member.setMemberTel(memberTel);
        member.setMemberMail(memberMail);
        System.out.println("member = " + member);
        int i = memberService.insertMember(member);
        if (i > 0){
            System.out.println("注册成功");
            return "succed";
        }else {
            System.out.println("注册失败");
            return "error";
        }
    }
    @RequestMapping("/login")
    public String loginMember(Map<String,Object> member,Map<String,Object> param,String memberName,String memberPassword, HttpSession session){
        param.put("memberName",memberName);
        param.put("memberPassword",memberPassword);
        List<Member> members = memberService.loginMember(param);
        System.out.println("members = " + members);
        for (Member memberMap : members ) {
            member.put("memberName",memberMap.getMemberName());
            member.put("memberId",memberMap.getMemberId());
        }
        System.out.println(member);
        if (members.size()>0){
            System.out.println("登录成功");
            session.setAttribute("members",members);
            session.setAttribute("memberId",member.get("memberId"));
            session.setAttribute("memberName",member.get("memberName"));
            return "index";
        }else {
            System.out.println("登录失败");
            return "login-error";
        }
    }
    @RequestMapping("logOff")
    public String logOff(HttpSession session){
        session.invalidate();
        return "redirect:/login.jsp";
    }
}
