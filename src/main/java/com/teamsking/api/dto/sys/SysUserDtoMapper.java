package com.teamsking.api.dto.sys;


import com.teamsking.api.dto.open.AddOpenTeacherDto;
import com.teamsking.domain.entity.sys.SysUser;
import java.util.List;

import com.teamsking.domain.entity.sys.UserTeacher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SysUserDtoMapper {

    SysUserDtoMapper INSTANCE = Mappers.getMapper(SysUserDtoMapper.class);

    List<SysUserDto> entityListToDtoList(List<SysUser> entityList);

    SysUserDto entityToDto(SysUser sysUser);

    SysUser dtoToEntity(SysUserDto sysUserDto);

    SysUser AddTeacherDtoToEtity(AddOpenTeacherDto addOpenTeacherDto);

    List<UserDto> entityDtoToUserDtoList(List<SysUser> sysUserList);


}
