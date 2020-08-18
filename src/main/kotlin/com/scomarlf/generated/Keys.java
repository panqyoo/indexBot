/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated;


import com.scomarlf.generated.tables.Approve;
import com.scomarlf.generated.tables.Constant;
import com.scomarlf.generated.tables.Dictionary;
import com.scomarlf.generated.tables.Enroll;
import com.scomarlf.generated.tables.Record;
import com.scomarlf.generated.tables.User;
import com.scomarlf.generated.tables.records.ApproveRecord;
import com.scomarlf.generated.tables.records.ConstantRecord;
import com.scomarlf.generated.tables.records.DictionaryRecord;
import com.scomarlf.generated.tables.records.EnrollRecord;
import com.scomarlf.generated.tables.records.RecordRecord;
import com.scomarlf.generated.tables.records.UserRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>indexBot</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ApproveRecord> KEY_APPROVE_PRIMARY = UniqueKeys0.KEY_APPROVE_PRIMARY;
    public static final UniqueKey<ConstantRecord> KEY_CONSTANT_PRIMARY = UniqueKeys0.KEY_CONSTANT_PRIMARY;
    public static final UniqueKey<DictionaryRecord> KEY_DICTIONARY_PRIMARY = UniqueKeys0.KEY_DICTIONARY_PRIMARY;
    public static final UniqueKey<EnrollRecord> KEY_ENROLL_PRIMARY = UniqueKeys0.KEY_ENROLL_PRIMARY;
    public static final UniqueKey<RecordRecord> KEY_RECORD_PRIMARY = UniqueKeys0.KEY_RECORD_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<ApproveRecord> KEY_APPROVE_PRIMARY = Internal.createUniqueKey(Approve.APPROVE, "KEY_approve_PRIMARY", new TableField[] { Approve.APPROVE.ID }, true);
        public static final UniqueKey<ConstantRecord> KEY_CONSTANT_PRIMARY = Internal.createUniqueKey(Constant.CONSTANT, "KEY_constant_PRIMARY", new TableField[] { Constant.CONSTANT.ID }, true);
        public static final UniqueKey<DictionaryRecord> KEY_DICTIONARY_PRIMARY = Internal.createUniqueKey(Dictionary.DICTIONARY, "KEY_dictionary_PRIMARY", new TableField[] { Dictionary.DICTIONARY.ID }, true);
        public static final UniqueKey<EnrollRecord> KEY_ENROLL_PRIMARY = Internal.createUniqueKey(Enroll.ENROLL, "KEY_enroll_PRIMARY", new TableField[] { Enroll.ENROLL.ID }, true);
        public static final UniqueKey<RecordRecord> KEY_RECORD_PRIMARY = Internal.createUniqueKey(Record.RECORD, "KEY_record_PRIMARY", new TableField[] { Record.RECORD.ID }, true);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", new TableField[] { User.USER.ID }, true);
    }
}