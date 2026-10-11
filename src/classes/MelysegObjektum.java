package classes;

import java.time.LocalDate;

public class MelysegObjektum extends Egitest{

    private double fenyesseg;
    private String csillagkepRovidites;
    private String tipus;

    private String csillagkepLatinNev;
    private String csillagkepMagyarNev;

    public MelysegObjektum(LocalDate megfigyelesDatuma, String egitestNeve, String deklinacio, String rektaszcenzio, double fenyesseg, String csillagkepRovidites, String tipus) {
        super(megfigyelesDatuma, egitestNeve, rektaszcenzio, deklinacio);
        this.fenyesseg = fenyesseg;
        this.csillagkepRovidites = csillagkepRovidites;
        this.tipus = tipus;
    }

    public String getCsillagkepRovidites() {
        return csillagkepRovidites;
    }

    public String getTipus() {
        return tipus;
    }

    public double getFenyesseg() {
        return fenyesseg;
    }

    public String getCsillagkepLatinNev() {
        return csillagkepLatinNev;
    }

    public void setCsillagkepLatinNev(String csillagkepLatinNev) {
        this.csillagkepLatinNev = csillagkepLatinNev;
    }

    public String getCsillagkepMagyarNev() {
        return csillagkepMagyarNev;
    }

    public void setCsillagkepMagyarNev(String csillagkepMagyarNev) {
        this.csillagkepMagyarNev = csillagkepMagyarNev;
    }

    public String getCsillagkep(){
        return String.format("%s (%s / %s)", csillagkepRovidites, csillagkepLatinNev, csillagkepMagyarNev);
    }
}
