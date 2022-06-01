package com.iad.sigeba.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class MovimentoCC {

    private Long Id;
    private Double importo;
    private LocalDate data;
    private LocalTime ora;
    private String causale;

    public MovimentoCC(long Id, double importo, LocalDate data, LocalTime ora, String causale) {
        this.Id = Id;
        this.importo = importo;
        this.data = data;
        this.ora = ora;
        this.causale = causale;
    }
    
    

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public String getCausale() {
        return causale;
    }

    public void setCausale(String causale) {
        this.causale = causale;
    }
}
