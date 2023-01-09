package org.dows.tenant.form;

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
 * 租户-账号(TenantAccounts)实体类
 *
 * @author lait
 * @since 2023-01-08 16:35:29
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "TenantAccounts对象", description = "租户-账号")
public class TenantAccountsForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("账号角色ID")
    private Long id;


    @ApiModelProperty("租户id")
    private String tenantId;


    @ApiModelProperty("应用ID")
    private String appId;


    @ApiModelProperty("账号ID")
    private String accountId;


    @ApiModelProperty("用户ID")
    private String userId;


}

