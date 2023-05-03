package ru.kiwutu.eventtest.data.API.service;


import ru.kiwutu.eventtest.data.API.entity.ResponseData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIServiceEvent {

    @GET("public-api/v1.4/events")
    Call<ResponseData> getDataEventCategories(@Query("location") String location,
                                              @Query("actual_since") String actual_since,
                                              @Query("actual_until") String actual_until,
                                              @Query("fields") String fields,
                                              @Query("page_size") String page_size,
                                              @Query("categories") String categories,
                                              @Query("lang") String lang);

}






















