package br.com.lsilva.javacloud.repository;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.lsilva.javacloud.model.Vehicle;
import br.com.lsilva.javacloud.utils.UtilsTest;

@RunWith(SpringRunner.class)
@DataJpaTest
public class VehicleRepositoryTest {

    @Autowired
    private VehicleRepository repository;

    @Test
    public void deveSalvarNovoVeiculo() {
        Vehicle vehicle = this.repository.save(UtilsTest.buildVehicle());
        Assertions.assertThat(vehicle.getId()).isNotNull();
    }
}