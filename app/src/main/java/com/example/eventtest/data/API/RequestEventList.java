package com.example.eventtest.data.API;


import android.util.Log;

import com.example.eventtest.data.API.entity.ResponseData;
import com.example.eventtest.data.API.service.APIServiceConstructor;
import com.example.eventtest.data.API.service.APIServiceEvent;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RequestEventList {
    String result;

    void requestEventList() {

        APIServiceEvent service = APIServiceConstructor.CreateService(APIServiceEvent.class);
        Call<ResponseData> call = service.getDataEventCategories(
                APIConfig.LOCATION, APIConfig.ACTUAL_SINCE,
                APIConfig.ACTUAL_UNTIL, APIConfig.FIELDS_EVENT,
                APIConfig.PAGE_SIZE, APIConfig.CATEGORIES, APIConfig.LANG);


        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                if (response.body() != null) result = response.body().getEventData().toString();
                else result = "no data";

            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {

                Log.println(Log.ERROR, "ERR :  ", String.valueOf(t));
                result = "err";

            }
        });


    }

    @Override
    public String toString() {
        requestEventList();
//        return "RequestEventList{" +
//                "result='" + result + '\'' +
//                '}';
        return result;
    }
}
