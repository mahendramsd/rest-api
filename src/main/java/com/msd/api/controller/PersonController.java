package com.msd.api.controller;

import com.msd.api.domain.Person;
import com.msd.api.model.PersonVo;
import com.msd.api.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
@RequestMapping("/person")
@Api(value = "Person Controller", description = "Used for get person endpoints")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Person Add endpoint", response = ResponseEntity.class)
    public ResponseEntity<Person> addPerson(@RequestBody PersonVo personVo) {
        return new ResponseEntity<>(personService.addPerson(personVo),HttpStatus.OK) ;
    }

    @GetMapping("/view")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Person view endpoint", response = ResponseEntity.class)
    public List<Person> viewPerson() {
        return personService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Person delete endpoint", response = Person.class)
    public ResponseEntity deletePerson(@PathVariable Integer id) {
        personService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/view/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Person view edit endpoint", response = Person.class)
    public ResponseEntity<Person> viewEditPerson(@PathVariable Integer id) {
        return new ResponseEntity<Person>(personService.findPerson(id),HttpStatus.OK);
    }


}
