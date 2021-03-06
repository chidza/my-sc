/*
 * This file is generated by jOOQ.
*/
package zw.co.elearning.school.db.tables;


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
public class IMNCI_CATEGORY extends TableImpl<Record> {

    private static final long serialVersionUID = -319330519;

    /**
     * The reference instance of <code>school.imnci_category</code>
     */
    public static final IMNCI_CATEGORY IMNCI_CATEGORY = new IMNCI_CATEGORY();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>school.imnci_category.id</code>.
     */
    public final TableField<Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>school.imnci_category.name</code>.
     */
    public final TableField<Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>school.imnci_category</code> table reference
     */
    public IMNCI_CATEGORY() {
        this("imnci_category", null);
    }

    /**
     * Create an aliased <code>school.imnci_category</code> table reference
     */
    public IMNCI_CATEGORY(String alias) {
        this(alias, IMNCI_CATEGORY);
    }

    private IMNCI_CATEGORY(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private IMNCI_CATEGORY(String alias, Table<Record> aliased, Field<?>[] parameters) {
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
        return Keys.IDENTITY_IMNCI_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_IMNCI_CATEGORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_IMNCI_CATEGORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IMNCI_CATEGORY as(String alias) {
        return new IMNCI_CATEGORY(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IMNCI_CATEGORY rename(String name) {
        return new IMNCI_CATEGORY(name, null);
    }
}
