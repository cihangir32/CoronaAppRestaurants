package org.example.cihangir;

import org.example.cihangir.CoronaAppRestaurants.Gasten;
import org.example.cihangir.CoronaAppRestaurants.Restaurants;
import org.junit.jupiter.api.Test;

public class DiverseCoronaAppTests {

    @Test
    void testHappyItaly() {
        Restaurants restaurantHappyItaly = new Restaurants(0, "Happy Italy", 10);
        Restaurants restaurantMcDonalds = new Restaurants(1, "McDonalds", 5);
        Restaurants restaurantsShabuShabu = new Restaurants(2, "Shabu Shabu", 1);

        Gasten gast1 = new Gasten("Jeroen", "0612345678", "1234AB", 1);
        Gasten gast2 = new Gasten("Jan", "0698675456", "4321QW", 2);
        Gasten gast3 = new Gasten("Piet", "0645654321", "4567GF", 3);
        Gasten gast4 = new Gasten("Koen", "0645675432", "6532EQ", 4);
        Gasten gast5 = new Gasten("Henk", "0645454312", "6765GB", 5);

        if (Gasten.getAantalGastenBinnen() >= restaurantHappyItaly.getMaxAantalPersonenBinnen()) {

            System.out.println("Let op! Er is geen genoeg plek meer in het restaurant.");

        } else {
            System.out.println("Er is op dit moment genoeg plek in het restaurant. U kunt plaats nemen.");
        }
    }

    @Test
    void testMcDonalds() {
        Restaurants restaurantHappyItaly = new Restaurants(0, "Happy Italy", 10);
        Restaurants restaurantMcDonalds = new Restaurants(1, "McDonalds", 5);
        Restaurants restaurantsShabuShabu = new Restaurants(2, "Shabu Shabu", 1);

        Gasten gast1 = new Gasten("Jeroen", "0612345678", "1234AB", 1);
        Gasten gast2 = new Gasten("Jan", "0698675456", "4321QW", 2);
        Gasten gast3 = new Gasten("Piet", "0645654321", "4567GF", 3);
        Gasten gast4 = new Gasten("Koen", "0645675432", "6532EQ", 4);
        Gasten gast5 = new Gasten("Henk", "0645454312", "6765GB", 5);

        if (Gasten.getAantalGastenBinnen() == restaurantMcDonalds.getMaxAantalPersonenBinnen()) {
            System.out.println("Let op! Er is nog maar 1 plaats over in het restaurant.");

        } else if(Gasten.getAantalGastenBinnen() > restaurantMcDonalds.getMaxAantalPersonenBinnen()){
            System.out.println("Let op! Er is geen genoeg plek meer in het restaurant.");

        } else {
            System.out.println("Er is op dit moment genoeg plek in het restaurant. U kunt plaats nemen.");
        }
    }

    @Test
    void testShabuShabu() {
        Restaurants restaurantHappyItaly = new Restaurants(0, "Happy Italy", 10);
        Restaurants restaurantMcDonalds = new Restaurants(1, "McDonalds", 5);
        Restaurants restaurantsShabuShabu = new Restaurants(2, "Shabu Shabu", 1);

        Gasten gast1 = new Gasten("Jeroen", "0612345678", "1234AB", 1);
        Gasten gast2 = new Gasten("Jan", "0698675456", "4321QW", 2);
        Gasten gast3 = new Gasten("Piet", "0645654321", "4567GF", 3);
        Gasten gast4 = new Gasten("Koen", "0645675432", "6532EQ", 4);
        Gasten gast5 = new Gasten("Henk", "0645454312", "6765GB", 5);

        if (Gasten.getAantalGastenBinnen() == restaurantsShabuShabu.getMaxAantalPersonenBinnen()) {
            System.out.println("Let op! Er is nog maar 1 plaats over in het restaurant.");

        } else if(Gasten.getAantalGastenBinnen() > restaurantsShabuShabu.getMaxAantalPersonenBinnen()){
            System.out.println("Let op! Er is geen genoeg plek meer in het restaurant.");

        } else {
            System.out.println("Er is op dit moment genoeg plek in het restaurant. U kunt plaats nemen.");
        }
    }

}
