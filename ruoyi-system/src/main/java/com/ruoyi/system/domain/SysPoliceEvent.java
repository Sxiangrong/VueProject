package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;

import java.util.Date;

/**
 * 观影，春秋游记录表
 *
 * @author lianyao
 */
public class SysPoliceEvent {
    private long userId;
    private long deptId;
    private String itemEvent;
    private String money;
    private String peopleAccount;
    private String company;
    private String applyPeople;
    private String writeTime;
    /** 状态（0已申请 1同意 2驳回） */
    @Excel(name = "状态", readConverterExp = "0=已申请,1=同意,2=驳回")
    private String state;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getItemEvent() {
        return itemEvent;
    }

    public void setItemEvent(String itemEvent) {
        this.itemEvent = itemEvent;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getPeopleAccount() {
        return peopleAccount;
    }

    public void setPeopleAccount(String peopleAccount) {
        this.peopleAccount = peopleAccount;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getApplyPeople() {
        return applyPeople;
    }

    public void setApplyPeople(String applyPeople) {
        this.applyPeople = applyPeople;
    }

    public String getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(String writeTime) {
        this.writeTime = writeTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "SysPoliceEvent{" +
                "userId=" + userId +
                ", deptId=" + deptId +
                ", itemEvent='" + itemEvent + '\'' +
                ", money='" + money + '\'' +
                ", peopleAccount='" + peopleAccount + '\'' +
                ", company='" + company + '\'' +
                ", applyPeople='" + applyPeople + '\'' +
                ", writeTime=" + writeTime +
                ", state='" + state + '\'' +
                '}';
    }
    
}
