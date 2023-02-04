package org.dows.user.rest.admin;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dows.account.dto.AccountInstanceDTO;
import org.dows.account.vo.AccountInstanceVo;
import org.dows.framework.api.Response;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.dows.user.api.api.UserInstanceApi;
import org.dows.user.api.dto.UserInstanceDTO;
import org.dows.user.api.vo.UserInstanceVo;
import org.dows.user.entity.UserInstance;
import org.dows.user.service.UserInstanceService;
import org.dows.user.form.UserInstanceForm;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户-实例(UserInstance)表控制层
 *
 * @author lait.zhang
 * @since 2022-10-22 10:31:13
 */
@Api(tags = "用户-实例")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("userInstance")
public class UserInstanceRest implements MybatisCrudRest<UserInstanceForm, UserInstance, UserInstanceService> {

    private final UserInstanceApi userInstanceApi;

    @ApiOperation("查看 用户-实例-列表")
    @PostMapping("/customUserInstanceList")
    public Response<IPage<UserInstanceVo>> customUserInstanceList(@RequestBody UserInstanceDTO userInstanceDTO) {
        return userInstanceApi.userInstanceUnionList(userInstanceDTO);
    }

    @ApiOperation("新增 用户-实例")
    @PostMapping("/insertUserInstance")
    public Response<Long> insertUserInstance(@RequestBody UserInstanceDTO userInstanceDTO) {
        return userInstanceApi.insertUserInstance(userInstanceDTO);
    }

    @ApiOperation("更新 用户-实例")
    @PutMapping("/updateUserInstance")
    public Response<Long> updateUserInstance(@RequestBody UserInstanceDTO userInstanceDTO) {
        return userInstanceApi.updateUserInstance(userInstanceDTO);
    }

    @ApiOperation("查看 用户-实例")
    @GetMapping("/getUserInstanceById/{id}")
    public Response<UserInstanceVo> getUserInstanceById(@PathVariable("id") Long id) {
        return userInstanceApi.getUserInstanceById(id);
    }

    @ApiOperation("删除单个 用户-实例")
    @DeleteMapping("/deleteUserInstanceById/{id}")
    public Response deleteUserInstanceById(@PathVariable("id") Long id) {
        Response<Boolean> flag = userInstanceApi.deleteUserInstanceById(id.toString());
        return Response.ok(flag);
    }

    @ApiOperation("批量删除 用户-实例")
    @DeleteMapping("/deleteUserInstances")
    public void deleteUserInstances(@RequestParam("ids") List<String> ids) {
        userInstanceApi.deleteUserInstances(ids);
    }
}

