package com.aitravelba.pojo.yihui;

import java.util.Date;

public class CollectionEntrustDebt {
    private Long id;

    private Long debtId;

    private Long entrustId;

    private Date entrustBeginTime; //CollectionEntrust

    private Date entrustExpireTime; //CollectionEntrust

    private Date entrustEndTime; //null

    private Byte status; //

    private Date createTime; //now

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDebtId() {
        return debtId;
    }

    public void setDebtId(Long debtId) {
        this.debtId = debtId;
    }

    public Long getEntrustId() {
        return entrustId;
    }

    public void setEntrustId(Long entrustId) {
        this.entrustId = entrustId;
    }

    public Date getEntrustBeginTime() {
        return entrustBeginTime;
    }

    public void setEntrustBeginTime(Date entrustBeginTime) {
        this.entrustBeginTime = entrustBeginTime;
    }

    public Date getEntrustExpireTime() {
        return entrustExpireTime;
    }

    public void setEntrustExpireTime(Date entrustExpireTime) {
        this.entrustExpireTime = entrustExpireTime;
    }

    public Date getEntrustEndTime() {
        return entrustEndTime;
    }

    public void setEntrustEndTime(Date entrustEndTime) {
        this.entrustEndTime = entrustEndTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}