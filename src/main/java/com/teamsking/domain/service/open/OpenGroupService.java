package com.teamsking.domain.service.open;


import com.teamsking.domain.entity.open.OpenGroup;
import com.teamsking.domain.repository.OpenGroupMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OpenGroupService {

    @Autowired
    OpenGroupMapper openGroupMapper;

    /**
     * 获取班次-学生组列表
     * @return
     */
    public List<OpenGroup> list(){

        return openGroupMapper.selectAll();

    }

    /**
     * 添加班次-学生组
     * @param openGroup
     * @return
     */
    public int save(OpenGroup openGroup){

        return openGroupMapper.insert(openGroup);

    }


    /**
     * 删除班次-学生组
     * @param id
     * @return
     */
    public int remove(Integer id){

        return openGroupMapper.deleteByPrimaryKey(id);

    }

    /**
     * 添加班次-学生组
     * @param openGroup
     * @return
     */
    public int modify(OpenGroup openGroup){

        return openGroupMapper.updateByPrimaryKeySelective(openGroup);

    }

}