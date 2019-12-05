package com.hms.pojo;

public class TbRoomtype {
    private Integer rpId;

    private Integer rtId;

    private String rtName;

    private String rtPrice;

    private String rtDescripe;

    private String rtState;

    public Integer getRpId() {
        return rpId;
    }

    public void setRpId(Integer rpId) {
        this.rpId = rpId;
    }

    public Integer getRtId() {
        return rtId;
    }

    public void setRtId(Integer rtId) {
        this.rtId = rtId;
    }

    public String getRtName() {
        return rtName;
    }

    public void setRtName(String rtName) {
        this.rtName = rtName == null ? null : rtName.trim();
    }

    public String getRtPrice() {
        return rtPrice;
    }

    public void setRtPrice(String rtPrice) {
        this.rtPrice = rtPrice == null ? null : rtPrice.trim();
    }

    public String getRtDescripe() {
        return rtDescripe;
    }

    public void setRtDescripe(String rtDescripe) {
        this.rtDescripe = rtDescripe == null ? null : rtDescripe.trim();
    }

    public String getRtState() {
        return rtState;
    }

    public void setRtState(String rtState) {
        this.rtState = rtState == null ? null : rtState.trim();
    }
}