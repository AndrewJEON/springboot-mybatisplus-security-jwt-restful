package com.github.base.service.interf.manage;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.base.dto.manage.role.SysRoleInTableDetailDTO;
import com.github.base.dto.manage.role.SysRoleInsertOneDTO;
import com.github.base.dto.manage.role.SysRoleUpdateOneDTO;
import com.github.common.db.entity.primary.SysRole;
import com.github.common.tool.SimplePageInfo;

import javax.management.InvalidAttributeValueException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;

public interface SysRoleService extends IService<SysRole> {
    Long insertOne(SysRoleInsertOneDTO roleInsertOneDTO);

    Boolean deleteOne(Long id);

    Boolean updateOne(SysRoleUpdateOneDTO roleUpdateOneDTO);

    SysRoleInTableDetailDTO selectOne(Long id);

    SimplePageInfo<SysRole> selectList(Integer pageNum, Integer pageSize, Boolean isDelete, LinkedHashMap<String, Boolean> orderBy) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException, InvalidAttributeValueException;

    Boolean deleteOnePhysical(Long id);

    Boolean isExist(String role);

    Boolean isExistExceptSelf(String role, Long id);
}
