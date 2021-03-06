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
public class FOETAL_DEATH extends TableImpl<Record> {

    private static final long serialVersionUID = -973437212;

    /**
     * The reference instance of <code>school.foetal_death</code>
     */
    public static final FOETAL_DEATH FOETAL_DEATH = new FOETAL_DEATH();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>school.foetal_death.id</code>.
     */
    public final TableField<Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.foetal_death.created_by</code>.
     */
    public final TableField<Record, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>school.foetal_death.created_date</code>.
     */
    public final TableField<Record, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>school.foetal_death.last_modified_by</code>.
     */
    public final TableField<Record, String> LAST_MODIFIED_BY = createField("last_modified_by", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>school.foetal_death.last_modified_date</code>.
     */
    public final TableField<Record, Timestamp> LAST_MODIFIED_DATE = createField("last_modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>school.foetal_death.date</code>.
     */
    public final TableField<Record, Date> DATE = createField("date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>school.foetal_death.gender</code>.
     */
    public final TableField<Record, String> GENDER = createField("gender", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>school.foetal_death.still_birth_type</code>.
     */
    public final TableField<Record, String> STILL_BIRTH_TYPE = createField("still_birth_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>school.foetal_death.time</code>.
     */
    public final TableField<Record, Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>school.foetal_death.diagnosis_id</code>.
     */
    public final TableField<Record, Long> DIAGNOSIS_ID = createField("diagnosis_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>school.foetal_death.infant_id</code>.
     */
    public final TableField<Record, Long> INFANT_ID = createField("infant_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>school.foetal_death</code> table reference
     */
    public FOETAL_DEATH() {
        this("foetal_death", null);
    }

    /**
     * Create an aliased <code>school.foetal_death</code> table reference
     */
    public FOETAL_DEATH(String alias) {
        this(alias, FOETAL_DEATH);
    }

    private FOETAL_DEATH(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private FOETAL_DEATH(String alias, Table<Record> aliased, Field<?>[] parameters) {
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
        return Keys.IDENTITY_FOETAL_DEATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_FOETAL_DEATH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_FOETAL_DEATH_PRIMARY, Keys.KEY_FOETAL_DEATH_UK_L8B3ORX7RW9GL64WUFFVOGSIA, Keys.KEY_FOETAL_DEATH_UK_8LTXU1L1SGDE2E6N9D4G84W41);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Record, ?>>asList(Keys.FKTNBJEU5GIHGC8FW8IISLPN5PN, Keys.FK6X0ED32DAW8TESRHORTRLI0XW);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FOETAL_DEATH as(String alias) {
        return new FOETAL_DEATH(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FOETAL_DEATH rename(String name) {
        return new FOETAL_DEATH(name, null);
    }
}
