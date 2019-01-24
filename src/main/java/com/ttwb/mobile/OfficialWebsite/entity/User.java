package com.ttwb.mobile.OfficialWebsite.entity;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @Column(name = "userId")
    private Integer userid;

    /**
     * 用户来源 0微信
     */
    @Column(name = "userFrom")
    private Integer userfrom;

    /**
     * 微信openId
     */
    @Column(name = "openId")
    private String openid;

    /**
     * 显示昵称
     */
    @Column(name = "nickName")
    private String nickname;

    /**
     * 头像地址
     */
    @Column(name = "headImgUrl")
    private String headimgurl;

    /**
     * 用户名
     */
    @Column(name = "userName")
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 真实姓名
     */
    @Column(name = "fullName")
    private String fullname;

    /**
     * 身份证
     */
    @Column(name = "idCard")
    private String idcard;

    /**
     * 性别0男1女性
     */
    private Integer sex;

    /**
     * 微信号
     */
    @Column(name = "wxNum")
    private String wxnum;

    /**
     * 微信二维码图片
     */
    @Column(name = "wxERMImg")
    private String wxermimg;

    /**
     * 收款二维码图
     */
    @Column(name = "skERMImg")
    private String skermimg;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    @Column(name = "hhrEndTime")
    private Date hhrendtime;

    @Column(name = "yyjTime")
    private Date yyjtime;

    /**
     * 状态0可用1不可用
     */
    private Integer status;

    /**
     * 帐户积分
     */
    @Column(name = "userScore")
    private Integer userscore;

    /**
     * 帐户余额
     */
    private Double balance;

    /**
     * 父级用户id
     */
    @Column(name = "parentUserId")
    private Integer parentuserid;

    /**
     * 父级用户邀请奖励是否领取0未领取1领取
     */
    @Column(name = "parentUserLQ")
    private Integer parentuserlq;

    private Integer yyj;

    /**
     * 已做任务总数量
     */
    @Column(name = "doTaskNum")
    private Integer dotasknum;

    /**
     * 今日已做任务数量
     */
    @Column(name = "doTaskTodayNum")
    private Integer dotasktodaynum;

    /**
     * 已做任务共赚多少钱
     */
    @Column(name = "doTaskMoney")
    private Double dotaskmoney;

    /**
     * 每天最多可做任务数量
     */
    @Column(name = "taskEveryDay")
    private Integer taskeveryday;

    /**
     * 预留字符串字段1
     */
    private String other1;

    /**
     * 预留字符串字段2
     */
    private String other2;

    /**
     * 预留int字段3
     */
    private Integer other3;

    /**
     * 预留int字段4
     */
    private Integer other4;

    /**
     * 父级用户的层级关系，从最高级到自己,每级用户用逗号隔开
     */
    @Column(name = "parentUserIdList")
    private String parentuseridlist;

    /**
     * @return userId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取用户来源 0微信
     *
     * @return userFrom - 用户来源 0微信
     */
    public Integer getUserfrom() {
        return userfrom;
    }

    /**
     * 设置用户来源 0微信
     *
     * @param userfrom 用户来源 0微信
     */
    public void setUserfrom(Integer userfrom) {
        this.userfrom = userfrom;
    }

    /**
     * 获取微信openId
     *
     * @return openId - 微信openId
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置微信openId
     *
     * @param openid 微信openId
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取显示昵称
     *
     * @return nickName - 显示昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置显示昵称
     *
     * @param nickname 显示昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取头像地址
     *
     * @return headImgUrl - 头像地址
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * 设置头像地址
     *
     * @param headimgurl 头像地址
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * 获取用户名
     *
     * @return userName - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取真实姓名
     *
     * @return fullName - 真实姓名
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * 设置真实姓名
     *
     * @param fullname 真实姓名
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * 获取身份证
     *
     * @return idCard - 身份证
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证
     *
     * @param idcard 身份证
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取性别0男1女性
     *
     * @return sex - 性别0男1女性
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别0男1女性
     *
     * @param sex 性别0男1女性
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取微信号
     *
     * @return wxNum - 微信号
     */
    public String getWxnum() {
        return wxnum;
    }

    /**
     * 设置微信号
     *
     * @param wxnum 微信号
     */
    public void setWxnum(String wxnum) {
        this.wxnum = wxnum;
    }

    /**
     * 获取微信二维码图片
     *
     * @return wxERMImg - 微信二维码图片
     */
    public String getWxermimg() {
        return wxermimg;
    }

    /**
     * 设置微信二维码图片
     *
     * @param wxermimg 微信二维码图片
     */
    public void setWxermimg(String wxermimg) {
        this.wxermimg = wxermimg;
    }

    /**
     * 获取收款二维码图
     *
     * @return skERMImg - 收款二维码图
     */
    public String getSkermimg() {
        return skermimg;
    }

    /**
     * 设置收款二维码图
     *
     * @param skermimg 收款二维码图
     */
    public void setSkermimg(String skermimg) {
        this.skermimg = skermimg;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * @return hhrEndTime
     */
    public Date getHhrendtime() {
        return hhrendtime;
    }

    /**
     * @param hhrendtime
     */
    public void setHhrendtime(Date hhrendtime) {
        this.hhrendtime = hhrendtime;
    }

    /**
     * @return yyjTime
     */
    public Date getYyjtime() {
        return yyjtime;
    }

    /**
     * @param yyjtime
     */
    public void setYyjtime(Date yyjtime) {
        this.yyjtime = yyjtime;
    }

    /**
     * 获取状态0可用1不可用
     *
     * @return status - 状态0可用1不可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态0可用1不可用
     *
     * @param status 状态0可用1不可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取帐户积分
     *
     * @return userScore - 帐户积分
     */
    public Integer getUserscore() {
        return userscore;
    }

    /**
     * 设置帐户积分
     *
     * @param userscore 帐户积分
     */
    public void setUserscore(Integer userscore) {
        this.userscore = userscore;
    }

    /**
     * 获取帐户余额
     *
     * @return balance - 帐户余额
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置帐户余额
     *
     * @param balance 帐户余额
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * 获取父级用户id
     *
     * @return parentUserId - 父级用户id
     */
    public Integer getParentuserid() {
        return parentuserid;
    }

    /**
     * 设置父级用户id
     *
     * @param parentuserid 父级用户id
     */
    public void setParentuserid(Integer parentuserid) {
        this.parentuserid = parentuserid;
    }

    /**
     * 获取父级用户邀请奖励是否领取0未领取1领取
     *
     * @return parentUserLQ - 父级用户邀请奖励是否领取0未领取1领取
     */
    public Integer getParentuserlq() {
        return parentuserlq;
    }

    /**
     * 设置父级用户邀请奖励是否领取0未领取1领取
     *
     * @param parentuserlq 父级用户邀请奖励是否领取0未领取1领取
     */
    public void setParentuserlq(Integer parentuserlq) {
        this.parentuserlq = parentuserlq;
    }

    /**
     * @return yyj
     */
    public Integer getYyj() {
        return yyj;
    }

    /**
     * @param yyj
     */
    public void setYyj(Integer yyj) {
        this.yyj = yyj;
    }

    /**
     * 获取已做任务总数量
     *
     * @return doTaskNum - 已做任务总数量
     */
    public Integer getDotasknum() {
        return dotasknum;
    }

    /**
     * 设置已做任务总数量
     *
     * @param dotasknum 已做任务总数量
     */
    public void setDotasknum(Integer dotasknum) {
        this.dotasknum = dotasknum;
    }

    /**
     * 获取今日已做任务数量
     *
     * @return doTaskTodayNum - 今日已做任务数量
     */
    public Integer getDotasktodaynum() {
        return dotasktodaynum;
    }

    /**
     * 设置今日已做任务数量
     *
     * @param dotasktodaynum 今日已做任务数量
     */
    public void setDotasktodaynum(Integer dotasktodaynum) {
        this.dotasktodaynum = dotasktodaynum;
    }

    /**
     * 获取已做任务共赚多少钱
     *
     * @return doTaskMoney - 已做任务共赚多少钱
     */
    public Double getDotaskmoney() {
        return dotaskmoney;
    }

    /**
     * 设置已做任务共赚多少钱
     *
     * @param dotaskmoney 已做任务共赚多少钱
     */
    public void setDotaskmoney(Double dotaskmoney) {
        this.dotaskmoney = dotaskmoney;
    }

    /**
     * 获取每天最多可做任务数量
     *
     * @return taskEveryDay - 每天最多可做任务数量
     */
    public Integer getTaskeveryday() {
        return taskeveryday;
    }

    /**
     * 设置每天最多可做任务数量
     *
     * @param taskeveryday 每天最多可做任务数量
     */
    public void setTaskeveryday(Integer taskeveryday) {
        this.taskeveryday = taskeveryday;
    }

    /**
     * 获取预留字符串字段1
     *
     * @return other1 - 预留字符串字段1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * 设置预留字符串字段1
     *
     * @param other1 预留字符串字段1
     */
    public void setOther1(String other1) {
        this.other1 = other1;
    }

    /**
     * 获取预留字符串字段2
     *
     * @return other2 - 预留字符串字段2
     */
    public String getOther2() {
        return other2;
    }

    /**
     * 设置预留字符串字段2
     *
     * @param other2 预留字符串字段2
     */
    public void setOther2(String other2) {
        this.other2 = other2;
    }

    /**
     * 获取预留int字段3
     *
     * @return other3 - 预留int字段3
     */
    public Integer getOther3() {
        return other3;
    }

    /**
     * 设置预留int字段3
     *
     * @param other3 预留int字段3
     */
    public void setOther3(Integer other3) {
        this.other3 = other3;
    }

    /**
     * 获取预留int字段4
     *
     * @return other4 - 预留int字段4
     */
    public Integer getOther4() {
        return other4;
    }

    /**
     * 设置预留int字段4
     *
     * @param other4 预留int字段4
     */
    public void setOther4(Integer other4) {
        this.other4 = other4;
    }

    /**
     * 获取父级用户的层级关系，从最高级到自己,每级用户用逗号隔开
     *
     * @return parentUserIdList - 父级用户的层级关系，从最高级到自己,每级用户用逗号隔开
     */
    public String getParentuseridlist() {
        return parentuseridlist;
    }

    /**
     * 设置父级用户的层级关系，从最高级到自己,每级用户用逗号隔开
     *
     * @param parentuseridlist 父级用户的层级关系，从最高级到自己,每级用户用逗号隔开
     */
    public void setParentuseridlist(String parentuseridlist) {
        this.parentuseridlist = parentuseridlist;
    }
}