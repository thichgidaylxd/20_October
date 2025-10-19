package com.example.demo;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class controller {
    service ser;

    @GetMapping("/{integer}")
    public ResponseEntity<entity> get(@PathVariable Integer integer){
        return ResponseEntity.ok(ser.getById(integer));
    }

    @PostMapping
    public ResponseEntity<entity> post(@RequestBody entity entity){
        return ResponseEntity.ok(ser.create(entity));
    }
}
