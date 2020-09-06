/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IEcology extends Serializable {

    /**
     * Setter for <code>indexBot.ecology.id</code>.
     */
    public void setId(String value);

    /**
     * Getter for <code>indexBot.ecology.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>indexBot.ecology.chatId</code>. 群组/频道 ID
     */
    public void setChatid(Long value);

    /**
     * Getter for <code>indexBot.ecology.chatId</code>. 群组/频道 ID
     */
    public Long getChatid();

    /**
     * Setter for <code>indexBot.ecology.username</code>. 群组/频道 用户名
     */
    public void setUsername(String value);

    /**
     * Getter for <code>indexBot.ecology.username</code>. 群组/频道 用户名
     */
    public String getUsername();

    /**
     * Setter for <code>indexBot.ecology.description</code>. 描述
     */
    public void setDescription(String value);

    /**
     * Getter for <code>indexBot.ecology.description</code>. 描述
     */
    public String getDescription();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IEcology
     */
    public void from(IEcology from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IEcology
     */
    public <E extends IEcology> E into(E into);
}
