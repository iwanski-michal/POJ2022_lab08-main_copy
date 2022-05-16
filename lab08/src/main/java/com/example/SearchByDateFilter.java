package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SearchByDateFilter implements Filter {
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
        if (searchSettings.getDateFrom() != null || searchSettings.getDateTo() != null) {
            return true;
        }
        return false;
    }

    @Override
    public List<CarOffer> filter() {
        LocalDate dateFrom = searchSettings.getDateFrom();
        List<CarOffer> filteredOffers = new ArrayList<>();
        for (CarOffer offer:carOffers
             ) {
            if (offer.getDate().isAfter(dateFrom)){
                filteredOffers.add(offer);
            }
        }
        //ciekwe, czy jest jakaś bardziej inteligenta opcja na printowanie listy
//        for (CarOffer offer: filteredOffers
//             ) {
//            System.out.println(offer.getDate());
//        }
        return filteredOffers;
    }
}
