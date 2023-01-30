package org.dows.user.biz;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dows.framework.api.Response;
import org.dows.user.api.api.UserInstanceApi;
import org.dows.user.api.dto.UserInstanceDTO;
import org.dows.user.api.vo.UserInstanceVo;
import org.dows.user.entity.UserInstance;
import org.dows.user.enums.EnumUserStatusCode;
import org.dows.user.exception.UserException;
import org.dows.user.service.UserInstanceService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author：jiangxia
 * @Date：2023/01/10 13:26
 */
@RequiredArgsConstructor
@Slf4j
@Service
public class UserInstanceBiz implements UserInstanceApi {
    private final UserInstanceService userInstanceService;

    /**
     * 自定义查询 组成员列表
     *
     * @param userInstanceDTO
     * @return Response<IPage < UserInstanceVo>>
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Response<IPage<UserInstanceVo>> userInstanceUnionList(UserInstanceDTO userInstanceDTO) {
        LambdaQueryWrapper<UserInstance> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.in(userInstanceDTO.getUserIds() != null && userInstanceDTO.getUserIds().size() > 0,UserInstance::getUserId, userInstanceDTO.getUserIds())
                .like(StringUtils.isNotEmpty(userInstanceDTO.getName()),UserInstance::getName, userInstanceDTO.getName())
                .like(StringUtils.isNotEmpty(userInstanceDTO.getIdNo()),UserInstance::getIdNo, userInstanceDTO.getIdNo())
                .eq(StringUtils.isNotEmpty(userInstanceDTO.getAge()),UserInstance::getAge, userInstanceDTO.getAge())
                .like(StringUtils.isNotEmpty(userInstanceDTO.getNation()),UserInstance::getNation, userInstanceDTO.getNation())
                .like(StringUtils.isNotEmpty(userInstanceDTO.getSignOrg()),UserInstance::getSignOrg, userInstanceDTO.getSignOrg())
                .like(StringUtils.isNotEmpty(userInstanceDTO.getDomicile()),UserInstance::getDomicile, userInstanceDTO.getDomicile())
                .eq(userInstanceDTO.getBirthday() != null,UserInstance::getBirthday, userInstanceDTO.getBirthday())
                .gt(userInstanceDTO.getBirthdayStartTime() != null,UserInstance::getBirthday, userInstanceDTO.getBirthdayStartTime())
                .lt(userInstanceDTO.getBirthdayEndTime() != null,UserInstance::getBirthday, userInstanceDTO.getBirthdayEndTime())
                .gt(userInstanceDTO.getBirthdayStartTime() != null,UserInstance::getBirthday, userInstanceDTO.getBirthdayStartTime())
                .lt(userInstanceDTO.getBirthdayEndTime() != null,UserInstance::getBirthday, userInstanceDTO.getBirthdayEndTime())
                .gt(userInstanceDTO.getUserDate() != null,UserInstance::getIndate,userInstanceDTO.getUserDate())
                .lt(userInstanceDTO.getUserDate() != null,UserInstance::getExpdate,userInstanceDTO.getUserDate())
                .eq(userInstanceDTO.getDt() != null, UserInstance::getDt, userInstanceDTO.getDt())
                .gt(userInstanceDTO.getStartTime() != null, UserInstance::getDt, userInstanceDTO.getStartTime())
                .lt(userInstanceDTO.getEndTime() != null, UserInstance::getDt, userInstanceDTO.getEndTime())
                .eq(UserInstance::getDeleted, false)
                .orderByDesc(UserInstance::getDt);
        Page<UserInstance> page = new Page<>(userInstanceDTO.getPageNo(), userInstanceDTO.getPageSize());
        IPage<UserInstance> userList = userInstanceService.page(page, queryWrapper);
        //复制属性
        IPage<UserInstanceVo> pageVo = new Page<>();
        BeanUtils.copyProperties(userList, pageVo);
        return Response.ok(pageVo);
    }

    @Override
    public Response<Long> insertOrUpdateUserInstance(UserInstanceDTO userInstanceDTO) {
        UserInstance userInstance = new UserInstance();
        BeanUtils.copyProperties(userInstanceDTO, userInstance);
        boolean userFlag = userInstanceService.save(userInstance);
        if(userFlag == false){
            throw new UserException(EnumUserStatusCode.USER_CREATE_FAIL_EXCEPTION);
        }
        return Response.ok(userInstance.getId());
    }
}
