package com.example.springmongodbinit;

import lombok.Data;

@Data
public class location {
    private  long lat ;
    private  long lng ;

    public location(long lat, long lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
