package org.dows.account.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import java.util.Date;

/**
 * @author Administrator
 * @date 2023/1/9 20:25
 */
@Data
@ToString
@Builder
@EqualsAndHashCode
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "AccountGroupInfoVo对象", description = "账号-组信息")
public class AccountGroupInfoVo {

    @ApiModelProperty("自增主键ID")
    private Long id;

    @ApiModelProperty("组织架构ID")
    private String orgId;

    @ApiModelProperty("组织架构名称")
    private String orgName;

    @ApiModelProperty("组别ID")
    private String groupInfoId;

    @ApiModelProperty("组名/团队名称")
    private String groupInfoName;

    @ApiModelProperty("负责人账户ID")
    private String accountId;

    @ApiModelProperty("负责人用户ID")
    private String userId;

    @ApiModelProperty("负责人名称")
    private String owner;

    @ApiModelProperty("负责人电话")
    private String ownerPhone;

    @ApiModelProperty("所在区域")
    private String district;

    @ApiModelProperty("团队地址")
    private String address;

    @ApiModelProperty("团队描述")
    private String descr;

    @ApiModelProperty("是否逻辑删除")
    private Boolean deleted;

    @ApiModelProperty("创建时间")
    private Date dt;
}
