package com.example;

import java.util.List;

interface Filter {
    void setSearchSettings(SearchSettings searchSettings);
    void setCarOffers(List<CarOffer> carOffers);
    boolean canFilter();
    List<CarOffer> filter();
}
