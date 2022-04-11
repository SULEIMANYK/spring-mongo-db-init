package com.example.springmongodbinit;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
public class device {
    @Id
    private  String id ;
    private    String  name;
    private   String type ;
    private  String token ;
    private  String originator ;
    private device_info  device_info ;
 private  location   location ;
 private List<String>  protocols ;
 private LocalDateTime createdAt ;

    public device(String name, String type, String token, String originator, com.example.springmongodbinit.device_info device_info, com.example.springmongodbinit.location location, List<String> protocols, LocalDateTime createdAt) {
        this.name = name;
        this.type = type;
        this.token = token;
        this.originator = originator;
        this.device_info = device_info;
        this.location = location;
        this.protocols = protocols;
        this.createdAt = createdAt;
    }
}
