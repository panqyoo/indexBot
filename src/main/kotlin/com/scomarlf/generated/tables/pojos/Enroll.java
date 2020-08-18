/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables.pojos;


import com.scomarlf.generated.tables.interfaces.IEnroll;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Enroll implements IEnroll {

    private static final long serialVersionUID = -55309672;

    private String        id;
    private Long          userid;
    private Long          channelid;
    private String        channelcode;
    private String        invitelink;
    private String        title;
    private String        remark;
    private String        tag;
    private String        classification;
    private LocalDateTime time;
    private Boolean       status;

    public Enroll() {}

    public Enroll(IEnroll value) {
        this.id = value.getId();
        this.userid = value.getUserid();
        this.channelid = value.getChannelid();
        this.channelcode = value.getChannelcode();
        this.invitelink = value.getInvitelink();
        this.title = value.getTitle();
        this.remark = value.getRemark();
        this.tag = value.getTag();
        this.classification = value.getClassification();
        this.time = value.getTime();
        this.status = value.getStatus();
    }

    public Enroll(
        String        id,
        Long          userid,
        Long          channelid,
        String        channelcode,
        String        invitelink,
        String        title,
        String        remark,
        String        tag,
        String        classification,
        LocalDateTime time,
        Boolean       status
    ) {
        this.id = id;
        this.userid = userid;
        this.channelid = channelid;
        this.channelcode = channelcode;
        this.invitelink = invitelink;
        this.title = title;
        this.remark = remark;
        this.tag = tag;
        this.classification = classification;
        this.time = time;
        this.status = status;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Long getUserid() {
        return this.userid;
    }

    @Override
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    @Override
    public Long getChannelid() {
        return this.channelid;
    }

    @Override
    public void setChannelid(Long channelid) {
        this.channelid = channelid;
    }

    @Override
    public String getChannelcode() {
        return this.channelcode;
    }

    @Override
    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    @Override
    public String getInvitelink() {
        return this.invitelink;
    }

    @Override
    public void setInvitelink(String invitelink) {
        this.invitelink = invitelink;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getRemark() {
        return this.remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String getTag() {
        return this.tag;
    }

    @Override
    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getClassification() {
        return this.classification;
    }

    @Override
    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public LocalDateTime getTime() {
        return this.time;
    }

    @Override
    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public Boolean getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Enroll (");

        sb.append(id);
        sb.append(", ").append(userid);
        sb.append(", ").append(channelid);
        sb.append(", ").append(channelcode);
        sb.append(", ").append(invitelink);
        sb.append(", ").append(title);
        sb.append(", ").append(remark);
        sb.append(", ").append(tag);
        sb.append(", ").append(classification);
        sb.append(", ").append(time);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IEnroll from) {
        setId(from.getId());
        setUserid(from.getUserid());
        setChannelid(from.getChannelid());
        setChannelcode(from.getChannelcode());
        setInvitelink(from.getInvitelink());
        setTitle(from.getTitle());
        setRemark(from.getRemark());
        setTag(from.getTag());
        setClassification(from.getClassification());
        setTime(from.getTime());
        setStatus(from.getStatus());
    }

    @Override
    public <E extends IEnroll> E into(E into) {
        into.from(this);
        return into;
    }
}