/**
 * This class is generated by jOOQ
 */
package com.dator.jqtest.dao.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

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
public class Businessbudgetratio implements Serializable {

    private static final long serialVersionUID = -1291018292;

    private Integer    id;
    private Long       campaignId;
    private String     businessId;
    private BigDecimal ratio;

    public Businessbudgetratio() {}

    public Businessbudgetratio(Businessbudgetratio value) {
        this.id = value.id;
        this.campaignId = value.campaignId;
        this.businessId = value.businessId;
        this.ratio = value.ratio;
    }

    public Businessbudgetratio(
        Integer    id,
        Long       campaignId,
        String     businessId,
        BigDecimal ratio
    ) {
        this.id = id;
        this.campaignId = campaignId;
        this.businessId = businessId;
        this.ratio = ratio;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public BigDecimal getRatio() {
        return this.ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Businessbudgetratio (");

        sb.append(id);
        sb.append(", ").append(campaignId);
        sb.append(", ").append(businessId);
        sb.append(", ").append(ratio);

        sb.append(")");
        return sb.toString();
    }
}
