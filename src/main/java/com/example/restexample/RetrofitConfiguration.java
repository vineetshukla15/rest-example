package com.example.restexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zeroows on 02/10/16.
 */
@Configuration
public class RetrofitConfiguration {


    @Value("${postal.verify.url:http://api.geonames.org/}")
    private String url;

    @Bean
    @Autowired
    public Retrofit retrofit(OkHttpClient client, Gson gson) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit;
    }

    @Bean
    public OkHttpClient client() {
        final OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        final OkHttpClient builtClient = okHttpClientBuilder.addInterceptor(loggingInterceptor).build();

        return builtClient;
    }

    @Bean
    public Gson gson() {
        return new GsonBuilder().setLenient().create();
    }
}