package com.teamsking.domain.service;



import com.teamsking.domain.entity.SysRole;
import com.teamsking.domain.repository.SysRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SysRoleService {

    @Autowired
    SysRoleMapper sysRoleMapper;

    /**
     * 查询角色
     * @return
     */
    public List<SysRole> list() {
        return sysRoleMapper.selectAll();
    }

    /**
     * 添加角色
     * @param sysRole
     * @return
     */
    public int save(SysRole sysRole){
        return sysRoleMapper.insert(sysRole);
    }

    /**
     * 删除角色
     * @param id
     * @return
     */
    public int remove(Integer id){
        return sysRoleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改角色
     * @param sysRole
     * @return
     */
    public int modify(SysRole sysRole){
        return sysRoleMapper.updateByPrimaryKeySelective(sysRole);
    }
}
