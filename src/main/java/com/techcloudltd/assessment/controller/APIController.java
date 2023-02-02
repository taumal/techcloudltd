package com.techcloudltd.assessment.controller;

import com.techcloudltd.assessment.model.JwtPayload;
import io.jsonwebtoken.Claims;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class APIController {

    @GetMapping("/get")
    public ResponseEntity<String> get(@RequestAttribute("claims") Claims claims) {
        System.out.println("Name: " + claims.get("name"));
        System.out.println("ID: " + claims.get("id"));
        System.out.println("Validated: " + claims.get("validated"));
        return ResponseEntity.ok("Book");
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<String>> getAll(@RequestAttribute("claims") Claims claims) {
        System.out.println("Name: " + claims.get("name"));
        System.out.println("ID: " + claims.get("id"));
        System.out.println("Validated: " + claims.get("validated"));
        return ResponseEntity.ok(Arrays.asList("Pen", "Book"));
    }
}
