package com.zholdoshov.datastoremicroservice.web.dto;

import com.zholdoshov.datastoremicroservice.model.MeasurementType;
import com.zholdoshov.datastoremicroservice.model.Summary;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class SummaryDTO {

    private Long sensorId;
    private Map<MeasurementType, List<Summary.SummaryEntry>> values;



}
