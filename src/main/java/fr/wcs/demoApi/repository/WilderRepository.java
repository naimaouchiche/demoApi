package fr.wcs.demoApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.wcs.demoApi.entity.Wilder;

@Repository
public interface WilderRepository extends JpaRepository<Wilder, Long> {

    public Wilder findByName(String name);
    List<Wilder> findByEmailContaining(String email);
    
}