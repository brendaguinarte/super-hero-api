package br.com.guinartec.superheroapi.controller;

import br.com.guinartec.superheroapi.model.Superhero;
import br.com.guinartec.superheroapi.repository.SuperheroRepository;
import br.com.guinartec.superheroapi.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class SuperheroController {

    @Autowired
    SuperheroService superheroService;
    @GetMapping
    public ResponseEntity<List<Superhero>> getAllSuperheroes() {
        List<Superhero> superheroes = superheroService.getSuperhero();
        return ResponseEntity.ok(superheroes);
    }


}
