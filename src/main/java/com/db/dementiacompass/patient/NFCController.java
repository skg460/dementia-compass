package com.db.dementiacompass.patient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NFCController {

    @GetMapping("/getnfc")
    public ResponseEntity<String> getNfcLocation() {
        return new ResponseEntity<>("NFC-URL", HttpStatus.OK);
    }

}
