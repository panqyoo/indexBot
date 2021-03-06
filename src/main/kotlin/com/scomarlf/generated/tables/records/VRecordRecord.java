/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables.records;


import com.scomarlf.generated.tables.VRecord;
import com.scomarlf.generated.tables.interfaces.IVRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VRecordRecord extends TableRecordImpl<VRecordRecord> implements Record17<Long, String, String, String, String, Long, String, String, String, String, String, Long, Boolean, LocalDateTime, Long, LocalDateTime, Long>, IVRecord {

    private static final long serialVersionUID = -474425882;

    /**
     * Setter for <code>indexBot.v_record.id</code>. 频道\群组\机器人 ID
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>indexBot.v_record.id</code>. 频道\群组\机器人 ID
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>indexBot.v_record.username</code>. 频道\群组\机器人 username
     */
    @Override
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>indexBot.v_record.username</code>. 频道\群组\机器人 username
     */
    @Override
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>indexBot.v_record.inviteLink</code>. 私有链接
     */
    @Override
    public void setInvitelink(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>indexBot.v_record.inviteLink</code>. 私有链接
     */
    @Override
    public String getInvitelink() {
        return (String) get(2);
    }

    /**
     * Setter for <code>indexBot.v_record.title</code>. 名称
     */
    @Override
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>indexBot.v_record.title</code>. 名称
     */
    @Override
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>indexBot.v_record.remark</code>. 简介
     */
    @Override
    public void setRemark(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>indexBot.v_record.remark</code>. 简介
     */
    @Override
    public String getRemark() {
        return (String) get(4);
    }

    /**
     * Setter for <code>indexBot.v_record.memberNumber</code>. 成员数量
     */
    @Override
    public void setMembernumber(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>indexBot.v_record.memberNumber</code>. 成员数量
     */
    @Override
    public Long getMembernumber() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>indexBot.v_record.tag</code>. 标签
     */
    @Override
    public void setTag(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>indexBot.v_record.tag</code>. 标签
     */
    @Override
    public String getTag() {
        return (String) get(6);
    }

    /**
     * Setter for <code>indexBot.v_record.type</code>. 收录类型 字典-recordType   频道\群组\机器人
     */
    @Override
    public void setType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>indexBot.v_record.type</code>. 收录类型 字典-recordType   频道\群组\机器人
     */
    @Override
    public String getType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>indexBot.v_record.typeName</code>.
     */
    @Override
    public void setTypename(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>indexBot.v_record.typeName</code>.
     */
    @Override
    public String getTypename() {
        return (String) get(8);
    }

    /**
     * Setter for <code>indexBot.v_record.classification</code>. 分类
     */
    @Override
    public void setClassification(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>indexBot.v_record.classification</code>. 分类
     */
    @Override
    public String getClassification() {
        return (String) get(9);
    }

    /**
     * Setter for <code>indexBot.v_record.classificationName</code>.
     */
    @Override
    public void setClassificationname(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>indexBot.v_record.classificationName</code>.
     */
    @Override
    public String getClassificationname() {
        return (String) get(10);
    }

    /**
     * Setter for <code>indexBot.v_record.placardId</code>. 公告ID
     */
    @Override
    public void setPlacardid(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>indexBot.v_record.placardId</code>. 公告ID
     */
    @Override
    public Long getPlacardid() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>indexBot.v_record.status</code>. 是否展示
     */
    @Override
    public void setStatus(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>indexBot.v_record.status</code>. 是否展示
     */
    @Override
    public Boolean getStatus() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>indexBot.v_record.createTime</code>. 创建时间
     */
    @Override
    public void setCreatetime(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>indexBot.v_record.createTime</code>. 创建时间
     */
    @Override
    public LocalDateTime getCreatetime() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>indexBot.v_record.createUser</code>. 提交收录申请用户
     */
    @Override
    public void setCreateuser(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>indexBot.v_record.createUser</code>. 提交收录申请用户
     */
    @Override
    public Long getCreateuser() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>indexBot.v_record.updateTime</code>. 更新时间
     */
    @Override
    public void setUpdatetime(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>indexBot.v_record.updateTime</code>. 更新时间
     */
    @Override
    public LocalDateTime getUpdatetime() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>indexBot.v_record.updateUser</code>. 修改用户
     */
    @Override
    public void setUpdateuser(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>indexBot.v_record.updateUser</code>. 修改用户
     */
    @Override
    public Long getUpdateuser() {
        return (Long) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, String, String, String, String, Long, String, String, String, String, String, Long, Boolean, LocalDateTime, Long, LocalDateTime, Long> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<Long, String, String, String, String, Long, String, String, String, String, String, Long, Boolean, LocalDateTime, Long, LocalDateTime, Long> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return VRecord.V_RECORD.ID;
    }

    @Override
    public Field<String> field2() {
        return VRecord.V_RECORD.USERNAME;
    }

    @Override
    public Field<String> field3() {
        return VRecord.V_RECORD.INVITELINK;
    }

    @Override
    public Field<String> field4() {
        return VRecord.V_RECORD.TITLE;
    }

    @Override
    public Field<String> field5() {
        return VRecord.V_RECORD.REMARK;
    }

    @Override
    public Field<Long> field6() {
        return VRecord.V_RECORD.MEMBERNUMBER;
    }

    @Override
    public Field<String> field7() {
        return VRecord.V_RECORD.TAG;
    }

    @Override
    public Field<String> field8() {
        return VRecord.V_RECORD.TYPE;
    }

    @Override
    public Field<String> field9() {
        return VRecord.V_RECORD.TYPENAME;
    }

    @Override
    public Field<String> field10() {
        return VRecord.V_RECORD.CLASSIFICATION;
    }

    @Override
    public Field<String> field11() {
        return VRecord.V_RECORD.CLASSIFICATIONNAME;
    }

    @Override
    public Field<Long> field12() {
        return VRecord.V_RECORD.PLACARDID;
    }

    @Override
    public Field<Boolean> field13() {
        return VRecord.V_RECORD.STATUS;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return VRecord.V_RECORD.CREATETIME;
    }

    @Override
    public Field<Long> field15() {
        return VRecord.V_RECORD.CREATEUSER;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return VRecord.V_RECORD.UPDATETIME;
    }

    @Override
    public Field<Long> field17() {
        return VRecord.V_RECORD.UPDATEUSER;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public String component3() {
        return getInvitelink();
    }

    @Override
    public String component4() {
        return getTitle();
    }

    @Override
    public String component5() {
        return getRemark();
    }

    @Override
    public Long component6() {
        return getMembernumber();
    }

    @Override
    public String component7() {
        return getTag();
    }

    @Override
    public String component8() {
        return getType();
    }

    @Override
    public String component9() {
        return getTypename();
    }

    @Override
    public String component10() {
        return getClassification();
    }

    @Override
    public String component11() {
        return getClassificationname();
    }

    @Override
    public Long component12() {
        return getPlacardid();
    }

    @Override
    public Boolean component13() {
        return getStatus();
    }

    @Override
    public LocalDateTime component14() {
        return getCreatetime();
    }

    @Override
    public Long component15() {
        return getCreateuser();
    }

    @Override
    public LocalDateTime component16() {
        return getUpdatetime();
    }

    @Override
    public Long component17() {
        return getUpdateuser();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public String value3() {
        return getInvitelink();
    }

    @Override
    public String value4() {
        return getTitle();
    }

    @Override
    public String value5() {
        return getRemark();
    }

    @Override
    public Long value6() {
        return getMembernumber();
    }

    @Override
    public String value7() {
        return getTag();
    }

    @Override
    public String value8() {
        return getType();
    }

    @Override
    public String value9() {
        return getTypename();
    }

    @Override
    public String value10() {
        return getClassification();
    }

    @Override
    public String value11() {
        return getClassificationname();
    }

    @Override
    public Long value12() {
        return getPlacardid();
    }

    @Override
    public Boolean value13() {
        return getStatus();
    }

    @Override
    public LocalDateTime value14() {
        return getCreatetime();
    }

    @Override
    public Long value15() {
        return getCreateuser();
    }

    @Override
    public LocalDateTime value16() {
        return getUpdatetime();
    }

    @Override
    public Long value17() {
        return getUpdateuser();
    }

    @Override
    public VRecordRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public VRecordRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public VRecordRecord value3(String value) {
        setInvitelink(value);
        return this;
    }

    @Override
    public VRecordRecord value4(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public VRecordRecord value5(String value) {
        setRemark(value);
        return this;
    }

    @Override
    public VRecordRecord value6(Long value) {
        setMembernumber(value);
        return this;
    }

    @Override
    public VRecordRecord value7(String value) {
        setTag(value);
        return this;
    }

    @Override
    public VRecordRecord value8(String value) {
        setType(value);
        return this;
    }

    @Override
    public VRecordRecord value9(String value) {
        setTypename(value);
        return this;
    }

    @Override
    public VRecordRecord value10(String value) {
        setClassification(value);
        return this;
    }

    @Override
    public VRecordRecord value11(String value) {
        setClassificationname(value);
        return this;
    }

    @Override
    public VRecordRecord value12(Long value) {
        setPlacardid(value);
        return this;
    }

    @Override
    public VRecordRecord value13(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public VRecordRecord value14(LocalDateTime value) {
        setCreatetime(value);
        return this;
    }

    @Override
    public VRecordRecord value15(Long value) {
        setCreateuser(value);
        return this;
    }

    @Override
    public VRecordRecord value16(LocalDateTime value) {
        setUpdatetime(value);
        return this;
    }

    @Override
    public VRecordRecord value17(Long value) {
        setUpdateuser(value);
        return this;
    }

    @Override
    public VRecordRecord values(Long value1, String value2, String value3, String value4, String value5, Long value6, String value7, String value8, String value9, String value10, String value11, Long value12, Boolean value13, LocalDateTime value14, Long value15, LocalDateTime value16, Long value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IVRecord from) {
        setId(from.getId());
        setUsername(from.getUsername());
        setInvitelink(from.getInvitelink());
        setTitle(from.getTitle());
        setRemark(from.getRemark());
        setMembernumber(from.getMembernumber());
        setTag(from.getTag());
        setType(from.getType());
        setTypename(from.getTypename());
        setClassification(from.getClassification());
        setClassificationname(from.getClassificationname());
        setPlacardid(from.getPlacardid());
        setStatus(from.getStatus());
        setCreatetime(from.getCreatetime());
        setCreateuser(from.getCreateuser());
        setUpdatetime(from.getUpdatetime());
        setUpdateuser(from.getUpdateuser());
    }

    @Override
    public <E extends IVRecord> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VRecordRecord
     */
    public VRecordRecord() {
        super(VRecord.V_RECORD);
    }

    /**
     * Create a detached, initialised VRecordRecord
     */
    public VRecordRecord(Long id, String username, String invitelink, String title, String remark, Long membernumber, String tag, String type, String typename, String classification, String classificationname, Long placardid, Boolean status, LocalDateTime createtime, Long createuser, LocalDateTime updatetime, Long updateuser) {
        super(VRecord.V_RECORD);

        set(0, id);
        set(1, username);
        set(2, invitelink);
        set(3, title);
        set(4, remark);
        set(5, membernumber);
        set(6, tag);
        set(7, type);
        set(8, typename);
        set(9, classification);
        set(10, classificationname);
        set(11, placardid);
        set(12, status);
        set(13, createtime);
        set(14, createuser);
        set(15, updatetime);
        set(16, updateuser);
    }
}
