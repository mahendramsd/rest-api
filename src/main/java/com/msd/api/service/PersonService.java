package com.msd.api.service;

import com.msd.api.domain.Person;
import com.msd.api.exception.CustomException;
import com.msd.api.model.PersonVo;
import com.msd.api.repository.PersonRepository;
import com.msd.api.util.CustomErrorCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    /**
     * Find all person
     * @return
     */
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    /**
     * delete person
     * @param id
     * @return
     */
    public Boolean delete(Integer id) {
        Optional<Person> person = personRepository.findById(id);
        if(person.isPresent()) {
            personRepository.deleteById(id);
            return true;
        } else  {
            throw new CustomException(CustomErrorCodes.PERSON_NOT_FOUND);
        }
    }

    /**
     * Save or update Person details
     * @param personVo
     * @return
     */
    public Person addPerson(PersonVo personVo) {
        Person person = null;
        if(personVo.getId() > 0) {
            Optional<Person> personEx = personRepository.findById(personVo.getId());
            if(personEx.isPresent()) {
                person = personEx.get();
            } else  {
                throw new CustomException(CustomErrorCodes.PERSON_NOT_FOUND);
            }
        } else  {
            // New Person Create
             person = new Person();
        }
        person.setFirstName(personVo.getFirstName());
        person.setLastName(personVo.getLastName());
        person.setAge(personVo.getAge());
        person.setFavouriteColor(personVo.getFavouriteColor());
        person.setHobby(personVo.getHobby());
        return personRepository.save(person);
    }

    /**
     * Find Person by id
     * @param id
     * @return
     */
    public Person findPerson(Integer id) {
        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            return  person.get();
        } else {
            throw new CustomException(CustomErrorCodes.PERSON_NOT_FOUND);
        }
    }
}
