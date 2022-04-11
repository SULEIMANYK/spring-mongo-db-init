package com.example.springmongodbinit;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Data;

@Data
public class device_info {
    private String desc ;
    private JSONPObject tiny ;

    public device_info(String desc, JSONPObject tiny) {
        this.desc = desc;
        this.tiny = tiny;
    }
}
