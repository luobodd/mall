package com.hwua.common.dao;

import com.hwua.common.po.Address;

import java.util.List;

public interface AddressMapper {
    /**
     * 查看会员的收获地址
     * @param memberId
     * @return
     */
    public List<Address> queryMemberAddress(Integer memberId);

    /**
     * 添加一条收货地址
     * @param address
     * @return
     */
    public int insertMemberAddress(Address address);

    /**
     * 删除用户的一条收货地址
     * @param addressId
     * @param memberId
     * @return
     */
    public int deleteMemberAddress(Integer addressId,Integer memberId);
}
