package com.example.MultiEntityAPI.controller;


import com.example.MultiEntityAPI.model.Prodotto;
import com.example.MultiEntityAPI.service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/prodotti")
public class ProdottoController {

    @Autowired
    private ProdottoService prodottoService;

    @GetMapping
    public List<Prodotto> recuperaProdotti(){
        return prodottoService.recuperaProdotti();
    }

    @GetMapping("/{id}")
    public Optional<Prodotto> recuperaProdottoDaId(Long id){
        return prodottoService.recuperaProdottoDaId(id);
    }

    @PostMapping
    public Prodotto salvaProdotto(@RequestBody Prodotto prodotto){
        return prodottoService.salvaProdotto(prodotto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminiProdotto(@PathVariable Long id){
        prodottoService.eliminaProdottoDaId(id);
        return ResponseEntity.noContent().build();
    }

}
