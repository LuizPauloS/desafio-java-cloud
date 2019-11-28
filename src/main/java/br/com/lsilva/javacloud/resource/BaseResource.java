package br.com.lsilva.javacloud.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface BaseResource<T> {

    @GetMapping("/all")
    ResponseEntity<?> findAll();
    
    @PostMapping("/save")
    ResponseEntity<?> save(@RequestBody T t);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> delete(@PathVariable("id") Integer id);

    @GetMapping
    ResponseEntity<?> findById(@RequestParam Integer id);

    @PutMapping("/update")
    ResponseEntity<?> update(@RequestParam Integer id, @RequestBody T t);
}