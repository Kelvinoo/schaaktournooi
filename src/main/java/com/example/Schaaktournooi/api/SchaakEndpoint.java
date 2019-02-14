package com.example.Schaaktournooi.api;


import com.example.Schaaktournooi.controller.SchaakRepository;
import com.example.Schaaktournooi.model.Deelnemer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchaakEndpoint {


    @Autowired
    private SchaakRepository mijnSchaakRepository;

    @GetMapping("deelnemer")
    public Iterable<Deelnemer> toonAlleDeelnemers(){
        Iterable<Deelnemer> deelnemers = mijnSchaakRepository.findAll();
        return deelnemers;


    }

}
