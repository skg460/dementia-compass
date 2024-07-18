package com.db.dementiacompass.nfc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NFCController {

    private String location;

    @GetMapping("/notification1")
    public String getNfcLocation() {
        System.out.println("API called : " + location);
        return location;
    }

    @GetMapping("/notification")
    public String setNfcLocation(@RequestParam String message) {
        location = message;
        return "Location changed : " + message;
    }

}
