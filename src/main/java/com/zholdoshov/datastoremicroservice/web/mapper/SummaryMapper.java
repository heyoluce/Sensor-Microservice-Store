package com.zholdoshov.datastoremicroservice.web.mapper;

import com.zholdoshov.datastoremicroservice.model.Summary;
import com.zholdoshov.datastoremicroservice.web.dto.SummaryDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto> {
}
