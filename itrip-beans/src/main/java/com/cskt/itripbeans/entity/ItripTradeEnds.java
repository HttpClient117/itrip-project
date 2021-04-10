package com.cskt.itripbeans.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value="com.cskt.itripbeans.entity.ItripTradeEnds")
@Data
@TableName(value = "itrip_trade_ends")
public class ItripTradeEnds implements Serializable {
    /**
     * 订单ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="订单ID")
    private Long id;

    /**
     * 订单编号(注意非支付宝交易编号tradeNo)
     */
    @TableField(value = "orderNo")
    @ApiModelProperty(value="订单编号(注意非支付宝交易编号tradeNo)")
    private String orderno;

    /**
     * 标识字段(默认0：未处理；1：处理中)
     */
    @TableField(value = "flag")
    @ApiModelProperty(value="标识字段(默认0：未处理；1：处理中)")
    private Boolean flag;

    private static final long serialVersionUID = 1L;
}