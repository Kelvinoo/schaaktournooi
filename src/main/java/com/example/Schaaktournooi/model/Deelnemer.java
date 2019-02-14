package com.example.Schaaktournooi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deelnemer {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    long id;

    public String voornaam;
    public String achternaam;
    public String tussenvoegsel;
    public int geboortedatum;
    public int gewonnenPartijen;
    public int remises;
    public int verlorenPartijen;


}
