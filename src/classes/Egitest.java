package classes;

import java.time.LocalDate;

public class Egitest {

    protected LocalDate megfigyelesDatuma;
    protected String egitestNeve;
    protected String rektaszcenzio;
    protected String deklinacio;

    public Egitest(LocalDate megfigyelesDatuma, String egitestNeve, String rektaszcenzio, String deklinacio) {
        this.megfigyelesDatuma = megfigyelesDatuma;
        this.egitestNeve = egitestNeve;
        this.deklinacio = deklinacio;
        this.rektaszcenzio = rektaszcenzio;
    }

    public LocalDate getMegfigyelesDatuma() {
        return megfigyelesDatuma;
    }

    public String getEgitestNeve() {
        return egitestNeve;
    }

    public String getRektaszcenzio() {
        return rektaszcenzio;
    }

    public String getDeklinacio() {
        return deklinacio;
    }
}
