package com.zholdoshov.datastoremicroservice.service;

import com.zholdoshov.datastoremicroservice.model.MeasurementType;
import com.zholdoshov.datastoremicroservice.model.Summary;
import com.zholdoshov.datastoremicroservice.model.SummaryType;

import java.util.Set;

public interface SummaryService {

    Summary get(
            Long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    );
}
