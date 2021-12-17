package com.yong.common.core.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Entity基类
 *
 * @author yong
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

    /**
     * 请求参数
     */

    public Date getCreateTime() {
        return createdTime;
    }

    public void setCreateTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updatedTime;
    }

    public void setUpdateTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }


}
