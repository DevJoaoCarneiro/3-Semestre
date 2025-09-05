package org.example;

public class ResumoPessoa {
    private String nomeCompleto;
    private String faixaEtaria;

    public ResumoPessoa(String nomeCompleto, int idade) {
        this.nomeCompleto = nomeCompleto;
        this.faixaEtaria = definirFaixaEtaria(idade);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    private String definirFaixaEtaria(int idade){
        if(idade<18){
            return "Menor de idade";
        }else if(idade<=29){
            return "Jovem adulto";
        }else if(idade<=59){
            return "Adulto";
        }else {
            return "Idoso";
        }
    }

    @Override
    public String toString() {
        return "ResumoPessoa{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", faixaEtaria=" + faixaEtaria +
                '}';
    }
}
