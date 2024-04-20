package com.zholdoshov.datastoremicroservice.config;

import com.zholdoshov.datastoremicroservice.model.MeasurementType;

public class RedisSchema {

    // set
    public static String sensorKeys() {
        return KeyHelper.getKey("sensors");
    }

    // hash with summary type
    public static String summaryKey(
            Long sensorId,
            MeasurementType measurementType
    ) {
       return KeyHelper.getKey("sensors:" + sensorId + ":" + measurementType.name().toLowerCase());
    }
}
