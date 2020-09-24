package org.example.cihangir.CoronaAppRestaurants;

public class Gasten {
    private int id;
    private String naam;
    private String telefoonnummer;
    private String postcode;
    private int huisnummer;

    private static int aantalGastenBinnen;

    public Gasten(String naam, String telefoonnummer, String postcode, int huisnummer) {
        this.id = id;
        this.naam = naam;
        this.telefoonnummer = telefoonnummer;
        this.postcode = postcode;
        this.huisnummer = huisnummer;
        aantalGastenBinnen++;
    }




    // Getters en Setters


    public static int getAantalGastenBinnen() {
        return Gasten.aantalGastenBinnen;
    }



    public static void setAantalGastenBinnen(int aantalGastenBinnen) {
        Gasten.aantalGastenBinnen = aantalGastenBinnen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }
}
