/*
 * This file is generated by jOOQ.
*/
package zw.co.elearning.school.db.tables;


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
public class CERVIX extends TableImpl<Record> {

    private static final long serialVersionUID = 178489274;

    /**
     * The reference instance of <code>school.cervix</code>
     */
    public static final CERVIX CERVIX = new CERVIX();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>school.cervix.id</code>.
     */
    public final TableField<Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.cervix.created_by</code>.
     */
    public final TableField<Record, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>school.cervix.created_date</code>.
     */
    public final TableField<Record, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>school.cervix.last_modified_by</code>.
     */
    public final TableField<Record, String> LAST_MODIFIED_BY = createField("last_modified_by", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>school.cervix.last_modified_date</code>.
     */
    public final TableField<Record, Timestamp> LAST_MODIFIED_DATE = createField("last_modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>school.cervix.date</code>.
     */
    public final TableField<Record, Timestamp> DATE = createField("date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>school.cervix.dilatation</code>.
     */
    public final TableField<Record, Double> DILATATION = createField("dilatation", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>school.cervix.effacement</code>.
     */
    public final TableField<Record, Double> EFFACEMENT = createField("effacement", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>school.cervix.delivery_id</code>.
     */
    public final TableField<Record, Long> DELIVERY_ID = createField("delivery_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.cervix.descent_id</code>.
     */
    public final TableField<Record, Long> DESCENT_ID = createField("descent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>school.cervix</code> table reference
     */
    public CERVIX() {
        this("cervix", null);
    }

    /**
     * Create an aliased <code>school.cervix</code> table reference
     */
    public CERVIX(String alias) {
        this(alias, CERVIX);
    }

    private CERVIX(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private CERVIX(String alias, Table<Record> aliased, Field<?>[] parameters) {
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
        return Keys.IDENTITY_CERVIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_CERVIX_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_CERVIX_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Record, ?>>asList(Keys.FKJ9VKLV1UT8XG2SROX3PID24XL, Keys.FK7ETEQJ68QN3HGY82PO12GFGY6);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CERVIX as(String alias) {
        return new CERVIX(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CERVIX rename(String name) {
        return new CERVIX(name, null);
    }
}
