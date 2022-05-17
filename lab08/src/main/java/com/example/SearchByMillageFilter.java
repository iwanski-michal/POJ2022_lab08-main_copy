package com.example;

import java.util.ArrayList;
import java.util.List;

public class SearchByMillageFilter implements Filter {
    SearchSettings searchSettings;
    List<CarOffer> carOffers;

    @Override
    public void setSearchSettings(SearchSettings searchSettings) {
        this.searchSettings = searchSettings;
    }

    @Override
    public void setCarOffers(List<CarOffer> carOffers) {
        this.carOffers = carOffers;
    }

    @Override
    public boolean canFilter() {
        if (searchSettings.getMilleageFrom() != 0 || searchSettings.getMilleageTo() != 0){
            return true;
        }
        return false;
    }

    @Override
    public List<CarOffer> filter(SearchSettings searchSettings) {
        double to = this.searchSettings.getMilleageTo();
        double from = this.searchSettings.getMilleageFrom();
        List<CarOffer> filteredOffers = new ArrayList<>();
        if(to != 0){
//            System.out.println("TO");
            for (CarOffer offer : carOffers
            ) {
                if (offer.getMilleage() <= to) {
                    filteredOffers.add(offer);
//                    System.out.println(offer.getPrice());
                }
            }
        }
        if (from != 0){
//            System.out.println("from");
            filteredOffers.removeIf(offer -> offer.getMilleage() <= from);
        }
        //ciekwe, czy jest jakaś bardziej inteligenta opcja na printowanie listy sobie
//        for (CarOffer offer: filteredOffers
//             ) {
//            System.out.println(offer.getMilleage());
//        }
        return filteredOffers;
    }
}