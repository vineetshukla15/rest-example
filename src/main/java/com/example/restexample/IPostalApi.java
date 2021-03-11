package com.example.restexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


//@FeignClient (url ="http://api.geonames.org")
public interface IPostalApi {
	
	@GET("postalCodeLookupJSON")
    Call<PostalInfo> listAddresses(@Query("postalcode") String zip,
    									@Query("country") String cntryCd,
    									@Query("username") String uName);
	
}