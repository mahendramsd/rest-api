package com.msd.api;

import com.msd.api.domain.Person;
import com.msd.api.repository.PersonRepository;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication()
@ComponentScan("com.msd.api")
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class,args);


    }
}
