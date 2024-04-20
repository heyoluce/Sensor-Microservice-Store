package com.zholdoshov.datastoremicroservice;

import com.zholdoshov.datastoremicroservice.model.Summary;
import com.zholdoshov.datastoremicroservice.web.dto.SummaryDto;
import com.zholdoshov.datastoremicroservice.web.mapper.Mappable;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto> {
}
