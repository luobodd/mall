package com.luobodd.front.controller;

import com.alibaba.fastjson.JSONObject;
import com.luobodd.common.po.MemberCart;
import com.luobodd.front.service.MemberCartService;
import com.luobodd.front.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/memberCart")
public class MemberCartController {
    @Autowired
    private MemberCartService memberCartService;
    @Autowired
    private ProductService productService;

    @RequestMapping("/addProductInCart")
    public String insertMemberCart(MemberCart memberCart, /*Integer memberId, */Integer productId, Integer productIncartNumber, HttpSession session){
        Integer memberId = (Integer) session.getAttribute("memberId");
        memberCart.setMemberId(memberId);
        memberCart.setProductId(productId);
        memberCart.setProductInCartNumber(productIncartNumber);
        int i = memberCartService.insertProduct(memberCart);
        if (i>0){

        return "add-cart-succed";
        }else {
            return "error";
        }
    }
    @RequestMapping("/memberCartList")
    public String memberCartList(HttpServletRequest request,HttpSession session){
        Integer memberId = (Integer) session.getAttribute("memberId");
        System.out.println("memberId = [" + memberId + "], request = [" + request + "]");
        List<Map<String, Object>> memberCartList = memberCartService.memberCartList(memberId);
        System.out.println("memberCartList = " + memberCartList);
        Double memberCartPrice = memberCartService.queryMemberCartPrice(memberId);
        request.setAttribute("memberCartPrice",memberCartPrice);
        request.setAttribute("memberCartList",memberCartList);
        return "cart";
    }
    @RequestMapping("/deleteCartProduct")
    public String deleteCartProduct(Integer productId,HttpSession session,HttpServletRequest request){
        Integer memberId = (Integer) session.getAttribute("memberId");
        int i = memberCartService.deleteProduct(productId, memberId);
        if (i>0){
            return "redirect:/memberCart/memberCartList?memberId="+memberId;
        }
        return "error";
    }
    @RequestMapping(value = "/updateMemberCartProductNumber",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String updateMemberCartProductNumber(HttpSession session,Integer productInCartNumber,Integer productId){
        System.out.println("productInCartNumber = " + productInCartNumber);
        System.out.println("productId = " + productId);
        Integer memberId = (Integer) session.getAttribute("memberId");
        int i = memberCartService.updateMemberCartProductNumber(memberId, productId, productInCartNumber);
        JSONObject jsonObject = new JSONObject();
        if (i>0){
            Double memberCartPrice = memberCartService.queryMemberCartPrice(memberId);
            jsonObject.put("msg",memberCartPrice);
            System.out.println(jsonObject);
            return jsonObject.toJSONString();
        }else {
            Double memberCartPrice = memberCartService.queryMemberCartPrice(memberId);
            jsonObject.put("msg",memberCartPrice);
            System.out.println(jsonObject);
            return jsonObject.toJSONString();
        }
    }
    @RequestMapping("deleteMemberCart")
    public String deleteMemberCart(HttpSession session){
        Integer memberId = (Integer) session.getAttribute("memberId");
        int i = memberCartService.deleteMemberCart(memberId);
        if (i>0){
            return "index";
        }else {
            return "error";
        }
    }
}
