package io.ksiegarnia.Katalog_ksiazki_service.models;

public class KatalogItem { //definicje modelu
    private String name;

    public KatalogItem(String name, String opis, int ocena) {
        this.name = name;
        this.opis = opis;
        this.ocena = ocena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    private String opis;
    private int ocena;


}
