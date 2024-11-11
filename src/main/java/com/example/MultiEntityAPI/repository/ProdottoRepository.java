package com.example.MultiEntityAPI.repository;

import com.example.MultiEntityAPI.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdottoRepository extends JpaRepository<Prodotto,Long> {

}
