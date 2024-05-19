package br.com.guinartec.superheroapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Superhero {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ElementCollection
    private List<String> power;
    private String secretIdentity;
    private Long age;
    private String origin;
    private String counter;
    private String rival;
    private String creativeCompany;
}



