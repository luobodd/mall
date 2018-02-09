package com.hwua.front.service;

import com.hwua.common.po.MemberCart;

import java.util.List;
import java.util.Map;

public interface MemberCartService {

    public int insertProduct(MemberCart memberCart);
    public int deleteProduct(Integer productId,Integer memberId);
    public List<Map<String,Object>> memberCartList(Integer memberId);
    public int updateMemberCartProductNumber(Integer memberId,Integer productId,Integer productInCartNumber);
    public Double queryMemberCartPrice(Integer memberId);
    public int deleteMemberCart(Integer memberId);
}
