package com.pickup.utils;

import com.pickup.data.models.Item;
import com.pickup.dtos.request.SendItemRequest;
import com.pickup.dtos.response.SendItemResponse;

public class Mapper {

    public static Item map(SendItemRequest sendItemRequest) {
        Item item = new Item();
        return item;
    }

    public static SendItemResponse map(Item item) {
        SendItemResponse sendItemResponse = new SendItemResponse();
        return sendItemResponse;
    }
}
