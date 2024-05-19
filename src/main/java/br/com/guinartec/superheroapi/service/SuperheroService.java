package br.com.guinartec.superheroapi.service;

import br.com.guinartec.superheroapi.model.Superhero;
import br.com.guinartec.superheroapi.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroService {

    @Autowired
    private SuperheroRepository superheroRepository;
    public List<Superhero> getSuperhero(){
        return superheroRepository.findAll();
    }
}
