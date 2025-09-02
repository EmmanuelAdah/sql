package com.pickup.data.models;

import java.util.List;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class TrackingInfos {
    @Id
    private String trackingId;
    private String itemId;
    private List<TrackingInfo> trackingInfos;
}
