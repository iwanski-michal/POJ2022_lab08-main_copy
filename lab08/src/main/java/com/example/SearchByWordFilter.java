package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchByWordFilter implements Filter {
    SearchSettings searchSettings;
    List<CarOffer> carOffers;


    public void setSearchSettings(SearchSettings searchSettings) {
        this.searchSettings = searchSettings;
    }

    @Override
    public void setCarOffers(List<CarOffer> carOffers) {
        this.carOffers = carOffers;
    }

    @Override
    public boolean canFilter() {

        if(searchSettings.getWord() != null && !searchSettings.getWord().isEmpty()){
//            System.out.println("mozna filtrowac");
            return true;
        }
        return false;
    }

    @Override
    public List<CarOffer> filter() {
        String wordToFind = searchSettings.getWord();
//        System.out.println(wordToFind);
        List<CarOffer> filteredOffers = new ArrayList<>();
        for (CarOffer offer: carOffers
             ) {
            if (offer.getTitle().contains(wordToFind)){
//                System.out.println(offer.getTitle());
                filteredOffers.add(offer);
            }
        }

        return filteredOffers;
    }
}
