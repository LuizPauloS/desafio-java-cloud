package br.com.lsilva.javacloud.resource;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.lsilva.javacloud.model.wrapper.ResponseWrapper;

public interface BaseResource<T> {

    ResponseEntity<List<T>> findAll();
    
    ResponseEntity<T> save(@RequestBody T t);

    ResponseEntity<T> findById(@RequestParam Integer id);

    ResponseEntity<T> update(@RequestParam Integer id, @RequestBody T t);

    ResponseEntity<ResponseWrapper> delete(@PathVariable("id") Integer id);
}