package fr.wcs.demoApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.wcs.demoApi.entity.Wilder;
import fr.wcs.demoApi.repository.WilderRepository;

@RestController
public class WilderController {

    @Autowired
    WilderRepository wilderRepo;

    // create
    @RequestMapping("/create")
    public Wilder creatWilder(String name, String email, String category) {
        Wilder wilder = new Wilder(name, email, category);
        return wilderRepo.save(wilder);
    }

    
    @RequestMapping("/read")
    public Wilder getWilder(Long wilderId) {
        return wilderRepo.findById(wilderId).get();
    }

    @RequestMapping("/readall")
    public List<Wilder> getAllWilders() {
        return wilderRepo.findAll();
    }

    @RequestMapping("/getByName")
    public Wilder getWilderByName(String name) {
        return wilderRepo.findByName(name);
    }

    @RequestMapping("/getByEmail")
    public List<Wilder> getWilderByEmail(String email) {
        return wilderRepo.findByEmailContaining(email);
    }
}