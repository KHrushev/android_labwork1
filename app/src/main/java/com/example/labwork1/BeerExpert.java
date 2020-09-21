package com.example.labwork1;

public class BeerExpert {

    public String getBrands(String beerColor) {
        switch (beerColor) {
            case "light":
                return "Bell's, Marz";
            case "amber":
                return "Tripel, Pure Brewery";
            case "brown":
                return "Forsen, Bajs";
            case "dark":
                return "Yoshikage, Kira";
        }

        return "No brands found";
    }

}
