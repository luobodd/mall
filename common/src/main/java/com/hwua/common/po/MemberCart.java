package com.hwua.common.po;

public class MemberCart {
    private Integer memberCartId;
    private Integer memberId;
    private Integer productId;
    private Integer productInCartNumber;

    @Override
    public String toString() {
        return "MemberCart{" +
                "memberCartId=" + memberCartId +
                ", memberId=" + memberId +
                ", productId=" + productId +
                ", productInCartNumber=" + productInCartNumber +
                '}';
    }

    public MemberCart() {
    }

    public Integer getMemberCartId() {
        return memberCartId;
    }

    public void setMemberCartId(Integer memberCartId) {
        this.memberCartId = memberCartId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductInCartNumber() {
        return productInCartNumber;
    }

    public void setProductInCartNumber(Integer productInCartNumber) {
        this.productInCartNumber = productInCartNumber;
    }
}
