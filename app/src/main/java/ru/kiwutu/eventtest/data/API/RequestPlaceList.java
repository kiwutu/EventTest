package ru.kiwutu.eventtest.data.API;


import android.util.Log;

import ru.kiwutu.eventtest.data.API.entity.descriptionFields.Place;
import ru.kiwutu.eventtest.data.API.service.APIServiceConstructor;
import ru.kiwutu.eventtest.data.API.service.APIServicePlace;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RequestPlaceList {
     String result;
    void requestEventList(){
        APIServicePlace service = APIServiceConstructor.CreateService(APIServicePlace.class);
        Call<Place> call =service.getDataPlaceEvent(
                APIConfig.LOCATION,
                APIConfig.FIELDS_PLACE, String.valueOf(1));


        call.enqueue(new Callback<Place>() {
            @Override
            public void onResponse(Call<Place> call, Response<Place> response) {
                if (response.body()!=null) result= response.body().getResults().toString();
                else {
                    result="no data";
                }
            }

            @Override
            public void onFailure(Call<Place> call, Throwable t) {

                Log.println(Log.ERROR,"ERR :  ", String.valueOf(t));
                result="err";

            }
        });


    }

    @Override
    public String toString() {
        requestEventList();
        return result;
    }
}
