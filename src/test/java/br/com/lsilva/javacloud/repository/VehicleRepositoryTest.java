//package br.com.lsilva.javacloud.repository;
//
//import static br.com.lsilva.javacloud.utils.UtilsTest.*;
//import java.util.List;
//import java.util.Optional;
//import javax.validation.ConstraintViolationException;
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import br.com.lsilva.javacloud.model.Vehicle;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class VehicleRepositoryTest {
//
//    @Autowired
//    private VehicleRepository repository;
//
//    @Test
//    public void shouldSaveNewVehicle() {
//        Vehicle vehicle = this.repository.save(buildVehicle());
//        Assertions.assertThat(vehicle.getId()).isNotNull();
//        Assertions.assertThat(vehicle.getName()).isEqualTo("Mercedes");
//        Assertions.assertThat(vehicle.getPlate()).isEqualTo("HSR1234");
//        Assertions.assertThat(vehicle.getDescription()).isNotBlank().isNotNull();
//    }
//
//    @Test(expected = ConstraintViolationException.class)
//    public void shouldExpectedExceptionConstraintSaveNewVehicle() {
//        Vehicle vehicle = Vehicle.builder().build();
//        this.repository.save(vehicle);
//    }
//
//    @Test
//    public void shouldFindAllVehicles() {
//        this.repository.saveAll(buildVehicles());
//        List<Vehicle> vehicles = this.repository.findAll();
//        Assertions.assertThat(vehicles.isEmpty()).isFalse();
//        Assertions.assertThat(vehicles.size()).isEqualTo(10);
//        this.repository.save(buildVehicle());
//        vehicles = this.repository.findAll();
//        Assertions.assertThat(vehicles.size()).isEqualTo(11);
//        Assertions.assertThat(vehicles.get(10).getId()).isEqualTo(11);
//    }
//
//    @Test
//    public void shouldFindVehicleById() {
//        Vehicle vehicle = this.repository.save(buildVehicle());
//        Assertions.assertThat(vehicle.getId()).isNotNull();
//        Optional<Vehicle> optional = this.repository.findById(vehicle.getId());
//        Assertions.assertThat(optional).isNotEmpty();
//        Assertions.assertThat(optional.get().getId()).isEqualTo(vehicle.getId());
//    }
//
//    @Test
//    public void shouldDeleteVehicle() {
//        Vehicle vehicle = this.repository.save(buildVehicle());
//        Assertions.assertThat(vehicle.getId()).isNotNull();
//        this.repository.delete(vehicle);
//        Optional<Vehicle> optional = this.repository.findById(vehicle.getId());
//        Assertions.assertThat(optional).isEmpty();
//    }
//}