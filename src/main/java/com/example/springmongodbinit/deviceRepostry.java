package com.example.springmongodbinit;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface deviceRepostry  extends MongoRepository<device , String> {

}
