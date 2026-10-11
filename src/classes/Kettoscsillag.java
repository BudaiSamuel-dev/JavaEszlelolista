package classes;

import java.time.LocalDate;

public class Kettoscsillag extends Egitest{

    private String csillagKeprovidites;
    private String fenyesseg;

    public Kettoscsillag(LocalDate megfigyelesDatuma, String egitestNeve, String deklinacio, String rektaszcenzio, String csillagKeprovidites, String fenyesseg) {
        super(megfigyelesDatuma, egitestNeve, rektaszcenzio, deklinacio);
        this.csillagKeprovidites = csillagKeprovidites;
        this.fenyesseg = fenyesseg;
    }

    public String getCsillagKeprovidites() {
        return csillagKeprovidites;
    }

    public String getFenyesseg() {
        return fenyesseg;
    }
}
