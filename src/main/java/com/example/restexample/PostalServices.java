package com.example.restexample;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

@Service
public class PostalServices {

	@Value("${retrofit.username:vinever}")
	private String uname;

	private IPostalApi postalapi;

	@Autowired
	Retrofit retrofit;

	@Autowired
	OkHttpClient okHttpClient;

	public void findPostalAddressAsync(String postalcode, String countryCode,
			final ICallbackHolder<PostalInfo> iCallbackHolder) throws IOException {

		postalapi = retrofit.create(IPostalApi.class);
		Call<PostalInfo> retrofitCall = postalapi.listAddresses(postalcode, countryCode, uname);
		retrofitCall.enqueue(new Callback<PostalInfo>() {
			@Override
			public void onResponse(Call<PostalInfo> call, Response<PostalInfo> response) {
				if (response.isSuccessful()) {
					iCallbackHolder.onSuccess(response.body());
				} else {
					iCallbackHolder.onError();
				}
			}

			@Override
			public void onFailure(Call<PostalInfo> call, Throwable t) {
				System.out.println(t.fillInStackTrace());

			}
		});

	}

	public PostalInfo findPostalAddress(String postalcode, String countryCode) throws IOException {
		
		postalapi = retrofit.create(IPostalApi.class);
		Call<PostalInfo> retrofitCall = postalapi.listAddresses(postalcode, countryCode, uname);
		Response<PostalInfo> response = retrofitCall.execute();
		return response.body();

	}

}
