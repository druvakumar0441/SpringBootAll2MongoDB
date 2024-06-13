package com.example.springbootall.service;

import com.example.springbootall.pojo.Persons;
import com.example.springbootall.repo.PersonRepository2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService2 {

    @Autowired
    private PersonRepository2 personRepository;

    public List<Persons> getAllPersons() {
        return personRepository.findAll();
    }

    public Persons getPersonById(String id) {
        return personRepository.findById(id).orElse(null);
    }

    public Persons createPerson(Persons person) {
        return personRepository.save(person);
    }

    public Persons updatePerson(String id, Persons personDetails) {
        Persons person = personRepository.findById(id).orElse(null);
        if (person != null) {
            person.setPname(personDetails.getPname());
            person.setPaddress(personDetails.getPaddress());
            person.setPqualification(personDetails.getPqualification());
            person.setPmobileNumber(personDetails.getPmobileNumber());
            person.setPpancard(personDetails.getPpancard());
            person.setPgmail(personDetails.getPgmail());
            return personRepository.save(person);
        }
        return null;
    }

    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }
}
