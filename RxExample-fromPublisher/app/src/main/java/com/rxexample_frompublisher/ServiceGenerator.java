package com.rxexample_frompublisher;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private static Retrofit retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create()).build();

    private static RequestApi requestApi = retrofitBuilder.create(RequestApi.class);

    public static RequestApi getRequestApi () {
        return requestApi;
    }
}
