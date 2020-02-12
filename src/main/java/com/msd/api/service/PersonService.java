package com.msd.api.service;

import com.msd.api.model.PersonVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    public List<PersonVo> findAll() {
        return null;
    }

    public Boolean delete(Integer id) {
        return true;
    }
}
