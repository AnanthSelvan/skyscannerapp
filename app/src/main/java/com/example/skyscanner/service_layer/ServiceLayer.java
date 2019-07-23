package com.example.skyscanner.service_layer;

import com.example.skyscanner.model.Example;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServiceLayer {

@Headers({
      "X-RapidAPI-Key: 9dcafd6a6dmsh3e60e80f6becb4bp1fd4aejsnd7bfc9ab267f",
})

    @GET("browseroutes/v1.0/{country}/{currency}/{locale}/{originplace}/{destinationplace}/{outboundpartialdate}")
Observable<Example> getFlightInfo(@Path("country") String place,
                                  @Path("currency") String currency,
                                  @Path("locale") String locale,
                                  @Path("originplace") String origin,
                                  @Path("destinationplace") String destination,
                                  @Path("outboundpartialdate") String date);
}
