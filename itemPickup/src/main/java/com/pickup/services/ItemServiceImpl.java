package com.pickup.services;

import com.pickup.data.models.Item;
import com.pickup.data.repository.ItemsRepo;
import com.pickup.dtos.request.SendItemRequest;
import com.pickup.dtos.response.SendItemResponse;
import org.springframework.stereotype.Service;
import static com.pickup.utils.Mapper.map;

@Service
public class ItemServiceImpl implements ItemService {
    private ItemsRepo itemsRepo;

    SendItemResponse sendItem(SendItemRequest sendItemRequest){
        Item item = map(sendItemRequest);
        itemsRepo.save(item);
        SendItemResponse sendItemResponse = map(item);
        return sendItemResponse;
    }
}
