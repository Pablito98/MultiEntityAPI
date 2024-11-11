package com.example.MultiEntityAPI.service;


import com.example.MultiEntityAPI.model.Prodotto;
import com.example.MultiEntityAPI.repository.ProdottoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProdottoService {

    @Autowired
    ProdottoRepository prodottoRepository;

    public List<Prodotto> recuperaProdotti() { return prodottoRepository.findAll(); }

    public Optional<Prodotto> recuperaProdottoDaId(Long id) {return prodottoRepository.findById(id);}

    public Prodotto salvaProdotto(Prodotto prodotto){return prodottoRepository.save(prodotto);}

    public void eliminaProdottoDaId(Long id){prodottoRepository.deleteById(id);}
}
