package org.dows.account.form;

import java.util.Date;

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

/**
 * 账号-组(AccountGroupInfo)实体类
 *
 * @author lait
 * @since 2023-01-09 15:01:25
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AccountGroupInfo对象", description = "账号-组")
public class AccountGroupInfoForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("自增主键ID")
    private Long id;


    @ApiModelProperty("组别ID")
    private String groupId;


    @ApiModelProperty("组名/团队名称")
    private String groupName;


    @ApiModelProperty("负责人名称")
    private String owner;


    @ApiModelProperty("负责人电话")
    private Boolean ownerPhone;


    @ApiModelProperty("所在区域")
    private String district;


    @ApiModelProperty("团队地址")
    private String address;


    @ApiModelProperty("团队描述")
    private String descr;


}

