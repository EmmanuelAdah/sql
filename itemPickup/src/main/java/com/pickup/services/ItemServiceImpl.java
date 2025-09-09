package com.pickup.services;

import com.pickup.data.models.Item;
import com.pickup.data.repository.ItemsRepo;
import com.pickup.dtos.request.SendItemRequest;
import com.pickup.dtos.response.SendItemResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.pickup.utils.Mapper.map;

@Service
public class ItemServiceImpl implements ItemService {
    private ItemsRepo itemsRepo;

    public SendItemResponse sendItem(SendItemRequest sendItemRequest){
        Item item = map(sendItemRequest);
        itemsRepo.save(item);
        SendItemResponse sendItemResponse = map(item);
        return sendItemResponse;
    }

    public Optional<Item> findAll(){
        List<Item> items = itemsRepo.findAll();
        return Optional.of(items);
    }
}
