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

    @GetMapping("deelnemer/{naam}")
    public Deelnemer nieuwDeelnemer (@PathVariable String naam){
        System.out.println("go");
        Deelnemer deDeelnemer = new Deelnemer();
        deDeelnemer.voornaam= naam;
        Deelnemer kelvin = mijnSchaakRepository.save(deDeelnemer);
        return kelvin;


    }

}
