package com.zholdoshov.datastoremicroservice.web.controller;

import com.zholdoshov.datastoremicroservice.model.MeasurementType;
import com.zholdoshov.datastoremicroservice.model.Summary;
import com.zholdoshov.datastoremicroservice.model.SummaryType;
import com.zholdoshov.datastoremicroservice.service.SummaryService;
import com.zholdoshov.datastoremicroservice.web.dto.SummaryDto;
import com.zholdoshov.datastoremicroservice.web.mapper.SummaryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/analytics")
@RequiredArgsConstructor
public class AnalyticsController {

   private final SummaryService summaryService;
   private final SummaryMapper summaryMapper;

    @GetMapping("/summary/{sensorId}")
    public SummaryDto getSummary(@PathVariable("sensorId") Long sensorId,
                                 @RequestParam(value = "mt", required = false)
                                 Set<MeasurementType> measurementTypes,
                                 @RequestParam(value = "st", required = false)
                                 Set<SummaryType> summaryTypes)
    {
        Summary summary = summaryService.get(
                sensorId,
                measurementTypes,
                summaryTypes
        );

        return summaryMapper.toDto(summary);
    }

}
