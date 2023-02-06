package org.dows.account.api;

import org.dows.account.vo.AccountVo;

import java.util.List;

/**
 * 账号-用户维度信息(AccountUser)Api接口
 *
 * @author VX:PN15855012581
 * @since 2021-09-10 15:41:36
 */
public interface AccountUserApi {

    AccountVo getInfoByAccountId(String accountId);

    List<AccountVo> getInfoByAccountIds(String[] accountIds);

    AccountVo queryAccountVoByAccountName(String accountName,Integer accountType);
}
