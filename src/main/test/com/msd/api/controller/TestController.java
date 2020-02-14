package com.msd.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.msd.api.domain.Person;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
@RequestMapping({ "/persons" })
public class TestController {

	private List<Person> personList = createList();

	@GetMapping(produces = "application/json")
	public List<Person> firstPage() {
		return personList;
	}

	@DeleteMapping(path = { "/{id}" })
	public Person delete(@PathVariable("id") long id) {
		Person personDe = null;
		for (Person person : personList) {
			if (person.getId() == id) {
				personList.remove(person);
				personDe = person;
				break;
			}
		}
		return personDe;
	}

	@PostMapping
	public Person create(@RequestBody Person person) {
		personList.add(person);
		return person;
	}

	private static List<Person> createList() {
		List<Person> personList = new ArrayList<>();
		Person person = new Person();
		person.setFirstName("Mahendra");
		person.setLastName("Sri");
		person.setAge("29");
		person.setFavouriteColor("RED");
		person.setHobby("TV-MUSIC");


		Person person1 = new Person();
		person1.setFirstName("Kamal");
		person1.setLastName("Sri");
		person1.setAge("29");
		person1.setFavouriteColor("BLUE");
		person1.setHobby("TV-TRAVELING");

		personList.add(person);
		personList.add(person1);
		return personList;
	}

}