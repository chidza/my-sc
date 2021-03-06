/*
 * This file is generated by jOOQ.
*/
package zw.co.elearning.school.db.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import zw.co.elearning.school.db.Keys;
import zw.co.elearning.school.db.School;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class INVESTIGATION_HISTORY extends TableImpl<Record> {

    private static final long serialVersionUID = 1520422474;

    /**
     * The reference instance of <code>school.investigation_history</code>
     */
    public static final INVESTIGATION_HISTORY INVESTIGATION_HISTORY = new INVESTIGATION_HISTORY();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>school.investigation_history.id</code>.
     */
    public final TableField<Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.investigation_history.created_by</code>.
     */
    public final TableField<Record, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>school.investigation_history.created_date</code>.
     */
    public final TableField<Record, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>school.investigation_history.last_modified_by</code>.
     */
    public final TableField<Record, String> LAST_MODIFIED_BY = createField("last_modified_by", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>school.investigation_history.last_modified_date</code>.
     */
    public final TableField<Record, Timestamp> LAST_MODIFIED_DATE = createField("last_modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>school.investigation_history.name</code>.
     */
    public final TableField<Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>school.investigation_history</code> table reference
     */
    public INVESTIGATION_HISTORY() {
        this("investigation_history", null);
    }

    /**
     * Create an aliased <code>school.investigation_history</code> table reference
     */
    public INVESTIGATION_HISTORY(String alias) {
        this(alias, INVESTIGATION_HISTORY);
    }

    private INVESTIGATION_HISTORY(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private INVESTIGATION_HISTORY(String alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return School.SCHOOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<Record, Long> getIdentity() {
        return Keys.IDENTITY_INVESTIGATION_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_INVESTIGATION_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_INVESTIGATION_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public INVESTIGATION_HISTORY as(String alias) {
        return new INVESTIGATION_HISTORY(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public INVESTIGATION_HISTORY rename(String name) {
        return new INVESTIGATION_HISTORY(name, null);
    }
}
