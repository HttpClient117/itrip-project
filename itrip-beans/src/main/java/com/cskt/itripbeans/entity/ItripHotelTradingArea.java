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

@ApiModel(value="com.cskt.itripbeans.entity.ItripHotelTradingArea")
@Data
@TableName(value = "itrip_hotel_trading_area")
public class ItripHotelTradingArea implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="null")
    private Long id;

    /**
     * 酒店id
     */
    @TableField(value = "hotelId")
    @ApiModelProperty(value="酒店id")
    private Long hotelid;

    /**
     * 商圈id
     */
    @TableField(value = "areaId")
    @ApiModelProperty(value="商圈id")
    private Long areaid;

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