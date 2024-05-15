package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.aot.generate.GeneratedTypeReference;

@Entity

@Table(name = "DatosVehiculo")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "La matrícula no pueded estar vacía")
    @Length(min = 7, max = 7, message = "La matricula debe tener mínimo 7 letras")
    private  String matricula;
    private String marca;
    private String modelo;
    private String propietario;
    
}
