// Copyright 2020 ADTIMING TECHNOLOGY COMPANY LIMITED
// Licensed under the GNU Lesser General Public License Version 3

package com.adtiming.om.ds.model;

import java.math.BigDecimal;
import java.util.Date;

public class OmPlacementRuleSegment {
    private Integer id;

    private Integer placementId;

    private String countries;

    private Integer frequency;

    private Byte conType;

    private String gender;

    private String interest;

    private BigDecimal iapMin;

    private BigDecimal iapMax;

    private Integer priority;

    private Byte status;

    private Date createTime;

    private Date lastmodify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlacementId() {
        return placementId;
    }

    public void setPlacementId(Integer placementId) {
        this.placementId = placementId;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries == null ? null : countries.trim();
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Byte getConType() {
        return conType;
    }

    public void setConType(Byte conType) {
        this.conType = conType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest == null ? null : interest.trim();
    }

    public BigDecimal getIapMin() {
        return iapMin;
    }

    public void setIapMin(BigDecimal iapMin) {
        this.iapMin = iapMin;
    }

    public BigDecimal getIapMax() {
        return iapMax;
    }

    public void setIapMax(BigDecimal iapMax) {
        this.iapMax = iapMax;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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

    public Date getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Date lastmodify) {
        this.lastmodify = lastmodify;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OmPlacementRuleSegment other = (OmPlacementRuleSegment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getPlacementId() == null ? other.getPlacementId() == null : this.getPlacementId().equals(other.getPlacementId()))
                && (this.getCountries() == null ? other.getCountries() == null : this.getCountries().equals(other.getCountries()))
                && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
                && (this.getConType() == null ? other.getConType() == null : this.getConType().equals(other.getConType()))
                && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
                && (this.getInterest() == null ? other.getInterest() == null : this.getInterest().equals(other.getInterest()))
                && (this.getIapMin() == null ? other.getIapMin() == null : this.getIapMin().equals(other.getIapMin()))
                && (this.getIapMax() == null ? other.getIapMax() == null : this.getIapMax().equals(other.getIapMax()))
                && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getLastmodify() == null ? other.getLastmodify() == null : this.getLastmodify().equals(other.getLastmodify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlacementId() == null) ? 0 : getPlacementId().hashCode());
        result = prime * result + ((getCountries() == null) ? 0 : getCountries().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getConType() == null) ? 0 : getConType().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getInterest() == null) ? 0 : getInterest().hashCode());
        result = prime * result + ((getIapMin() == null) ? 0 : getIapMin().hashCode());
        result = prime * result + ((getIapMax() == null) ? 0 : getIapMax().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastmodify() == null) ? 0 : getLastmodify().hashCode());
        return result;
    }
}