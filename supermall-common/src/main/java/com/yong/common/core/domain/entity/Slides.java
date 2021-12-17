package com.yong.common.core.domain.entity;

import com.yong.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Slides extends BaseEntity {
    /**
     * 自增主键id
     */
    private int	id;
    /**
     * 标题
     */
    private String	title;
    /**
     * 链接
     */
    private String	url;
    /**
     * 轮播图集
     */
    private String	img;
    /**
     * 0禁用1正常
     */
    private String	status;
}
