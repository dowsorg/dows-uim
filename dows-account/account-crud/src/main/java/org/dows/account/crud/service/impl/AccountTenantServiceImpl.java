package org.dows.account.crud.service.impl;


import org.dows.account.crud.entity.AccountTenant;
import org.dows.account.crud.mapper.AccountTenantMapper;
import org.dows.account.crud.service.AccountTenantService;
import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 账号-租户维度信息(AccountTenant)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2022-07-14 21:33:48
 */
@Service
public class AccountTenantServiceImpl extends MybatisCrudServiceImpl<AccountTenantMapper, AccountTenant> implements AccountTenantService {

}
