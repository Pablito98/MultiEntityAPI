package com.example.MultiEntityAPI.model;
import jakarta.persistence.*;

@Entity
@Table(name = "prodotti")
public class Prodotto {
@Id
@Column(name = "idprodotti")
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private    String nome;
    private  String tipoProdotto;
    private Float prezzo;
    private  int valutazione;
    private String descrizione;


    public Prodotto(){}

    public Prodotto(String nome, String tipoProdotto,Float prezzo,int valutazione,String descrizione){
        this.nome=nome;
        this.tipoProdotto=tipoProdotto;
        this.prezzo=prezzo;
        this.valutazione=valutazione;
        this.descrizione=descrizione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getValutazione() {
        return valutazione;
    }

    public void setValutazione(int valutazione) {
        this.valutazione = valutazione;
    }

    public Float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Float prezzo) {
        this.prezzo = prezzo;
    }

    public String getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(String tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
