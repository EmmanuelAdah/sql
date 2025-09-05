package com.pickup.data.repository;

import com.pickup.data.models.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataMongoTest
class ItemsTest {

    @Autowired
    private Items items;

    @Test
    void countTest() {
        items.deleteAll();
        items.save(new Item());
        assertEquals(1L, items.count());
    }
}