package com.example.MultiEntityAPI.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity 
@Table(name = "utenti")
public class Utente {


    @Id
    @Column(name = "idutenti")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private  String cognome;
    private String email;
    private Date dataNascita;

    public Utente(){}

    public Utente(String nome,String cognome,String email,Date dataNascita){
        this.nome=nome;
        this.cognome=cognome;
        this.email=email;
        this.dataNascita=dataNascita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }
}
