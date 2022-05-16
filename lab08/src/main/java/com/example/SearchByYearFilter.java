package com.example;

import java.util.ArrayList;
import java.util.List;

public class SearchByYearFilter {
    SearchSettings searchSettings;
    List<CarOffer> carOffers;

    public com.example.SearchSettings getSearchSettings() {
        return searchSettings;
    }

    public void setSearchSettings(SearchSettings searchSettings) {
        this.searchSettings = searchSettings;
    }

    public List<CarOffer> getCarOffers() {
        return carOffers;
    }

    public void setCarOffers(List<CarOffer> carOffers) {
        this.carOffers = carOffers;
    }

    public boolean canFilter() {
//        System.out.println(searchSettings.getYearFrom() + "____" + searchSettings.getYearTo());

       if (searchSettings.getYearFrom() != 0 || searchSettings.getYearTo() != 0){
           return true;
       }
       return false;
    }

    public List<CarOffer> filter() {
        int to = searchSettings.getYearTo();
        int from =searchSettings.getYearFrom();
        List<CarOffer> filteredOffers = new ArrayList<>();
        if(to != 0){
            for (CarOffer offer : carOffers
            ) {
                if (offer.getYear() <= to) {
                    filteredOffers.add(offer);
                }
            }
        }else if (from != 0){
            for (CarOffer offer : carOffers
            ) {
                if (offer.getYear() >= from) {
                    filteredOffers.add(offer);
                }
            }
        }else{
            for (CarOffer offer : carOffers
            ) {
                if (offer.getYear() >= from && offer.getYear() <= to) {
                    filteredOffers.add(offer);
                }
            }
        }
        return filteredOffers;
    }
}


