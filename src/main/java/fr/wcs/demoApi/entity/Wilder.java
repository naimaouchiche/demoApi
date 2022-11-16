package fr.wcs.demoApi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wilder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String name;
    public String email;
    public String category;
    public Wilder(String name, String email, String category) {
        this.name = name;
        this.email = email;
        this.category = category;
    }

}