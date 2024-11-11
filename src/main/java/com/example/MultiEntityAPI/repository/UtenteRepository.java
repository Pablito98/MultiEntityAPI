package com.example.MultiEntityAPI.repository;

import com.example.MultiEntityAPI.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente,Long> {

}
