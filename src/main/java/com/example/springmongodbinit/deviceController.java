package com.example.springmongodbinit;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.Disposable;

import java.util.List;

@RestController
@RequestMapping("api/v1/devices")
@AllArgsConstructor
public class deviceController {

    public deviceService deviceService;

    @GetMapping("/all")

    public List<device> getAlldevices() {

        return deviceService.getAllDevices();
    }

    @PostMapping("/add")
    public device addDevice(@RequestBody device deviceinput) {
        var deviceToAdd = new device(deviceinput.getName(), deviceinput.getType(), deviceinput.getToken()
            , deviceinput.getOriginator(), deviceinput.getDevice_info(), deviceinput.getLocation(), deviceinput.getProtocols(), deviceinput.getCreatedAt());
      return deviceService.addDevice(deviceToAdd).block();


    }


}
