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

    public double getFenyessegElteres(){
        double fenyesseg1 = Double.parseDouble(fenyesseg.split("/")[0].trim());
        double fenyesseg2 = Double.parseDouble(fenyesseg.split("/")[1].trim());

        return fenyesseg2 > fenyesseg1 ? (fenyesseg2 - fenyesseg1) : (fenyesseg1 - fenyesseg2);
    }
}
