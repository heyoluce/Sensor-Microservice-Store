package com.zholdoshov.datastoremicroservice.web.dto;

import com.zholdoshov.datastoremicroservice.model.MeasurementType;
import com.zholdoshov.datastoremicroservice.model.Summary;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class SummaryDto {

    private Long sensorId;
    private Map<MeasurementType, List<Summary.SummaryEntry>> values;

}
