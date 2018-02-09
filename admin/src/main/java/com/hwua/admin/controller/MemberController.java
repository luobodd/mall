package com.hwua.admin.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hwua.admin.service.MemberService;
import com.hwua.common.po.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @RequestMapping("memberList")
    public String memberList(Map<String,Object> map){
        List<Member> memberList = memberService.memberList();
        map.put("memberList",memberList);
        map.put("memberListSize",memberList.size());
        return "member-list";
    }
    @RequestMapping(value = "/startMember",produces = "application/json;charset=utf-8")
    public String memberStart(Integer memberId){
        System.out.println("memberId = " + memberId);
        int startMember = memberService.querystartMember(memberId);
        if (startMember==0){
            memberService.startMember(memberId);
            return "redirect:/member/memberList";
        }else {
            memberService.shopMember(memberId);
            return "redirect:/member/memberList";
        }
    }
}
