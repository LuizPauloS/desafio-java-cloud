package br.com.lsilva.javacloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.lsilva.javacloud.model.VehicleType;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}