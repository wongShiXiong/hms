package com.hms.pojo;

public class TbCustomer {
    private Integer cId;

    private String cName;

    private String cSex;

    private String cCardstyle;

    private String cCardno;

    private String cAddress;

    private String cPhoneno;

    private String cState;

    private String cTotalmoney;

    private String cType;

    private String cDiscount;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcSex() {
        return cSex;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex == null ? null : cSex.trim();
    }

    public String getcCardstyle() {
        return cCardstyle;
    }

    public void setcCardstyle(String cCardstyle) {
        this.cCardstyle = cCardstyle == null ? null : cCardstyle.trim();
    }

    public String getcCardno() {
        return cCardno;
    }

    public void setcCardno(String cCardno) {
        this.cCardno = cCardno == null ? null : cCardno.trim();
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress == null ? null : cAddress.trim();
    }

    public String getcPhoneno() {
        return cPhoneno;
    }

    public void setcPhoneno(String cPhoneno) {
        this.cPhoneno = cPhoneno == null ? null : cPhoneno.trim();
    }

    public String getcState() {
        return cState;
    }

    public void setcState(String cState) {
        this.cState = cState == null ? null : cState.trim();
    }

    public String getcTotalmoney() {
        return cTotalmoney;
    }

    public void setcTotalmoney(String cTotalmoney) {
        this.cTotalmoney = cTotalmoney == null ? null : cTotalmoney.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public String getcDiscount() {
        return cDiscount;
    }

    public void setcDiscount(String cDiscount) {
        this.cDiscount = cDiscount == null ? null : cDiscount.trim();
    }
}