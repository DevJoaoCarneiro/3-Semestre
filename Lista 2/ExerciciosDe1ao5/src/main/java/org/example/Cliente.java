package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Cliente extends Pessoa{
    private LocalDate dataCadastro;

    public Cliente(String nome, int idade, LocalDate dataCadastro) {
        super(nome, idade);
        this.dataCadastro = dataCadastro;
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public int getTempoCadastro(){
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataCadastro,hoje);
        return periodo.getYears();
    }
}
