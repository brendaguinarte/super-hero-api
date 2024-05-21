package br.com.guinartec.superheroapi.controller;

import br.com.guinartec.superheroapi.model.Superhero;
import br.com.guinartec.superheroapi.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/superhero")
public class SuperheroController {

    @Autowired
    SuperheroService superheroService;

    @GetMapping
    public ResponseEntity<List<Superhero>> getAllSuperheroes() {
        return ResponseEntity.ok(superheroService.getSuperhero());
    }
    @PostMapping
    public ResponseEntity<Superhero> postSuperhero(
            @RequestBody Superhero superhero
    ) {
        return ResponseEntity.ok(superheroService.postSuperhero(superhero));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteSuperhero(
            @PathVariable Long id
    ){
       superheroService.deleteSuperhero(id);
        return ResponseEntity.ok("Superhero with id " + id + " was successfully deleted");
    }
}
