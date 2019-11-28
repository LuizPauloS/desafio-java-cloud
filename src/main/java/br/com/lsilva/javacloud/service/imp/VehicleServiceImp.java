package br.com.lsilva.javacloud.service.imp;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.lsilva.javacloud.exception.BadRequestException;
import br.com.lsilva.javacloud.model.Vehicle;
import br.com.lsilva.javacloud.repository.VehicleRepository;
import br.com.lsilva.javacloud.service.BaseService;

@Service
public class VehicleServiceImp implements BaseService<Vehicle> {

    private VehicleRepository repository;

    @Autowired
    public VehicleServiceImp(VehicleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return this.repository.save(vehicle);
    }

    @Override
    public Vehicle update(Integer id, Vehicle vehicle) {
        Optional<Vehicle> optionalVehicle = this.repository.findById(id);
        if (optionalVehicle.isPresent() && optionalVehicle.get().getId().equals(id)) {
            vehicle.setId(optionalVehicle.get().getId());
            return this.repository.save(vehicle);
        }
        throw new BadRequestException("Error update Vehicle!");
    }

    @Override
    public List<Vehicle> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Vehicle> findById(Integer id) {
        return this.repository.findById(id);
    }

    @Override
    public Boolean delete(Integer id) {
        Optional<Vehicle> optionalVehicle = this.repository.findById(id);
        if (optionalVehicle.isPresent()) {
            this.repository.delete(optionalVehicle.get());
            return true;
        }
        return false;
    }
    
}