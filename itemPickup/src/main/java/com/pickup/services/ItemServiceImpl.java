package com.pickup.services;

import com.pickup.data.models.Item;
import com.pickup.data.repository.Items;
import com.pickup.dtos.request.SendItemRequest;
import com.pickup.dtos.response.SendItemResponse;
import org.springframework.stereotype.Service;
import static com.pickup.utils.Mapper.map;

@Service
public class ItemServiceImpl implements ItemService {
    private Items items;

    SendItemResponse sendItem(SendItemRequest sendItemRequest){
        Item item = map(sendItemRequest);
        items.save(item);
        SendItemResponse sendItemResponse = map(item);
        return sendItemResponse;
    }
}
