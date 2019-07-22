package com.ma.core.po;

import java.util.Date;

public class Section {
    private String id;

    private String hospitalId;

    private String deptId;

    private String deptAttrId;

    private String deptAttrCode;

    private String creatorId;

    private Date createTime;

    private String creatorName;

    private String updaterId;

    private Date updateTime;

    private String updaterName;

    private String corporateCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptAttrId() {
        return deptAttrId;
    }

    public void setDeptAttrId(String deptAttrId) {
        this.deptAttrId = deptAttrId == null ? null : deptAttrId.trim();
    }

    public String getDeptAttrCode() {
        return deptAttrCode;
    }

    public void setDeptAttrCode(String deptAttrCode) {
        this.deptAttrCode = deptAttrCode == null ? null : deptAttrCode.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId == null ? null : updaterId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdaterName() {
        return updaterName;
    }

    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName == null ? null : updaterName.trim();
    }

    public String getCorporateCode() {
        return corporateCode;
    }

    public void setCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode == null ? null : corporateCode.trim();
    }
}