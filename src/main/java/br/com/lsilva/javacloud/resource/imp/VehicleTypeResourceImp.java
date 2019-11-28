package br.com.lsilva.javacloud.resource.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.lsilva.javacloud.model.VehicleType;
import br.com.lsilva.javacloud.model.wrapper.ResponseWrapper;
import br.com.lsilva.javacloud.resource.BaseResource;
import br.com.lsilva.javacloud.service.imp.VehicleTypeServiceImp;

@RestController
@RequestMapping("vehicle-type")
public class VehicleTypeResourceImp implements BaseResource<VehicleType> {

    private VehicleTypeServiceImp service;

    @Autowired
    public VehicleTypeResourceImp(VehicleTypeServiceImp service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<?> findAll() {
        List<VehicleType> vehicleTypeList = this.service.findAll();
        if (vehicleTypeList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vehicleTypeList);
    }

    @Override
    public ResponseEntity<?> save(VehicleType vehicleType) {
        VehicleType newVehicleType = this.service.save(vehicleType);
        if (newVehicleType == null || newVehicleType.getId() == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(newVehicleType);
    }

    @Override
    public ResponseEntity<?> delete(Integer id) {
        if (!this.service.delete(id)) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(ResponseWrapper.builder()
            .message("Successfully deleted VehicleType!").build());
    }

    @Override
    public ResponseEntity<?> findById(Integer id) {
        Optional<VehicleType> optionalVehicleType = this.service.findById(id);
        if (!optionalVehicleType.isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(optionalVehicleType.get());
    }

    @Override
    public ResponseEntity<?> update(Integer id, VehicleType vehicleType) {
        VehicleType vehicleTypeUpdate = this.service.update(id, vehicleType);
        if (vehicleTypeUpdate == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(vehicleTypeUpdate);
    }
}