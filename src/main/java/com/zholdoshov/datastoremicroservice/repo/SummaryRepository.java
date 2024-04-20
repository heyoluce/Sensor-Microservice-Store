package com.zholdoshov.datastoremicroservice.repo;

import com.zholdoshov.datastoremicroservice.model.MeasurementType;
import com.zholdoshov.datastoremicroservice.model.Summary;
import com.zholdoshov.datastoremicroservice.model.SummaryType;

import java.util.Optional;
import java.util.Set;

public interface SummaryRepository {

    Optional<Summary> findBySensorId(
            Long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    );
}
