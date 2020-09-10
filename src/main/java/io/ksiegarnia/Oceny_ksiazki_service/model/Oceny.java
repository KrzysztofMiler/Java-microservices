package io.ksiegarnia.Oceny_ksiazki_service.model;

public class Oceny {
    private int ocena;
    private String ksiazkaID;

    public Oceny(int ocena, String ksiazkaID) {
        this.ocena = ocena;
        this.ksiazkaID = ksiazkaID;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getKsiazkaID() {
        return ksiazkaID;
    }

    public void setKsiazkaID(String ksiazkaID) {
        this.ksiazkaID = ksiazkaID;
    }
}
