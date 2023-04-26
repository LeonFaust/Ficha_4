package org.example;

import java.util.Date;

public class Gasto {
    private long montante;
    private Date data;

    public Gasto(long montante) {
        java.util.Date date = new java.util.Date();
        this.montante = montante;
        this.data = date;
    }

    public long getMontante() {
        return montante;
    }

    public Date getData() {
        return data;
    }

    public void setMontante(long montante) {
        this.montante = montante;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
