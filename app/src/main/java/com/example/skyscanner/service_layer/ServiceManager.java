package com.example.skyscanner.service_layer;

import com.example.skyscanner.model.Example;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class ServiceManager {

    ServiceLayer serviceLayer;

    @Inject
    public ServiceManager(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    public Observable<Example> getFlightInformation ( String place,
                                                      String currency,
                                                      String locale,
                                                     String origin,
                                                     String destination,
                                                      String date)
    {
        return serviceLayer.getFlightInfo(place,currency,locale,origin,destination,date).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
