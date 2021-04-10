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

@ApiModel(value="com.cskt.itripbeans.entity.ItripHotelTempStore")
@Data
@TableName(value = "itrip_hotel_temp_store")
public class ItripHotelTempStore implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="null")
    private Long id;

    @TableField(value = "hotelId")
    @ApiModelProperty(value="null")
    private Integer hotelid;

    /**
     * 商品id
     */
    @TableField(value = "roomId")
    @ApiModelProperty(value="商品id")
    private Long roomid;

    /**
     * 记录时间
     */
    @TableField(value = "recordDate")
    @ApiModelProperty(value="记录时间")
    private Date recorddate;

    /**
     * 库存
     */
    @TableField(value = "store")
    @ApiModelProperty(value="库存")
    private Integer store;

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