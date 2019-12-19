package br.com.lsilva.javacloud.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Name is required")
    private String name;
    @NotEmpty(message = "Description is required")
    private String description;
    @NotEmpty(message = "Plate is required")
    private String plate;
    @ManyToOne
    private VehicleType vehicleType; 
}