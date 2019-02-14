package com.example.Schaaktournooi.api;


import com.example.Schaaktournooi.controller.SchaakRepository;
import com.example.Schaaktournooi.model.Deelnemer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SchaakEndpoint {


    @Autowired
    private SchaakRepository mijnSchaakRepository;

    @GetMapping("/deelnemer")
    public Iterable<Deelnemer> toonAlleDeelnemers(){
        Iterable<Deelnemer> deelnemers = mijnSchaakRepository.findAll();
        return deelnemers;
    }

    @PostMapping("/deelnemer/add")
    public String addSchaker (@RequestBody Deelnemer deelnemer){
        mijnSchaakRepository.save(deelnemer);
        return "het is gelukt";
    }

    @GetMapping("/deelnemer/{id}")
    public Deelnemer getDeelnemerId(@PathVariable Long id){
        Optional<Deelnemer> deelnemer = mijnSchaakRepository.findById(id);
        return deelnemer.get();
    }

    @DeleteMapping("/deelnemer/{id}/delete")
    public void deleteDeelnemer (@PathVariable Long id){
        mijnSchaakRepository.deleteById(id);
        System.out.println("De deelnemer is verwijderd" + id);

    }

}
