package org.dows.account.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 账号-第三方账号授权(AccountOauthToken)DTO类
 * @author: VX:PN15855012581
 * @create: 2022-07-14 21:33:34
 */
@Data
@ToString
@Builder
@EqualsAndHashCode
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "AccountOauthToken对象", description = "账号-第三方账号授权")
public class AccountOauthTokenDto implements Serializable {
    private static final long serialVersionUID = -77706257915148257L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "account_oauth_token id")
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "AccountIdentifierId")
    private Long accountIdentifierId;
    @ApiModelProperty(value = "是否支持 refreshToken, 默认: 0. 1 表示支持, 0 表示不支持")
    private Boolean enableRefresh;
    @ApiModelProperty(value = "第三方服务商,如: qq,github")
    private String providerId;
    @ApiModelProperty(value = "第三方用户id")
    private String providerUserId;
    @ApiModelProperty(value = "accessToken")
    private String accessToken;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "accessToken过期时间 无过期时间默认为 -1")
    private Long expireIn;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "refreshToken过期时间 无过期时间默认为 -1")
    private Long refreshTokenExpireIn;
    @ApiModelProperty(value = "refreshToken")
    private String refreshToken;
    @ApiModelProperty(value = "alipay userId")
    private String uid;
    @ApiModelProperty(value = "qq/mi/toutiao/wechatMp/wechatOpen/weibo/jd/kujiale/dingTalk/douyin/feishu")
    private String openId;
    @ApiModelProperty(value = "dingTalk, taobao 附带属性")
    private String accessCode;
    @ApiModelProperty(value = "企业微信附带属性")
    private String code;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "过期时间, 基于 1970-01-01T00:00:00Z, 无过期时间默认为 -1")
    private Long expireTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "租户ID")
    private Long tenantId;
    @ApiModelProperty(value = "应用id")
    private String appId;
    @ApiModelProperty(value = "时间戳")
    private Date dt;


}
