package org.dows.rbac.form;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * rbac-url(RbacUri)表单
 *
 * @author lait.zhang
 * @since 2022-10-22 10:43:19
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "RbacUriForm 表单对象", description = "rbac-url")
public class RbacUriForm implements Serializable {
    private static final long serialVersionUID = 627246538996506348L;
    @JsonIgnore
    private Long id;

    @ApiModelProperty("资源路径")
    private String uriPath;

    @ApiModelProperty("资源描述")
    private String uriDescr;

    @ApiModelProperty("业务code")
    private String bizCode;

    @ApiModelProperty("pageID")
    private String pageId;

    @ApiModelProperty("名称首字母")
    private String nameLetters;

    @ApiModelProperty("应用名称")
    private String appName;

    @ApiModelProperty("应用 id")
    private String appId;

    @JsonIgnore
    private Boolean deleted;


}

