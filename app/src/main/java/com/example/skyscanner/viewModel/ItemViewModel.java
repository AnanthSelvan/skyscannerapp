package com.example.skyscanner.viewModel;

import javax.inject.Inject;

public class ItemViewModel {
    public String amount;
    public boolean isDirectFlight;
    @Inject
    public ItemViewModel() {
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public boolean isDirectFlight() {
        return isDirectFlight;
    }

    public void setDirectFlight(boolean directFlight) {
        isDirectFlight = directFlight;
    }
}
