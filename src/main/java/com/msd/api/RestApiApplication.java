package com.msd.api;

import com.msd.api.domain.Person;
import com.msd.api.repository.PersonRepository;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.Arrays;

@ServletComponentScan
@SpringBootApplication()
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class,args);


    }
}
