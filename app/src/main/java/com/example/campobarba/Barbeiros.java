package com.example.campobarba;

public class Barbeiros {

    private String nome;

    public static final Barbeiros[] barbeiros = {
            new Barbeiros("Leonardo - Especialista em Barba"),
            new Barbeiros("Pedro - Especialista em Cabelo"),
            new Barbeiros("Mathias - Especialista em Cabelo e Barba")
    };

    private Barbeiros(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
