package com.luobodd.common.po;

public class Address {
    private Integer addressId;
    private Integer memberId;
    private String addressName;
    private String addressTel;

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", memberId=" + memberId +
                ", addressName='" + addressName + '\'' +
                ", addressTel='" + addressTel + '\'' +
                '}';
    }

    public Address() {
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressTel() {
        return addressTel;
    }

    public void setAddressTel(String addressTel) {
        this.addressTel = addressTel;
    }
}
