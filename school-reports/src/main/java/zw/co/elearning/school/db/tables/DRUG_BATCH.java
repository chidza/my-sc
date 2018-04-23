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
public class DRUG_BATCH extends TableImpl<Record> {

    private static final long serialVersionUID = -2130607305;

    /**
     * The reference instance of <code>school.drug_batch</code>
     */
    public static final DRUG_BATCH DRUG_BATCH = new DRUG_BATCH();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>school.drug_batch.id</code>.
     */
    public final TableField<Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.drug_batch.created_by</code>.
     */
    public final TableField<Record, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>school.drug_batch.created_date</code>.
     */
    public final TableField<Record, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>school.drug_batch.last_modified_by</code>.
     */
    public final TableField<Record, String> LAST_MODIFIED_BY = createField("last_modified_by", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>school.drug_batch.last_modified_date</code>.
     */
    public final TableField<Record, Timestamp> LAST_MODIFIED_DATE = createField("last_modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>school.drug_batch.batch_number</code>.
     */
    public final TableField<Record, String> BATCH_NUMBER = createField("batch_number", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>school.drug_batch.date_received</code>.
     */
    public final TableField<Record, Date> DATE_RECEIVED = createField("date_received", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>school.drug_batch.expiry_date</code>.
     */
    public final TableField<Record, Date> EXPIRY_DATE = createField("expiry_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>school.drug_batch.quantity</code>.
     */
    public final TableField<Record, Integer> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>school.drug_batch.drug_id</code>.
     */
    public final TableField<Record, Long> DRUG_ID = createField("drug_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.drug_batch.supplier_id</code>.
     */
    public final TableField<Record, Long> SUPPLIER_ID = createField("supplier_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>school.drug_batch</code> table reference
     */
    public DRUG_BATCH() {
        this("drug_batch", null);
    }

    /**
     * Create an aliased <code>school.drug_batch</code> table reference
     */
    public DRUG_BATCH(String alias) {
        this(alias, DRUG_BATCH);
    }

    private DRUG_BATCH(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private DRUG_BATCH(String alias, Table<Record> aliased, Field<?>[] parameters) {
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
        return Keys.IDENTITY_DRUG_BATCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_DRUG_BATCH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_DRUG_BATCH_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Record, ?>>asList(Keys.FKSV4DBNTEU70ID37MJBSC2RYGP, Keys.FK5C2MGK6KQXLIB7HST95I7YJ73);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DRUG_BATCH as(String alias) {
        return new DRUG_BATCH(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DRUG_BATCH rename(String name) {
        return new DRUG_BATCH(name, null);
    }
}