package com.example.Schaaktournooi.controller;

import com.example.Schaaktournooi.model.Deelnemer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SchaakRepository extends CrudRepository<Deelnemer, Long> {


}