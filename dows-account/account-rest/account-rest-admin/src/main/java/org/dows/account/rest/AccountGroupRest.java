package org.dows.account.rest;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dows.account.api.AccountGroupApi;
import org.dows.account.dto.AccountGroupDTO;
import org.dows.account.entity.AccountGroup;
import org.dows.account.form.AccountGroupForm;
import org.dows.account.service.AccountGroupService;
import org.dows.account.vo.AccountGroupVo;
import org.dows.account.vo.NormalDataVo;
import org.dows.framework.api.Response;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 账号-组(AccountGroup)表控制层
 *
 * @author lait.zhang
 * @since 2022-10-22 10:07:25
 */
@Api(tags = "账号-组")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("accountGroup")
public class AccountGroupRest implements MybatisCrudRest<AccountGroupForm, AccountGroup, AccountGroupService> {

    private final AccountGroupApi accountGroupApi;

    @ApiOperation("保存 账号-组织")
    @PostMapping("/createAccountGroups")
    public Response createAccountGroup(@RequestBody AccountGroupDTO accountGroupDTO) {
        accountGroupApi.insertOrUpdateAccountGroup(accountGroupDTO);
        return Response.ok();
    }

    @ApiOperation("批量保存 账号-组织")
    @PostMapping("/batchCreateAccountGroups")
    public Response batchCreateAccountGroup(@RequestBody List<AccountGroupDTO> accountGroupDTOs) {
        accountGroupApi.batchInsertGroup(accountGroupDTOs);
        return Response.ok();
    }

    @ApiOperation("自定义查询 账号-组-成员 列表")
    @PostMapping("/customAccountGroupList")
    public Response<IPage<AccountGroupVo>> customAccountGroupList(@RequestBody AccountGroupDTO accountGroupDTO) {
        return accountGroupApi.customAccountGroupList(accountGroupDTO);
    }

    @ApiOperation("查询年龄段占比 组-成员")
    @PostMapping("/getAgeRateList")
    public Response<List<NormalDataVo>> getAgeRateList(@RequestBody AccountGroupDTO accountGroupDTO) {
        return accountGroupApi.getAgeRateList(accountGroupDTO);
    }
}

