package com.hwua.front.controller;

import com.hwua.common.po.Address;
import com.hwua.front.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @RequestMapping("/queryMemberAddress")
    public String queryMemberAddress(HttpSession session, HttpServletRequest request){
        Integer memberId = (Integer) session.getAttribute("memberId");
        List<Address> memberAddressList = addressService.queryMemberAddress(memberId);
        System.out.println("memberAddressList = " + memberAddressList);
        request.setAttribute("memberAddressList",memberAddressList);
        return "address";
    }
    @RequestMapping("/addAddressPage")
    public String addAddressPage(){
        return "add-address";
    }
    @RequestMapping("insertMemberAddress")
    public String insertMemberAddress(HttpSession session,Address address,String addressName,String addressTel){
        Integer memberId = (Integer) session.getAttribute("memberId");
        address.setMemberId(memberId);
        address.setAddressName(addressName);
        address.setAddressTel(addressTel);
        int i = addressService.insertMemberAddress(address);
        if (i>0){
            return "wn-succed";
        }else {
        return "error";
        }
    }
}
