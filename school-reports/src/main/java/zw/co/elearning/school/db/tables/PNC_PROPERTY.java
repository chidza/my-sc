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
public class PNC_PROPERTY extends TableImpl<Record> {

    private static final long serialVersionUID = 1548022397;

    /**
     * The reference instance of <code>school.pnc_property</code>
     */
    public static final PNC_PROPERTY PNC_PROPERTY = new PNC_PROPERTY();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>school.pnc_property.id</code>.
     */
    public final TableField<Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.pnc_property.created_by</code>.
     */
    public final TableField<Record, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>school.pnc_property.created_date</code>.
     */
    public final TableField<Record, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>school.pnc_property.last_modified_by</code>.
     */
    public final TableField<Record, String> LAST_MODIFIED_BY = createField("last_modified_by", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>school.pnc_property.last_modified_date</code>.
     */
    public final TableField<Record, Timestamp> LAST_MODIFIED_DATE = createField("last_modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>school.pnc_property.value</code>.
     */
    public final TableField<Record, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>school.pnc_property.pnc_questionare_id</code>.
     */
    public final TableField<Record, Long> PNC_QUESTIONARE_ID = createField("pnc_questionare_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.pnc_property.pnc_visit_id</code>.
     */
    public final TableField<Record, Long> PNC_VISIT_ID = createField("pnc_visit_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>school.pnc_property</code> table reference
     */
    public PNC_PROPERTY() {
        this("pnc_property", null);
    }

    /**
     * Create an aliased <code>school.pnc_property</code> table reference
     */
    public PNC_PROPERTY(String alias) {
        this(alias, PNC_PROPERTY);
    }

    private PNC_PROPERTY(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PNC_PROPERTY(String alias, Table<Record> aliased, Field<?>[] parameters) {
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
        return Keys.IDENTITY_PNC_PROPERTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_PNC_PROPERTY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_PNC_PROPERTY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Record, ?>>asList(Keys.FKLXYDI5IVVJOH8M1X7NUGM86RO, Keys.FK9QH12ACDUOQR9IFREAJQOLKVR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PNC_PROPERTY as(String alias) {
        return new PNC_PROPERTY(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PNC_PROPERTY rename(String name) {
        return new PNC_PROPERTY(name, null);
    }
}
