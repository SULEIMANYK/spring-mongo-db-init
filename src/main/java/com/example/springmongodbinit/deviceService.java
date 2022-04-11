package com.example.springmongodbinit;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
@AllArgsConstructor
@Service
public class deviceService {

    public   final  deviceRepostry deviceRepostry;
    public   final  reactiveDeviceRepositry reactiveDeviceRepositry;
    public  List<device> getAllDevices() {
        return deviceRepostry.findAll();
    }

    public Mono<device> addDevice (device device){
        return  this.reactiveDeviceRepositry.insert(device);
    }


}
