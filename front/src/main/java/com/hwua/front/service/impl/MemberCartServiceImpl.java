package com.hwua.front.service.impl;

import com.hwua.common.dao.MemberCartMapper;
import com.hwua.common.po.MemberCart;
import com.hwua.front.service.MemberCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("memberCartService")
public class MemberCartServiceImpl implements MemberCartService {
    @Autowired
    private MemberCartMapper memberCartMapper;
    @Override
    public int insertProduct(MemberCart memberCart) {
        return memberCartMapper.insertProduct(memberCart);
    }

    @Override
    public int deleteProduct(Integer productId,Integer memberId) {
        return memberCartMapper.deleteProduct(productId,memberId);
    }

    @Override
    public List<Map<String, Object>> memberCartList(Integer memberId) {
        return memberCartMapper.memberCartList(memberId);
    }

    @Override
    public int updateMemberCartProductNumber(Integer memberId, Integer productId, Integer productInCartNumber) {
        return memberCartMapper.updateMemberInCartProductNumber(memberId,productId,productInCartNumber);
    }

    @Override
    public Double queryMemberCartPrice(Integer memberId) {
        return memberCartMapper.queryMemberCartPrice(memberId);
    }

    @Override
    public int deleteMemberCart(Integer memberId) {
        return memberCartMapper.deleteMemberCart(memberId);
    }
}
