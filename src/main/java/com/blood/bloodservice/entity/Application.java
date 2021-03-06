package com.blood.bloodservice.entity;

import java.io.Serializable;
import java.util.List;

public class Application implements Serializable {
    private Integer aid;

    private Integer yid;

    private String applyblood;

    private Double applyamount;

    private Integer state;

    private String adate;

    //添加了doctor属性
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public String getApplyblood() {
        return applyblood;
    }

    public void setApplyblood(String applyblood) {
        this.applyblood = applyblood == null ? null : applyblood.trim();
    }

    public Double getApplyamount() {
        return applyamount;
    }

    public void setApplyamount(Double applyamount) {
        this.applyamount = applyamount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAdate() {
        return adate;
    }

    public void setAdate(String adate) {
        this.adate = adate == null ? null : adate.trim();
    }

    @Override
    public String toString() {
        return "Application{" +
                "aid=" + aid +
                ", yid=" + yid +
                ", applyblood='" + applyblood + '\'' +
                ", applyamount=" + applyamount +
                ", state=" + state +
                ", adate='" + adate + '\'' +
                ", doctor=" + doctor +
                '}';
    }
}