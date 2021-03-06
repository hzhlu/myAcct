package com.macrolab.myAcct.model;

public class TMyAcct {
    /**
     * 主键
     */
    int id;

    /**
     * 父键
     */
    int pid;

    /**
     * 资料名称
     */
    String name;

    /**
     * 资料内容
     */
    String content;

    /**
     * 资料创建日期
     */
    String createDate;

    /**
     * 资料更新日期
     */
    String updateDate;

    /**
     * 资料保护的盐
     */
    String salt;

    /**
     * securityKey的hash值
     */
    String keyVerifyCode;

    /**
     * 资料内容的md5值
     */
    String mac;


    /**
     * 排序值
     */
    double  draworder;

    public double getDraworder() {
        return draworder;
    }

    public void setDraworder(double draworder) {
        this.draworder = draworder;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getKeyVerifyCode() {
        return keyVerifyCode;
    }

    public void setKeyVerifyCode(String keyVerifyCode) {
        this.keyVerifyCode = keyVerifyCode;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + name;
    }
}
