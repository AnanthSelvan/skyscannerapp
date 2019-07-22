package com.example.skyscanner.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {
    @SerializedName("Quotes")
    private List<Quote> quotes = null;
    @SerializedName("Places")
    private List<Place> places = null;

    @SerializedName("Carriers")
    private List<Carrier> carriers = null;
    @SerializedName("Currencies")
    private List<Currency> currencies = null;

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public List<Carrier> getCarriers() {
        return carriers;
    }

    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

}
