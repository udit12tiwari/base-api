package tiwari.io.baseapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tiwari.io.baseapi.dto.DisplayNameResponse;

@RestController
@RequestMapping("/api")
public class DisplayNameController {

    @Value("${display.name:GitHub Copilot}")
    private String displayName;

    @GetMapping("/display-name")
    public ResponseEntity<DisplayNameResponse> getDisplayName() {
        return ResponseEntity.ok(new DisplayNameResponse(displayName));
    }
}
