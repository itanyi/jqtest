/**
 * This class is generated by jOOQ
 */
package com.dator.jqtest.dao.model.tables.daos;


import com.dator.jqtest.dao.model.tables.Adsposconfig;
import com.dator.jqtest.dao.model.tables.records.AdsposconfigRecord;

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
public class AdsposconfigDao extends DAOImpl<AdsposconfigRecord, com.dator.jqtest.dao.model.tables.pojos.Adsposconfig, String> {

    /**
     * Create a new AdsposconfigDao without any configuration
     */
    public AdsposconfigDao() {
        super(Adsposconfig.ADSPOSCONFIG, com.dator.jqtest.dao.model.tables.pojos.Adsposconfig.class);
    }

    /**
     * Create a new AdsposconfigDao with an attached configuration
     */
    @Autowired
    public AdsposconfigDao(Configuration configuration) {
        super(Adsposconfig.ADSPOSCONFIG, com.dator.jqtest.dao.model.tables.pojos.Adsposconfig.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.dator.jqtest.dao.model.tables.pojos.Adsposconfig object) {
        return object.getPosname();
    }

    /**
     * Fetch records that have <code>posName IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Adsposconfig> fetchByPosname(String... values) {
        return fetch(Adsposconfig.ADSPOSCONFIG.POSNAME, values);
    }

    /**
     * Fetch a unique record that has <code>posName = value</code>
     */
    public com.dator.jqtest.dao.model.tables.pojos.Adsposconfig fetchOneByPosname(String value) {
        return fetchOne(Adsposconfig.ADSPOSCONFIG.POSNAME, value);
    }

    /**
     * Fetch records that have <code>posPatternValue IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Adsposconfig> fetchByPospatternvalue(String... values) {
        return fetch(Adsposconfig.ADSPOSCONFIG.POSPATTERNVALUE, values);
    }

    /**
     * Fetch records that have <code>orderNum IN (values)</code>
     */
    public List<com.dator.jqtest.dao.model.tables.pojos.Adsposconfig> fetchByOrdernum(Integer... values) {
        return fetch(Adsposconfig.ADSPOSCONFIG.ORDERNUM, values);
    }
}
