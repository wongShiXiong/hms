package com.hms.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TbBookroom {
    private Integer aId;

    private Integer aRoomid;
/*    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")*/
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date aBooktime;

    private Integer aBookdays;
/*    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")*/
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date aEndtime;

    private Integer aCustomerid;

    private String aCustomername;

    private String aType;

    private String aActualvalue;

    private String aShouquvalue;

    private String aDiscoutvalue;

    private String aValuestate;

    private String aState;

    private String aRetirement;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getaRoomid() {
        return aRoomid;
    }

    public void setaRoomid(Integer aRoomid) {
        this.aRoomid = aRoomid;
    }

    public Date getaBooktime() {
        return aBooktime;
    }

    public void setaBooktime(Date aBooktime) {
        this.aBooktime = aBooktime;
    }

    public Integer getaBookdays() {
        return aBookdays;
    }

    public void setaBookdays(Integer aBookdays) {
        this.aBookdays = aBookdays;
    }

    public Date getaEndtime() {
        return aEndtime;
    }

    public void setaEndtime(Date aEndtime) {
        this.aEndtime = aEndtime;
    }

    public Integer getaCustomerid() {
        return aCustomerid;
    }

    public void setaCustomerid(Integer aCustomerid) {
        this.aCustomerid = aCustomerid;
    }

    public String getaCustomername() {
        return aCustomername;
    }

    public void setaCustomername(String aCustomername) {
        this.aCustomername = aCustomername == null ? null : aCustomername.trim();
    }

    public String getaType() {
        return aType;
    }

    public void setaType(String aType) {
        this.aType = aType == null ? null : aType.trim();
    }

    public String getaActualvalue() {
        return aActualvalue;
    }

    public void setaActualvalue(String aActualvalue) {
        this.aActualvalue = aActualvalue == null ? null : aActualvalue.trim();
    }

    public String getaShouquvalue() {
        return aShouquvalue;
    }

    public void setaShouquvalue(String aShouquvalue) {
        this.aShouquvalue = aShouquvalue == null ? null : aShouquvalue.trim();
    }

    public String getaDiscoutvalue() {
        return aDiscoutvalue;
    }

    public void setaDiscoutvalue(String aDiscoutvalue) {
        this.aDiscoutvalue = aDiscoutvalue == null ? null : aDiscoutvalue.trim();
    }

    public String getaValuestate() {
        return aValuestate;
    }

    public void setaValuestate(String aValuestate) {
        this.aValuestate = aValuestate == null ? null : aValuestate.trim();
    }

    public String getaState() {
        return aState;
    }

    public void setaState(String aState) {
        this.aState = aState == null ? null : aState.trim();
    }

    public String getaRetirement() {
        return aRetirement;
    }

    public void setaRetirement(String aRetirement) {
        this.aRetirement = aRetirement == null ? null : aRetirement.trim();
    }
}