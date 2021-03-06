/*
 * This file is generated by jOOQ.
*/
package zw.co.elearning.school.db.tables;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class OPD extends TableImpl<Record> {

    private static final long serialVersionUID = 1158999500;

    /**
     * The reference instance of <code>school.opd</code>
     */
    public static final OPD OPD = new OPD();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>school.opd.id</code>.
     */
    public final TableField<Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.opd.created_by</code>.
     */
    public final TableField<Record, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>school.opd.created_date</code>.
     */
    public final TableField<Record, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>school.opd.last_modified_by</code>.
     */
    public final TableField<Record, String> LAST_MODIFIED_BY = createField("last_modified_by", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>school.opd.last_modified_date</code>.
     */
    public final TableField<Record, Timestamp> LAST_MODIFIED_DATE = createField("last_modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>school.opd.closed</code>.
     */
    public final TableField<Record, Boolean> CLOSED = createField("closed", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>school.opd.date</code>.
     */
    public final TableField<Record, Date> DATE = createField("date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>school.opd.repeat_visit</code>.
     */
    public final TableField<Record, Boolean> REPEAT_VISIT = createField("repeat_visit", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>school.opd.facility_id</code>.
     */
    public final TableField<Record, Long> FACILITY_ID = createField("facility_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.opd.person_id</code>.
     */
    public final TableField<Record, Long> PERSON_ID = createField("person_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>school.opd</code> table reference
     */
    public OPD() {
        this("opd", null);
    }

    /**
     * Create an aliased <code>school.opd</code> table reference
     */
    public OPD(String alias) {
        this(alias, OPD);
    }

    private OPD(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private OPD(String alias, Table<Record> aliased, Field<?>[] parameters) {
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
        return Keys.IDENTITY_OPD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_OPD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_OPD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Record, ?>>asList(Keys.FKA3SBOPJPIGIU8VP31EH621HED, Keys.FKR10Q4M4MS0OK6JXP8U39Y9OAU);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OPD as(String alias) {
        return new OPD(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OPD rename(String name) {
        return new OPD(name, null);
    }
}
