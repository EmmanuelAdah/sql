package com.pickup.controller;

import com.pickup.data.models.Item;
import com.pickup.dtos.request.SendItemRequest;
import com.pickup.dtos.response.SendItemResponse;
import com.pickup.services.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ItemController {
    private final ItemServiceImpl itemServiceImpl;

    @Autowired
    public ItemController(ItemServiceImpl itemServiceImpl) {
        this.itemServiceImpl = itemServiceImpl;
    }

    @PostMapping
    public SendItemResponse sendItem(SendItemRequest sendItemRequest){
        return itemServiceImpl.sendItem(sendItemRequest);
    }

    @GetMapping
    public Optional<Item> findAll(){
        return itemServiceImpl.findAll();
    }
}
