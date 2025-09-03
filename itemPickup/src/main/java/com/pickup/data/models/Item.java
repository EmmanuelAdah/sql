package com.pickup.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Item {
    @Id
    private String itemId;
    private String itemName;
    private String senderName;
    private String weightInGrams;
    private String description;
    private String receiverName;

    @DBRef
    private TrackingInfos trackingInfos;
}
