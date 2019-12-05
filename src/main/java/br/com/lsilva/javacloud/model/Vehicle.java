package br.com.lsilva.javacloud.model;

import java.io.Serializable;
import javax.persistence.*;
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
    private String name;
    private String description;
    private String plate;
    @ManyToOne
    private VehicleType vehicleType; 
}