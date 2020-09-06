/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables.pojos;


import com.scomarlf.generated.tables.interfaces.IUser;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements IUser {

    private static final long serialVersionUID = -322149023;

    private Long          id;
    private String        firstname;
    private String        lastname;
    private Boolean       isbot;
    private String        languagecode;
    private LocalDateTime createtime;
    private LocalDateTime updatetime;

    public User() {}

    public User(IUser value) {
        this.id = value.getId();
        this.firstname = value.getFirstname();
        this.lastname = value.getLastname();
        this.isbot = value.getIsbot();
        this.languagecode = value.getLanguagecode();
        this.createtime = value.getCreatetime();
        this.updatetime = value.getUpdatetime();
    }

    public User(
        Long          id,
        String        firstname,
        String        lastname,
        Boolean       isbot,
        String        languagecode,
        LocalDateTime createtime,
        LocalDateTime updatetime
    ) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.isbot = isbot;
        this.languagecode = languagecode;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getFirstname() {
        return this.firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public Boolean getIsbot() {
        return this.isbot;
    }

    @Override
    public void setIsbot(Boolean isbot) {
        this.isbot = isbot;
    }

    @Override
    public String getLanguagecode() {
        return this.languagecode;
    }

    @Override
    public void setLanguagecode(String languagecode) {
        this.languagecode = languagecode;
    }

    @Override
    public LocalDateTime getCreatetime() {
        return this.createtime;
    }

    @Override
    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public LocalDateTime getUpdatetime() {
        return this.updatetime;
    }

    @Override
    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(firstname);
        sb.append(", ").append(lastname);
        sb.append(", ").append(isbot);
        sb.append(", ").append(languagecode);
        sb.append(", ").append(createtime);
        sb.append(", ").append(updatetime);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUser from) {
        setId(from.getId());
        setFirstname(from.getFirstname());
        setLastname(from.getLastname());
        setIsbot(from.getIsbot());
        setLanguagecode(from.getLanguagecode());
        setCreatetime(from.getCreatetime());
        setUpdatetime(from.getUpdatetime());
    }

    @Override
    public <E extends IUser> E into(E into) {
        into.from(this);
        return into;
    }
}
