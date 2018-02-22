package com.luobodd.front.service.impl;

import com.luobodd.common.dao.AddressMapper;
import com.luobodd.common.po.Address;
import com.luobodd.front.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("addressService")
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public List<Address> queryMemberAddress(Integer memberId) {
        return addressMapper.queryMemberAddress(memberId);
    }

    @Override
    public int insertMemberAddress(Address address) {
        return addressMapper.insertMemberAddress(address);
    }

    @Override
    public int deleteMemberAddress(Integer addressId, Integer memberId) {
        return addressMapper.deleteMemberAddress(addressId,memberId);
    }
}
