/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables.records;


import com.scomarlf.generated.tables.Ecology;
import com.scomarlf.generated.tables.interfaces.IEcology;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EcologyRecord extends UpdatableRecordImpl<EcologyRecord> implements Record4<String, Long, String, String>, IEcology {

    private static final long serialVersionUID = 2107207643;

    /**
     * Setter for <code>indexBot.ecology.id</code>.
     */
    @Override
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>indexBot.ecology.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>indexBot.ecology.chatId</code>. 群组/频道 ID
     */
    @Override
    public void setChatid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>indexBot.ecology.chatId</code>. 群组/频道 ID
     */
    @Override
    public Long getChatid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>indexBot.ecology.username</code>. 群组/频道 用户名
     */
    @Override
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>indexBot.ecology.username</code>. 群组/频道 用户名
     */
    @Override
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>indexBot.ecology.description</code>. 描述
     */
    @Override
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>indexBot.ecology.description</code>. 描述
     */
    @Override
    public String getDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, Long, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, Long, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Ecology.ECOLOGY.ID;
    }

    @Override
    public Field<Long> field2() {
        return Ecology.ECOLOGY.CHATID;
    }

    @Override
    public Field<String> field3() {
        return Ecology.ECOLOGY.USERNAME;
    }

    @Override
    public Field<String> field4() {
        return Ecology.ECOLOGY.DESCRIPTION;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getChatid();
    }

    @Override
    public String component3() {
        return getUsername();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getChatid();
    }

    @Override
    public String value3() {
        return getUsername();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public EcologyRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public EcologyRecord value2(Long value) {
        setChatid(value);
        return this;
    }

    @Override
    public EcologyRecord value3(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public EcologyRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public EcologyRecord values(String value1, Long value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IEcology from) {
        setId(from.getId());
        setChatid(from.getChatid());
        setUsername(from.getUsername());
        setDescription(from.getDescription());
    }

    @Override
    public <E extends IEcology> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EcologyRecord
     */
    public EcologyRecord() {
        super(Ecology.ECOLOGY);
    }

    /**
     * Create a detached, initialised EcologyRecord
     */
    public EcologyRecord(String id, Long chatid, String username, String description) {
        super(Ecology.ECOLOGY);

        set(0, id);
        set(1, chatid);
        set(2, username);
        set(3, description);
    }
}
