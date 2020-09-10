package io.ksiegarnia.Informacje_ksiazki_service.models;

public class Ksiazka {
    private String ksiazkaId;

    public Ksiazka(String ksiazkaId, String nazwa) {
        this.ksiazkaId = ksiazkaId;
        this.nazwa = nazwa;
    }

    public String getKsiazkaId() {
        return ksiazkaId;
    }

    public void setKsiazkaId(String ksiazkaId) {
        this.ksiazkaId = ksiazkaId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    private String nazwa;

}
