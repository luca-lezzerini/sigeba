package com.iad.sigeba.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class MovimentoCC {

    private Long id;
    private Double importo;
    private LocalDate data;
    private LocalTime ora;
    private String causale;

    public MovimentoCC(Long Id, Double importo, LocalDate data, LocalTime ora, String causale) {
        this.id = id;
        this.importo = importo;
        this.data = data;
        this.ora = ora;
        this.causale = causale;
    }

    
    
    

    public long getId() {
        return id;
    }

    public void setId(long Id) {
        this.id = Id;
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
