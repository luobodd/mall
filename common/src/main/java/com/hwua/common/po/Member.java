package com.hwua.common.po;

import java.sql.Timestamp;

public class Member {
    private Integer memberId;
    private String memberName;
    private String memberPassword;
    private String gender;
    private String memberTel;
    private String memberMail;
    private Timestamp memberJoinDate;
    private Integer valid;

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", gender='" + gender + '\'' +
                ", memberTel='" + memberTel + '\'' +
                ", memberMail='" + memberMail + '\'' +
                ", memberJoinDate=" + memberJoinDate +
                ", valid=" + valid +
                '}';
    }

    public Member() {
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMemberTel() {
        return memberTel;
    }

    public void setMemberTel(String memberTel) {
        this.memberTel = memberTel;
    }

    public String getMemberMail() {
        return memberMail;
    }

    public void setMemberMail(String memberMail) {
        this.memberMail = memberMail;
    }

    public Timestamp getMemberJoinDate() {
        return memberJoinDate;
    }

    public void setMemberJoinDate(Timestamp memberJoinDate) {
        this.memberJoinDate = memberJoinDate;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}
