package org.example.cihangir.CoronaAppRestaurants;

public class Restaurants {
    private int id;
    private String naam;
    private int maxAantalPersonenBinnen;

    public Restaurants(int id, String naam, int maxAantalPersonenBinnen) {
        this.id = id;
        this.naam = naam;
        this.maxAantalPersonenBinnen = maxAantalPersonenBinnen;
    }



    // Getters en Setters

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

    public int getMaxAantalPersonenBinnen() {
        return maxAantalPersonenBinnen;
    }

    public void setMaxAantalPersonenBinnen(int maxAantalPersonenBinnen) {
        this.maxAantalPersonenBinnen = maxAantalPersonenBinnen;
    }
}
