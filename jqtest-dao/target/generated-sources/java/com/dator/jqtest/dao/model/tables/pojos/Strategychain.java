/**
 * This class is generated by jOOQ
 */
package com.dator.jqtest.dao.model.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


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
public class Strategychain implements Serializable {

    private static final long serialVersionUID = 1317719257;

    private UInteger id;
    private String   name;
    private String   type;
    private String   strategies;

    public Strategychain() {}

    public Strategychain(Strategychain value) {
        this.id = value.id;
        this.name = value.name;
        this.type = value.type;
        this.strategies = value.strategies;
    }

    public Strategychain(
        UInteger id,
        String   name,
        String   type,
        String   strategies
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.strategies = strategies;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStrategies() {
        return this.strategies;
    }

    public void setStrategies(String strategies) {
        this.strategies = strategies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Strategychain (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(strategies);

        sb.append(")");
        return sb.toString();
    }
}
