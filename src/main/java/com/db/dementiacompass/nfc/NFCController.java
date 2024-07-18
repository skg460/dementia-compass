package com.db.dementiacompass.nfc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NFCController {

    private final NfcLocation nfcLocation;

    NFCController() {
        nfcLocation = new NfcLocation();
        nfcLocation.setShowNotification(false);
        nfcLocation.setMessage(null);
    }

    @GetMapping("/notification1")
    public ResponseEntity<NfcLocation> getNfcLocation() {
        return new ResponseEntity<>(nfcLocation, HttpStatus.OK);
    }

    @PostMapping("/notification1")
    public String setNfcLocation(@RequestParam boolean showNotification,
                               @RequestParam String message) {
        nfcLocation.setShowNotification(showNotification);
        nfcLocation.setMessage(message);
        return "Location changed : " + message;
    }

}
