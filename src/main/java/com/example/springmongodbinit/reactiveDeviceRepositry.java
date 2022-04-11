package com.example.springmongodbinit;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface reactiveDeviceRepositry extends ReactiveMongoRepository<device ,String> {
}
