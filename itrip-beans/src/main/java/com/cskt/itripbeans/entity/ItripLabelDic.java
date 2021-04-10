package com.cskt.itripbeans.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.cskt.itripbeans.entity.ItripLabelDic")
@Data
@TableName(value = "itrip_label_dic")
public class ItripLabelDic implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * key值
     */
    @TableField(value = "name")
    @ApiModelProperty(value="key值")
    private String name;

    /**
     * value值
     */
    @TableField(value = "value")
    @ApiModelProperty(value="value值")
    private String value;

    /**
     * 描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value="描述")
    private String description;

    /**
     * 父级标签id(1级标签则为0)
     */
    @TableField(value = "parentId")
    @ApiModelProperty(value="父级标签id(1级标签则为0)")
    private Long parentid;

    /**
     * 标签图片地址
     */
    @TableField(value = "pic")
    @ApiModelProperty(value="标签图片地址")
    private String pic;

    @TableField(value = "creationDate")
    @ApiModelProperty(value="null")
    private Date creationdate;

    @TableField(value = "createdBy")
    @ApiModelProperty(value="null")
    private Long createdby;

    @TableField(value = "modifyDate")
    @ApiModelProperty(value="null")
    private Date modifydate;

    @TableField(value = "modifiedBy")
    @ApiModelProperty(value="null")
    private Long modifiedby;

    private static final long serialVersionUID = 1L;
}