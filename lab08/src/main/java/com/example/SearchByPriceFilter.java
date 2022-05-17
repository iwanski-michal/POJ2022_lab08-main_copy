package com.example;

import java.util.ArrayList;
import java.util.List;

public class SearchByPriceFilter implements Filter {

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
        if (searchSettings.getPriceFrom() != 0 || searchSettings.getPriceTo() != 0){
            return true;
        }
        return false;

    }

    @Override
    public List<CarOffer> filter(SearchSettings searchSettings) {
        double to = this.searchSettings.getPriceTo();
        double from = this.searchSettings.getPriceFrom();
        List<CarOffer> filteredOffers = new ArrayList<>();
        if(to != 0){
//            System.out.println("TO");
            for (CarOffer offer : carOffers
            ) {
                if (offer.getPrice() <= to) {
                    filteredOffers.add(offer);
//                    System.out.println(offer.getPrice());
                }
            }
        }
        if (from != 0){
//            System.out.println("from");
            filteredOffers.removeIf(offer -> offer.getPrice() <= from);
        }
        return filteredOffers;
    }
}