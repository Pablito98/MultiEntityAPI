package com.example.MultiEntityAPI.controller;

import com.example.MultiEntityAPI.model.Utente;
import com.example.MultiEntityAPI.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utenti")
public class UtenteController {

@Autowired
private UtenteService utenteService;

@GetMapping
    public List<Utente> recuperaUtenti(){
    return utenteService.recuperaUtenti();
}

@GetMapping("/{id}")
    public ResponseEntity<Utente> recuperaUtenteDaId(@PathVariable Long id){
    return utenteService.recuperaUtenteDaId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
}

    @PostMapping
    public Utente salvaUtente(@RequestBody Utente utente) {
        return utenteService.salvaUtente(utente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminaUtente(@PathVariable Long id) {
        utenteService.eliminaUtenteDaId(id);
        return ResponseEntity.noContent().build();
    }


}
