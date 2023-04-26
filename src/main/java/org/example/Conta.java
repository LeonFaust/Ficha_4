package org.example;

public class Conta {
    private long balanco;
    private String nome_pessoa;
    private String nome_Conta;

    public Conta(long balanco, String nome_pessoa, String nome_Conta) {
        this.balanco = balanco;
        this.nome_pessoa = nome_pessoa;
        this.nome_Conta = nome_Conta;
    }

    public long getBalanco() {
        return balanco;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public String getNome_Conta() {
        return nome_Conta;
    }

    public void setBalanco(long balanco) {
        this.balanco = balanco;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public void setNome_Conta(String nome_Conta) {
        this.nome_Conta = nome_Conta;
    }
}
