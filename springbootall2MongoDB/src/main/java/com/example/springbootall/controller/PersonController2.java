package com.example.springbootall.controller;

import com.example.springbootall.pojo.Persons;
import com.example.springbootall.service.PersonService2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons2")
public class PersonController2 {

    @Autowired
    private PersonService2 personService;

    @GetMapping
    public List<Persons> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persons> getPersonById(@PathVariable String id) {
        Persons person = personService.getPersonById(id);
        if (person == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(person);
    }

    @PostMapping
    public ResponseEntity<Persons> createPerson(@RequestBody Persons person) {
        return ResponseEntity.ok(personService.createPerson(person));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Persons> updatePerson(@PathVariable String id, @RequestBody Persons personDetails) {
        Persons updatedPerson = personService.updatePerson(id, personDetails);
        if (updatedPerson == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedPerson);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable String id) {
        personService.deletePerson(id);
        return ResponseEntity.noContent().build();
    }
}
