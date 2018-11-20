package com.acelabs.kambaapi.api;

import com.acelabs.kambaapi.model.Activity;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface Service {

    @GET("v1/users/activities")
    Call<ArrayList<Activity>> getActivities(@Header("Authorization") String auth);


}
