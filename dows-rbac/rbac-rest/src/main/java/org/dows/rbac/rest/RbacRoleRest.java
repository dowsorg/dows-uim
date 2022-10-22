package org.dows.rbac.rest;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.dows.rbac.entity.RbacRole;
import org.dows.rbac.form.RbacRoleForm;
import org.dows.rbac.service.RbacRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * rbac-角色(RbacRole)表控制层
 *
 * @author lait.zhang
 * @since 2022-10-22 10:43:19
 */
@Api(tags = "rbac-角色")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("rbacRole")
public class RbacRoleRest implements MybatisCrudRest<RbacRoleForm, RbacRole, RbacRoleService> {

    //private final RbacRoleBiz rbacRoleBiz;

}

