package com.example.skyscanner.viewModel;

import javax.inject.Inject;

public class ItemViewModel {

    public String source;
    public String destination;
    public String date;
    public String amount;
    public String DirectFlight;
    public String price;
    public String time;

    public String getDirectFlight() {
        return DirectFlight;
    }

    public void setDirectFlight(String directFlight) {
        DirectFlight = directFlight;
    }


    @Inject
    public ItemViewModel() {
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
