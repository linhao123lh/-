package com.teamsking.api.dto.open;


import com.teamsking.domain.entity.open.OpenSet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OpenSetDtoMapper {


    OpenSetDtoMapper INSTANCE = Mappers.getMapper(OpenSetDtoMapper.class);

    List<OpenSetDto> entityListToDtoList(List<OpenSet> entityList);

    OpenSetDto entityToDto(OpenSet openSet);

    OpenSet dtoToEntity(OpenSetDto openSetDto);


}