package com.tangquan.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Author: wangfeng
 * Date: 17/12/1
 * Time: 下午2:50
 */
@ApiModel(value = "Customer",description = "客户信息")
@Entity
@Table(name="hezu_customer")
public class Customer {

    @Id
    @ApiModelProperty(value = "id",required = true)
    private Integer id;

    @ApiModelProperty(value = "账户名-手机号",required = true)
    @Column(name = "username", nullable = false)
    private String username;

    @ApiModelProperty(value = "密码-验证码",required = true)
    @Column(name = "password", nullable = false)
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间",required = true)
    @Column(name = "create_time", nullable = false)
    private Date create_time;

    @ApiModelProperty(value = "性别",required = true)
    @Column(name = "gender", nullable = false)
    private Integer gender;

    @ApiModelProperty(value = "出生年份",required = true)
    @Column(name = "birth_year", nullable = false)
    private String birth_year;

    @ApiModelProperty(value = "职业",required = true)
    @Column(name = "vocation", nullable = false)
    private Integer vocation;

    @ApiModelProperty(value = "所在区域",required = true)
    @Column(name = "district", nullable = false)
    private Integer district;

    @ApiModelProperty(value = "昵称-微信获取",required = true)
    @Column(name = "name", nullable = false)
    private String name;

    @ApiModelProperty(value = "积分",required = true)
    @Column(name = "score", nullable = false)
    private Integer score;

    @ApiModelProperty(value = "头像-微信获取",required = true)
    @Column(name = "avatar", nullable = false)
    private String avatar;

    @ApiModelProperty(value = "微信用户名",required = true)
    @Column(name = "weichat_name", nullable = false)
    private String weichat_name;

    @ApiModelProperty(value = "最近一次登录时间",required = true)
    @Column(name = "update_time", nullable = false)
    private Date update_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getCreate_time() {
        return create_time;
    }


    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public Integer getVocation() {
        return vocation;
    }

    public void setVocation(Integer vocation) {
        this.vocation = vocation;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getWeichat_name() {
        return weichat_name;
    }

    public void setWeichat_name(String weichat_name) {
        this.weichat_name = weichat_name;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
