package com.example.MultiEntityAPI.service;


import com.example.MultiEntityAPI.model.Utente;
import com.example.MultiEntityAPI.repository.UtenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public List<Utente> recuperaUtenti() { return utenteRepository.findAll(); }

    public Optional<Utente> recuperaUtenteDaId(Long id){return utenteRepository.findById(id);}

    public Utente salvaUtente(Utente utente) { return utenteRepository.save(utente); }

    public void eliminaUtenteDaId(Long id) { utenteRepository.deleteById(id); }
}
