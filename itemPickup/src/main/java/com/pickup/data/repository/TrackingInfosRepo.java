package com.pickup.data.repository;

import com.pickup.data.models.Item;
import com.pickup.data.models.TrackingInfos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingInfosRepo extends MongoRepository<TrackingInfos, String> {

}
