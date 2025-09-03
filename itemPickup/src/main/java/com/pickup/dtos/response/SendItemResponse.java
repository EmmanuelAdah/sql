package com.pickup.dtos.response;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class SendItemResponse {
    private String itemId;
    private String itemName;
    private String senderName;
    private String weightInGrams;
    private String description;
    private String receiverName;
}
