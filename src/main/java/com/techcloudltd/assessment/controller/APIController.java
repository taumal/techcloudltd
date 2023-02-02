package com.techcloudltd.assessment.controller;

import com.techcloudltd.assessment.model.JwtPayload;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class APIController {

    @GetMapping("/get")
    public ResponseEntity<String> get(@AuthenticationPrincipal JwtPayload jwtPayload) {
        System.out.println("JWT Payload: " + jwtPayload);
        return ResponseEntity.ok("Book");
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<String>> getAll(@AuthenticationPrincipal JwtPayload jwtPayload) {
        System.out.println("JWT Payload: " + jwtPayload);
        return ResponseEntity.ok(Arrays.asList("Pen", "Book"));
    }
}
