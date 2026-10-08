package classes;

import java.time.LocalDate;

public class MelysegObjektum extends Egitest{

    private String csillagkepRovidites;
    private String tipus;

    private String csillagkepLatinNev;
    private String csillagkepMagyarNev;

    public MelysegObjektum(LocalDate megfigyelesDatuma, String egitestNeve, String deklinacio, String rektaszcenzio, String csillagkepRovidites, String tipus) {
        super(megfigyelesDatuma, egitestNeve, rektaszcenzio, deklinacio);
        this.csillagkepRovidites = csillagkepRovidites;
        this.tipus = tipus;
    }

    public String getCsillagkepRovidites() {
        return csillagkepRovidites;
    }

    public String getTipus() {
        return tipus;
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
}
