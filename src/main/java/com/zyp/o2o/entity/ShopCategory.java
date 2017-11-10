package com.zyp.o2o.entity;

import java.util.Date;

/**
 * 店铺类别实体类
 *
 * Created by Administrator on 2017/11/10.
 */
public class ShopCategory {
    //主键ID
    private Long shopCategoryId;
    //类别名称
    private String shopCategoryName;
    //类别描述
    private String getShopCategoryDesc;
    //类别图片地址（针对一级类别）
    private String getShopCategoryImg;
    //权重，越大越排前显示
    private Integer priority;
    //创建时间
    private Date createTime;
    //最近更新时间
    private Date lastTime;
    //父类别
    private ShopCategory parent;

    public Long getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Long shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopCategoryName() {
        return shopCategoryName;
    }

    public void setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName;
    }

    public String getGetShopCategoryDesc() {
        return getShopCategoryDesc;
    }

    public void setGetShopCategoryDesc(String getShopCategoryDesc) {
        this.getShopCategoryDesc = getShopCategoryDesc;
    }

    public String getGetShopCategoryImg() {
        return getShopCategoryImg;
    }

    public void setGetShopCategoryImg(String getShopCategoryImg) {
        this.getShopCategoryImg = getShopCategoryImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public ShopCategory getParent() {
        return parent;
    }

    public void setParent(ShopCategory parent) {
        this.parent = parent;
    }
}
