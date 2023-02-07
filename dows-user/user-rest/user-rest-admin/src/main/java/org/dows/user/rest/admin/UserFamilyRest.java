package org.dows.user.rest.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dows.framework.api.Response;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.dows.user.api.api.UserFamilyApi;
import org.dows.user.api.dto.UserFamilyDTO;
import org.dows.user.api.vo.UserFamilyVo;
import org.dows.user.entity.UserFamily;
import org.dows.user.form.UserFamilyForm;
import org.dows.user.service.UserFamilyService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author Administrator
 * @date 2023/2/2 15:09
 */
@Api(tags = "用户-家庭")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("userFamily")
public class UserFamilyRest implements MybatisCrudRest<UserFamilyForm, UserFamily, UserFamilyService> {
    private final UserFamilyApi userFamilyApi;

    @ApiOperation("查询 家庭-族谱")
    @GetMapping("/getGenealogyList/{id}")
    public Response<UserFamilyVo> getGenealogyList(@PathVariable("id") Long id) {
        Response<UserFamilyVo> vo = userFamilyApi.getGenealogyList(id.toString());
        return vo;
    }

    @ApiOperation("查询 家庭档案列表")
    @PostMapping("/getFamilyArchivesList")
    public Response<IPage<UserFamilyVo>> getFamilyArchivesList(@RequestBody UserFamilyDTO userFamilyDTO) {
        Response<IPage<UserFamilyVo>>  pageList = userFamilyApi.getFamilyArchivesList(userFamilyDTO);
        return pageList;
    }

    @ApiOperation("新增 用户-家庭")
    @PostMapping("/insertUserFamily")
    public Response<Long> insertUserFamily(@RequestBody UserFamilyDTO userFamilyDTO) {
        Response<Long> id = userFamilyApi.insertUserFamily(userFamilyDTO);
        return id;
    }

    @ApiOperation("编辑 用户-家庭")
    @PostMapping("/updateUserFamilyById")
    public Response<Long> updateUserFamilyById(@RequestBody UserFamilyDTO userFamilyDTO) {
        Response<Long> id = userFamilyApi.updateUserFamilyById(userFamilyDTO);
        return id;
    }

    @ApiOperation("批量删除 用户-家庭")
    @PostMapping("/batchDeleteUserFamilys")
    public void batchDeleteUserFamilys(@RequestParam("ids") List<String> ids) {
        userFamilyApi.batchDeleteUserFamilys(ids);
    }
}
