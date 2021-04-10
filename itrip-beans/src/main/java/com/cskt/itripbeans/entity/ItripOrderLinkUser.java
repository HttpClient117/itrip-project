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

@ApiModel(value="com.cskt.itripbeans.entity.ItripOrderLinkUser")
@Data
@TableName(value = "itrip_order_link_user")
public class ItripOrderLinkUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 订单id
     */
    @TableField(value = "orderId")
    @ApiModelProperty(value="订单id")
    private Long orderid;

    /**
     * 联系人id
     */
    @TableField(value = "linkUserId")
    @ApiModelProperty(value="联系人id")
    private Long linkuserid;

    /**
     * 入住人姓名逗号分隔
     */
    @TableField(value = "linkUserName")
    @ApiModelProperty(value="入住人姓名逗号分隔")
    private String linkusername;

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