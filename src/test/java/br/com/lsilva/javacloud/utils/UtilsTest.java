package br.com.lsilva.javacloud.utils;

import java.util.ArrayList;
import java.util.List;
import br.com.lsilva.javacloud.model.Vehicle;

public class UtilsTest {

    private static final String NAME_VEHICLE = "Mercedes";
    private static final String PLATE_VEHICLE = "HSR1234";
    private static final String DESCRIPTION_VEHICLE = "2019";

    public static Vehicle buildVehicle() {
        return Vehicle.builder()
                    .name(NAME_VEHICLE)
                    .plate(PLATE_VEHICLE)
                    .description(DESCRIPTION_VEHICLE)
                    .build();
    }

    public static List<Vehicle> buildVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Vehicle vehicle = buildVehicle();
            vehicles.add(updateValuesVehicle(vehicle, i));
        }
        return vehicles;
    }

    public static Vehicle updateValuesVehicle(Vehicle vehicle, int i) {
        vehicle.setName(vehicle.getName().concat(" - " + String.valueOf(i)));
        vehicle.setPlate(vehicle.getPlate().concat(" - " +String.valueOf(i)));
        vehicle.setDescription(vehicle.getDescription().concat(" - " + String.valueOf(i)));
        return vehicle;
    }
}