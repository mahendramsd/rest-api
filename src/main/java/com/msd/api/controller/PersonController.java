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
    @ApiOperation(value = "Person Add endpoint", response = PersonVo.class)
    public Person addPerson(@RequestBody PersonVo personVo) {
        return personService.addPerson(personVo);
    }

    @GetMapping("/view")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Person view endpoint", response = Person.class)
    public List<Person> viewPerson() {
        return personService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Person delete endpoint", response = Person.class)
    public ResponseEntity<Integer> deletePerson(@PathVariable Integer id) {
        Boolean isDelete = personService.delete(id);
        if (!isDelete) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @GetMapping("/view/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Person view edit endpoint", response = Person.class)
    public Person viewEditPerson(@PathVariable Integer id) {
        return personService.findPerson(id);
    }


}
