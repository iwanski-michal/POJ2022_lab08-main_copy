package com.example;

import java.time.LocalDate;

public class SearchSettings {
    LocalDate DateFrom = null;
    LocalDate DateTo = null;
    int MilleageFrom;
    int MilleageTo;
    double PriceFrom;
    double PriceTo;
    String Word;
    int YearFrom = 0;
    int YearTo = 0;

    public LocalDate getDateFrom() {
        return DateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        DateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return DateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        DateTo = dateTo;
    }

    public int getMilleageFrom() {
        return MilleageFrom;
    }

    public void setMilleageFrom(int milleageFrom) {
        MilleageFrom = milleageFrom;
    }

    public int getMilleageTo() {
        return MilleageTo;
    }

    public void setMilleageTo(int milleageTo) {
        MilleageTo = milleageTo;
    }

    public double getPriceFrom() {
        return PriceFrom;
    }

    public void setPriceFrom(double priceFrom) {
        PriceFrom = priceFrom;
    }

    public double getPriceTo() {
        return PriceTo;
    }

    public void setPriceTo(double priceTo) {
        PriceTo = priceTo;
    }

    public String getWord() {
        return Word;
    }

    public void setWord(String word) {
        Word = word;
    }

    public int getYearFrom() {
        return YearFrom;
    }

    public void setYearFrom(int yearFrom) {
        YearFrom = yearFrom;
    }

    public int getYearTo() {
        return YearTo;
    }

    public void setYearTo(int yearTo) {
        YearTo = yearTo;
    }
}
