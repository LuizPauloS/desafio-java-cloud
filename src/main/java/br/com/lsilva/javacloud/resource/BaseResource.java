package br.com.lsilva.javacloud.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface BaseResource<T> {

    ResponseEntity<?> findAll();
    
    ResponseEntity<?> save(@RequestBody T t);

    ResponseEntity<?> delete(@RequestParam Integer id);

    ResponseEntity<?> findById(@RequestParam Integer id);

    ResponseEntity<?> update(@RequestParam Integer id, @RequestBody T t);
}