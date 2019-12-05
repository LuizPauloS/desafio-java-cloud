package br.com.lsilva.javacloud.utils;

import br.com.lsilva.javacloud.model.Vehicle;

public class UtilsTest {

    public static Vehicle buildVehicle() {
        return Vehicle.builder()
                    .name("GOL G5")
                    .plate("HTV1234")
                    .description("v8 2011")  
                    .build();
    }
}