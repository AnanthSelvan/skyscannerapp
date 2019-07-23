package com.example.skyscanner.model;

import com.google.gson.annotations.SerializedName;

public class Quote {


    @SerializedName("QuoteId")
    private Integer quoteId;

    @SerializedName("MinPrice")
    private Integer minPrice;

    @SerializedName("Direct")
    private Boolean direct;

    @SerializedName("OutboundLeg")
    private OutBoundLeg outboundLeg;

    @SerializedName("QuoteDateTime")
    private String quoteDateTime;

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Boolean getDirect() {
        return direct;
    }

    public void setDirect(Boolean direct) {
        this.direct = direct;
    }

    public String getQuoteDateTime() {
        return quoteDateTime;
    }

    public void setQuoteDateTime(String quoteDateTime) {
        this.quoteDateTime = quoteDateTime;
    }

}
