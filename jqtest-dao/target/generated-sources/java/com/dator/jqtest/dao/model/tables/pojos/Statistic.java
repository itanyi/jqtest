/**
 * This class is generated by jOOQ
 */
package com.dator.jqtest.dao.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Statistic implements Serializable {

    private static final long serialVersionUID = 2121123261;

    private Long       id;
    private Timestamp  timestamp;
    private String     statisticpos;
    private Long       bidid;
    private Long       campaignid;
    private String     packagename;
    private Integer    requestcount;
    private Integer    impressioncount;
    private Integer    downloadcount;
    private BigDecimal income;

    public Statistic() {}

    public Statistic(Statistic value) {
        this.id = value.id;
        this.timestamp = value.timestamp;
        this.statisticpos = value.statisticpos;
        this.bidid = value.bidid;
        this.campaignid = value.campaignid;
        this.packagename = value.packagename;
        this.requestcount = value.requestcount;
        this.impressioncount = value.impressioncount;
        this.downloadcount = value.downloadcount;
        this.income = value.income;
    }

    public Statistic(
        Long       id,
        Timestamp  timestamp,
        String     statisticpos,
        Long       bidid,
        Long       campaignid,
        String     packagename,
        Integer    requestcount,
        Integer    impressioncount,
        Integer    downloadcount,
        BigDecimal income
    ) {
        this.id = id;
        this.timestamp = timestamp;
        this.statisticpos = statisticpos;
        this.bidid = bidid;
        this.campaignid = campaignid;
        this.packagename = packagename;
        this.requestcount = requestcount;
        this.impressioncount = impressioncount;
        this.downloadcount = downloadcount;
        this.income = income;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatisticpos() {
        return this.statisticpos;
    }

    public void setStatisticpos(String statisticpos) {
        this.statisticpos = statisticpos;
    }

    public Long getBidid() {
        return this.bidid;
    }

    public void setBidid(Long bidid) {
        this.bidid = bidid;
    }

    public Long getCampaignid() {
        return this.campaignid;
    }

    public void setCampaignid(Long campaignid) {
        this.campaignid = campaignid;
    }

    public String getPackagename() {
        return this.packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public Integer getRequestcount() {
        return this.requestcount;
    }

    public void setRequestcount(Integer requestcount) {
        this.requestcount = requestcount;
    }

    public Integer getImpressioncount() {
        return this.impressioncount;
    }

    public void setImpressioncount(Integer impressioncount) {
        this.impressioncount = impressioncount;
    }

    public Integer getDownloadcount() {
        return this.downloadcount;
    }

    public void setDownloadcount(Integer downloadcount) {
        this.downloadcount = downloadcount;
    }

    public BigDecimal getIncome() {
        return this.income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Statistic (");

        sb.append(id);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(statisticpos);
        sb.append(", ").append(bidid);
        sb.append(", ").append(campaignid);
        sb.append(", ").append(packagename);
        sb.append(", ").append(requestcount);
        sb.append(", ").append(impressioncount);
        sb.append(", ").append(downloadcount);
        sb.append(", ").append(income);

        sb.append(")");
        return sb.toString();
    }
}