package org.dows.account.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.dows.framework.api.StatusCode;

/**
 * @author runsix
 */
@Getter
@AllArgsConstructor
public enum EnumAccountStatusCode implements StatusCode {
    ACCOUNT_EXIST_EXCEPTION(400001, "账号已存在"),
    BATCH_IMPORT_IDENTIFIER_DUPLICATED(400002, "批量导入数据账户有重复"),
    ACCOUNT_INSTANCE_DTO_CANNOT_BE_NULL(400003, "账户实例不能为空"),
    ACCOUNT_ORG_IS_NOT_EXIST(400004, "该组织架构下的组织不存在"),
    APPID_CANNOT_BE_BLANK(400005, "应用ID不能为空"),
    IDENTIFIER_CANNOT_BE_BLANK(400006, "账号不能为空"),
    ACCOUNT_NAME_CANNOT_BE_BLANK(400007, "账号昵称不能为空"),
    ORG_NOT_EXIST_EXCEPTION(400008, "组织架构不存在"),
    ACCOUNT_NOT_EXIST_EXCEPTION(400009, "账号不存在"),
    ACCOUNT_STATUS_INVALID_EXCEPTION(400010, "账号已失效"),
    ACCOUNT_NOT_IN_VALIDITY_EXCEPTION(400011, "账号不在有效期"),
    ACCOUNT_PASSWORD_NOT_MATCH_EXCEPTION(400012, "账号与密码不匹配"),
    JWT_CLAIMS_NOT_NULL_EXCEPTION(400013, "jwt不能为空"),
    ACCOUNT_CREATE_FAIL_EXCEPTION(400014, "创建账号失败"),
    ACCOUNT_USER_UNION_FAIL_EXCEPTION(400015, "创建账号用户关联关系失败"),
    ACCOUNT_GROUP_MEMBER_FAIL_EXCEPTION(400016, "创建组成员失败"),
    ACCOUNT_UPDATE_FAIL_EXCEPTION(400017, "更新账号失败"),
    ACCOUNT_USER_NOT_EXIST_EXCEPTION(400018,"该账号没有对应的用户信息"),
    ORG_CREATE_FAIL_EXCEPTION(400019, "创建组织架构失败"),
    GROUP_INFO_CREATE_FAIL_EXCEPTION(400020, "创建组织失败"),
    ACCOUNT_ORG_IS_EXIST_EXCEPTION(400021, "该组织架构下的组织已存在"),
    ACCOUNT_ORG_UPDATE_FAIL_EXCEPTION(400022, "更新组织架构失败"),
    ACCOUNT_GROUP_UPDATE_FAIL_EXCEPTION(400023, "更新组员失败"),
    ACCOUNT_ORG_NOT_EXIST_EXCEPTION(400024, "该组织架构不存在"),
    ACCOUNT_GROUP_NOT_EXIST_EXCEPTION(400025, "该组织架构下不存在组员"),
    ACCOUNT_GROUP_INFO_NOT_EXIST_EXCEPTION(400026, "该组织不存在"),
    ACCOUNT_ROLE_UNION_FAIL_EXCEPTION(400027, "创建账号角色关联关系失败"),
    ACCOUNT_TENANT_CREATE_FAIL_EXCEPTION(400028, "创建账号租户关系失败");
    final Integer code;
    final String descr;
}
