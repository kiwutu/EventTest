package ru.kiwutu.eventtest.data.API.service;


import ru.kiwutu.eventtest.data.API.entity.descriptionFields.Place;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIServicePlace {

    @GET("public-api/v1.4/places")
    Call<Place> getDataPlaceEvent(@Query("location") String location,
                                  @Query("fields") String fields,
                                  @Query("page_size") String page_size);

}






















