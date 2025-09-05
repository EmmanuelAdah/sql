package com.pickup.data.repository;

import com.pickup.data.models.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepo extends MongoRepository<Item, String> {

}
