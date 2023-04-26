package org.example;

import java.util.Date;

public class divida {
    private long montante;
    private Date tempo_limite;
    private long juros;
    private String nome;

    public divida(long montante, Date tempo_limite, long juros, String nome) {
        this.montante = montante;
        this.tempo_limite = tempo_limite;
        this.juros = juros;
        this.nome = nome;
    }

    public long getMontante() {
        return montante;
    }

    public void setMontante(long montante) {
        this.montante = montante;
    }

    public Date getTempo_limite() {
        return tempo_limite;
    }

    public void setTempo_limite(Date tempo_limite) {
        this.tempo_limite = tempo_limite;
    }

    public long getJuros() {
        return juros;
    }

    public void setJuros(long juros) {
        this.juros = juros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
