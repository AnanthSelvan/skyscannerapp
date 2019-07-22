package com.example.skyscanner.viewModel;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

import com.example.skyscanner.model.Example;
import com.example.skyscanner.service_layer.ServiceLayer;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class AppViewModel implements LifecycleObserver {

    ServiceLayer serviceLayer;
    ItemViewModel itemViewModel;

    @Inject
    public AppViewModel(ServiceLayer serviceLayer, ItemViewModel itemViewModel) {
        this.serviceLayer = serviceLayer;
        this.itemViewModel = itemViewModel;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void init() {
        serviceLayer.getFlightInfo("US","USD","en-US","SFO-sky","ORD-sky","2019-09-01")
                .subscribe(this::flightDetails,this::errorMessage);
    }

    public void flightDetails(Example example){
           itemViewModel.setAmount(String.valueOf(example.getQuotes().get(0).getMinPrice()));
           itemViewModel.setDirectFlight(example.getQuotes().get(0).getDirect());
    }

    public void errorMessage(Throwable throwable) {
        Log.e(TAG, "errorMessage: "+throwable.getLocalizedMessage());

    }
}
