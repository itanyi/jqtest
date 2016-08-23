/**
 * This class is generated by jOOQ
 */
package com.dator.jqtest.dao.model.tables.records;


import com.dator.jqtest.dao.model.tables.Route;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class RouteRecord extends UpdatableRecordImpl<RouteRecord> implements Record8<Integer, String, String, String, Integer, String, Byte, String> {

    private static final long serialVersionUID = 2060015298;

    /**
     * Setter for <code>ads.Route.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ads.Route.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ads.Route.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ads.Route.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ads.Route.parent_name</code>.
     */
    public void setParentName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ads.Route.parent_name</code>.
     */
    public String getParentName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ads.Route.strategies</code>.
     */
    public void setStrategies(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ads.Route.strategies</code>.
     */
    public String getStrategies() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ads.Route.order</code>.
     */
    public void setOrder(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ads.Route.order</code>.
     */
    public Integer getOrder() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ads.Route.target_name</code>.
     */
    public void setTargetName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>ads.Route.target_name</code>.
     */
    public String getTargetName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ads.Route.isDefault</code>.
     */
    public void setIsdefault(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>ads.Route.isDefault</code>.
     */
    public Byte getIsdefault() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>ads.Route.description</code>.
     */
    public void setDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>ads.Route.description</code>.
     */
    public String getDescription() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, Integer, String, Byte, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, Integer, String, Byte, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Route.ROUTE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Route.ROUTE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Route.ROUTE.PARENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Route.ROUTE.STRATEGIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Route.ROUTE.ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Route.ROUTE.TARGET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return Route.ROUTE.ISDEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Route.ROUTE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStrategies();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTargetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getIsdefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value3(String value) {
        setParentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value4(String value) {
        setStrategies(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value5(Integer value) {
        setOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value6(String value) {
        setTargetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value7(Byte value) {
        setIsdefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value8(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, Byte value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RouteRecord
     */
    public RouteRecord() {
        super(Route.ROUTE);
    }

    /**
     * Create a detached, initialised RouteRecord
     */
    public RouteRecord(Integer id, String name, String parentName, String strategies, Integer order, String targetName, Byte isdefault, String description) {
        super(Route.ROUTE);

        set(0, id);
        set(1, name);
        set(2, parentName);
        set(3, strategies);
        set(4, order);
        set(5, targetName);
        set(6, isdefault);
        set(7, description);
    }
}