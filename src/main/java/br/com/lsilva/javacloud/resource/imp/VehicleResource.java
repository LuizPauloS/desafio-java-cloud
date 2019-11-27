package br.com.lsilva.javacloud.resource.imp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.lsilva.javacloud.model.Vehicle;
import br.com.lsilva.javacloud.resource.BaseResource;

@RestController
@RequestMapping("/vehicles")
public class VehicleResource implements BaseResource<Vehicle> {

    @Override
    public ResponseEntity<?> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<?> save(Vehicle t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<?> delete(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<?> findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<?> update(Integer id, Vehicle t) {
        // TODO Auto-generated method stub
        return null;
    }

}