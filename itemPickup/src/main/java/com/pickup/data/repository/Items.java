package com.pickup.data.repository;

import com.pickup.data.models.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Items extends MongoRepository<Item, String> {

}
