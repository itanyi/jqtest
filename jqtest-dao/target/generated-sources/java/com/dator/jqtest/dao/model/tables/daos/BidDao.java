/**
 * This class is generated by jOOQ
 */
package com.dator.jqtest.dao.model.tables.daos;


import com.dator.jqtest.dao.model.tables.Bid;
import com.dator.jqtest.dao.model.tables.records.BidRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
@Repository
public class BidDao extends DAOImpl<BidRecord, com.dator.jqtest.dao.model.tables.pojos.Bid, Long> {

    /**
     * Create a new BidDao without any configuration
     */
    public BidDao() {
        super(Bid.BID, com.dator.jqtest.dao.model.tables.pojos.Bid.class);
    }

    /**
     * Create a new BidDao with an attached configuration
     */
    @Autowired
    public BidDao(Configuration configuration) {
        super(Bid.BID, com.dator.jqtest.dao.model.tables.pojos.Bid.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.dator.jqtest.dao.model.tables.pojos.Bid object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByType(String... values) {
        return fetch(Bid.BID.TYPE, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchById(Long... values) {
        return fetch(Bid.BID.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.dator.jqtest.dao.model.tables.pojos.Bid fetchOneById(Long value) {
        return fetchOne(Bid.BID.ID, value);
    }

    /**
     * Fetch records that have <code>creation IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByCreation(Timestamp... values) {
        return fetch(Bid.BID.CREATION, values);
    }

    /**
     * Fetch records that have <code>lastRemoteAddress IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByLastremoteaddress(String... values) {
        return fetch(Bid.BID.LASTREMOTEADDRESS, values);
    }

    /**
     * Fetch records that have <code>lastUsername IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByLastusername(String... values) {
        return fetch(Bid.BID.LASTUSERNAME, values);
    }

    /**
     * Fetch records that have <code>modification IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByModification(Timestamp... values) {
        return fetch(Bid.BID.MODIFICATION, values);
    }

    /**
     * Fetch records that have <code>budget IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByBudget(BigDecimal... values) {
        return fetch(Bid.BID.BUDGET, values);
    }

    /**
     * Fetch records that have <code>financeStatus IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByFinancestatus(String... values) {
        return fetch(Bid.BID.FINANCESTATUS, values);
    }

    /**
     * Fetch records that have <code>itemStatus IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByItemstatus(String... values) {
        return fetch(Bid.BID.ITEMSTATUS, values);
    }

    /**
     * Fetch records that have <code>price IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByPrice(BigDecimal... values) {
        return fetch(Bid.BID.PRICE, values);
    }

    /**
     * Fetch records that have <code>subject IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchBySubject(String... values) {
        return fetch(Bid.BID.SUBJECT, values);
    }

    /**
     * Fetch records that have <code>category IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByCategory(String... values) {
        return fetch(Bid.BID.CATEGORY, values);
    }

    /**
     * Fetch records that have <code>area IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByArea(String... values) {
        return fetch(Bid.BID.AREA, values);
    }

    /**
     * Fetch records that have <code>page IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByPage(String... values) {
        return fetch(Bid.BID.PAGE, values);
    }

    /**
     * Fetch records that have <code>keyword IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByKeyword(String... values) {
        return fetch(Bid.BID.KEYWORD, values);
    }

    /**
     * Fetch records that have <code>campaign_id IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByCampaignId(Long... values) {
        return fetch(Bid.BID.CAMPAIGN_ID, values);
    }

    /**
     * Fetch records that have <code>reportDaily_id IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByReportdailyId(Long... values) {
        return fetch(Bid.BID.REPORTDAILY_ID, values);
    }

    /**
     * Fetch records that have <code>reportTotal_id IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByReporttotalId(Long... values) {
        return fetch(Bid.BID.REPORTTOTAL_ID, values);
    }

    /**
     * Fetch records that have <code>token IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByToken(String... values) {
        return fetch(Bid.BID.TOKEN, values);
    }

    /**
     * Fetch records that have <code>auditStatus IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByAuditstatus(String... values) {
        return fetch(Bid.BID.AUDITSTATUS, values);
    }

    /**
     * Fetch records that have <code>refuseReason IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Bid> fetchByRefusereason(String... values) {
        return fetch(Bid.BID.REFUSEREASON, values);
    }
}
