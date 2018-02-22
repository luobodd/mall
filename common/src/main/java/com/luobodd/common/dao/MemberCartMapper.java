package com.luobodd.common.dao;

import com.luobodd.common.po.MemberCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MemberCartMapper {
    /**
     * 添加商品至购物车
     * @param memberCart
     * @return
     */
    public int insertProduct(MemberCart memberCart);

    /**
     * 删除会员购物车内单个商品
     * @param productId
     * @param memberId
     * @return
     */
    public int deleteProduct(@Param("productId") Integer productId, @Param("memberId") Integer memberId);

    /**
     * 通过当前会员的Id查询购物车,用于页面显示
     * @param memberId
     * @return
     */
    public List<Map<String,Object>> memberCartList(Integer memberId);

    /**
     * 修改购物车内商品数量
     * @param memberId
     * @param productId
     * @param productInCartNumber
     * @return
     */
    public int updateMemberInCartProductNumber(@Param("memberId")Integer memberId,@Param("productId")Integer productId,@Param("productInCartNumber")Integer productInCartNumber);


    /**
     * 查询用户购物车内商品总价
     * @param memberId
     * @return
     */
    public Double queryMemberCartPrice(Integer memberId);


    /**
     * 已完成支付的时候调用方法删除购物车内商品
     * @param memberId
     * @return
     */
    public int deleteMemberCart(Integer memberId);
}
