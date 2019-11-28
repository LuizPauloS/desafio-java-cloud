package br.com.lsilva.javacloud.resource.imp;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.lsilva.javacloud.model.Vehicle;
import br.com.lsilva.javacloud.model.wrapper.ResponseWrapper;
import br.com.lsilva.javacloud.resource.BaseResource;
import br.com.lsilva.javacloud.service.imp.VehicleServiceImp;

@RestController
@RequestMapping("/vehicle")
public class VehicleResourceImp implements BaseResource<Vehicle> {

    private VehicleServiceImp service;

    @Autowired
    public VehicleResourceImp(VehicleServiceImp service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<?> findAll() {
        List<Vehicle> vehicles = this.service.findAll();
        if (vehicles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vehicles);
    }

    @Override
    public ResponseEntity<?> save(Vehicle vehicle) {
        Vehicle newVehicle = this.service.save(vehicle);
        if (newVehicle == null || newVehicle.getId() == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(newVehicle);
    }

    @Override
    public ResponseEntity<?> delete(Integer id) {
        if (!this.service.delete(id)) {
            return ResponseEntity.badRequest().build();   
        }
        return ResponseEntity.ok(ResponseWrapper.builder()
                .message("Successfully deleted Vehicle!").build());
    }

    @Override
    public ResponseEntity<?> findById(Integer id) {
        Optional<Vehicle> optionalVehicle = this.service.findById(id);
        if (!optionalVehicle.isPresent()) {
            return ResponseEntity.noContent().build();    
        }
        return ResponseEntity.ok(optionalVehicle.get());
    }

    @Override
    public ResponseEntity<?> update(Integer id, Vehicle vehicle) {
        Vehicle vehicleUpdate = this.service.update(id, vehicle);
        if (vehicleUpdate == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(vehicleUpdate);
    }

}