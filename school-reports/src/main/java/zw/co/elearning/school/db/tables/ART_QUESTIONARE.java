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
public class ART_QUESTIONARE extends TableImpl<Record> {

    private static final long serialVersionUID = -996133292;

    /**
     * The reference instance of <code>school.art_questionare</code>
     */
    public static final ART_QUESTIONARE ART_QUESTIONARE = new ART_QUESTIONARE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>school.art_questionare.id</code>.
     */
    public final TableField<Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.art_questionare.created_by</code>.
     */
    public final TableField<Record, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>school.art_questionare.created_date</code>.
     */
    public final TableField<Record, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>school.art_questionare.last_modified_by</code>.
     */
    public final TableField<Record, String> LAST_MODIFIED_BY = createField("last_modified_by", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>school.art_questionare.last_modified_date</code>.
     */
    public final TableField<Record, Timestamp> LAST_MODIFIED_DATE = createField("last_modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>school.art_questionare.discontinued</code>.
     */
    public final TableField<Record, Boolean> DISCONTINUED = createField("discontinued", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>school.art_questionare.name</code>.
     */
    public final TableField<Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>school.art_questionare.type</code>.
     */
    public final TableField<Record, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>school.art_questionare</code> table reference
     */
    public ART_QUESTIONARE() {
        this("art_questionare", null);
    }

    /**
     * Create an aliased <code>school.art_questionare</code> table reference
     */
    public ART_QUESTIONARE(String alias) {
        this(alias, ART_QUESTIONARE);
    }

    private ART_QUESTIONARE(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ART_QUESTIONARE(String alias, Table<Record> aliased, Field<?>[] parameters) {
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
        return Keys.IDENTITY_ART_QUESTIONARE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_ART_QUESTIONARE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_ART_QUESTIONARE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ART_QUESTIONARE as(String alias) {
        return new ART_QUESTIONARE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ART_QUESTIONARE rename(String name) {
        return new ART_QUESTIONARE(name, null);
    }
}
