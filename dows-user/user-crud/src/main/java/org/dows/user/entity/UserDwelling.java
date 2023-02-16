package org.dows.user.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.dows.framework.crud.mybatis.CrudEntity;
import java.util.Date;

/**
 * 用户-住所(UserDwelling)实体类
 *
 * @author lait.zhang
 * @since 2022-12-20 11:46:14
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "UserDwelling对象", description = "用户-住所")
public class UserDwelling implements CrudEntity {
    private static final long serialVersionUID = -10611924502007111L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("主体ID")
    private String principalId;

    @ApiModelProperty("主体类型")
    private String principalType;

    @ApiModelProperty("家庭电话")
    private String telephone;

    @ApiModelProperty("邮政编码")
    private String zipCode;

    @ApiModelProperty("居住面积")
    private String acreage;

    @ApiModelProperty("人均面积")
    private String perarea;

    @ApiModelProperty("房屋类型")
    private String houseType;

    @ApiModelProperty("燃料")
    private String fuel;

    @ApiModelProperty("饮水")
    private String water;

    @ApiModelProperty("社区")
    private String community;

    @ApiModelProperty("厨房排风设施")
    private String exhaustFacility;

    @ApiModelProperty("畜牧栏种类")
    private String rearPoultry;

    @ApiModelProperty("厨房使用方式")
    private String kitchen;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("时间戳")
    private Date dt;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("逻辑删除")
    private Boolean deleted;

}

