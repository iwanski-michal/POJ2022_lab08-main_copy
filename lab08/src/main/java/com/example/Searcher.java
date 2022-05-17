package com.example;
import java.util.ArrayList;
import java.util.List;

public class Searcher {
    private ArrayList<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filterToAdd){
        filters.add(filterToAdd);
    }

    public List<CarOffer> filter(List<CarOffer> cars, SearchSettings searchSettings) {
        List<CarOffer> filteredOffers = cars;
        for (Filter filter : filters
             ) {
            filter.setCarOffers(filteredOffers);
            if (filter.canFilter()){
                filteredOffers = filter.filter(searchSettings);
                for (CarOffer offer: filteredOffers
                     ) {
//                    System.out.println(offer.getTitle());
                }
//                System.out.println("__________");
            }
        }
    return filteredOffers;
    }
}
