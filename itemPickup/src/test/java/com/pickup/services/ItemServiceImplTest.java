package com.pickup.services;

import com.pickup.data.repository.Items;
import com.pickup.dtos.request.SendItemRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ItemServiceImplTest {

    @Autowired
    private ItemServiceImpl itemService;

    @Autowired
    private Items items;

    @Test
    void itemServiceTest() {
        itemService.sendItem(new SendItemRequest());
        assertEquals(1, items.count());
    }
}