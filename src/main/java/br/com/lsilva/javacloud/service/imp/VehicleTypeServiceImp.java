package br.com.lsilva.javacloud.service.imp;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lsilva.javacloud.exception.BadRequestException;
import br.com.lsilva.javacloud.model.VehicleType;
import br.com.lsilva.javacloud.repository.VehicleTypeRepository;
import br.com.lsilva.javacloud.service.BaseService;

@Service
public class VehicleTypeServiceImp implements BaseService<VehicleType> {

    private VehicleTypeRepository repository;

    @Autowired
    public VehicleTypeServiceImp(VehicleTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public VehicleType save(VehicleType vehicleType) {
        return this.repository.save(vehicleType);
    }

    @Override
    public List<VehicleType> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Boolean delete(Integer id) {
        Optional<VehicleType> optionalVehicleType = this.repository.findById(id);
        if (optionalVehicleType.isPresent()) {
            this.repository.delete(optionalVehicleType.get());
            return true;
        }
        return false;
    }

    @Override
    public VehicleType update(Integer id, VehicleType vehicleType) {
        Optional<VehicleType> optionalVehicleType = this.repository.findById(id);
        if (optionalVehicleType.isPresent() && optionalVehicleType.get().getId().equals(id)) {
            vehicleType.setId(optionalVehicleType.get().getId());
            return this.repository.save(vehicleType);
        }
        throw new BadRequestException("Error update VehicleType!");
    }

    @Override
    public Optional<VehicleType> findById(Integer id) {
        return this.repository.findById(id);
    }
}