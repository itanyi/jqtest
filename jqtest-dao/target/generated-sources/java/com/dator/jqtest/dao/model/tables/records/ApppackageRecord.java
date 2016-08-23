/**
 * This class is generated by jOOQ
 */
package com.dator.jqtest.dao.model.tables.records;


import com.dator.jqtest.dao.model.tables.Apppackage;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ApppackageRecord extends UpdatableRecordImpl<ApppackageRecord> implements Record6<Long, String, Long, String, String, String> {

    private static final long serialVersionUID = -337744303;

    /**
     * Setter for <code>ads.AppPackage.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>ads.AppPackage.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ads.AppPackage.packageName</code>.
     */
    public void setPackagename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ads.AppPackage.packageName</code>.
     */
    public String getPackagename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ads.AppPackage.account_id</code>.
     */
    public void setAccountId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>ads.AppPackage.account_id</code>.
     */
    public Long getAccountId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>ads.AppPackage.note</code>.
     */
    public void setNote(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ads.AppPackage.note</code>.
     */
    public String getNote() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ads.AppPackage.itemStatus</code>.
     */
    public void setItemstatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ads.AppPackage.itemStatus</code>.
     */
    public String getItemstatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ads.AppPackage.md5</code>.
     */
    public void setMd5(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>ads.AppPackage.md5</code>.
     */
    public String getMd5() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Long, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Long, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Apppackage.APPPACKAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Apppackage.APPPACKAGE.PACKAGENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Apppackage.APPPACKAGE.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Apppackage.APPPACKAGE.NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Apppackage.APPPACKAGE.ITEMSTATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Apppackage.APPPACKAGE.MD5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPackagename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getItemstatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMd5();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApppackageRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApppackageRecord value2(String value) {
        setPackagename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApppackageRecord value3(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApppackageRecord value4(String value) {
        setNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApppackageRecord value5(String value) {
        setItemstatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApppackageRecord value6(String value) {
        setMd5(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApppackageRecord values(Long value1, String value2, Long value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApppackageRecord
     */
    public ApppackageRecord() {
        super(Apppackage.APPPACKAGE);
    }

    /**
     * Create a detached, initialised ApppackageRecord
     */
    public ApppackageRecord(Long id, String packagename, Long accountId, String note, String itemstatus, String md5) {
        super(Apppackage.APPPACKAGE);

        set(0, id);
        set(1, packagename);
        set(2, accountId);
        set(3, note);
        set(4, itemstatus);
        set(5, md5);
    }
}