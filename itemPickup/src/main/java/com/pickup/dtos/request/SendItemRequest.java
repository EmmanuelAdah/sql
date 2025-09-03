package com.pickup.dtos.request;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SendItemRequest {
    @Id
    private String itemId;
    private String itemName;
    private String senderName;
    private String weightInGrams;
    private String description;
    private String receiverName;
}
