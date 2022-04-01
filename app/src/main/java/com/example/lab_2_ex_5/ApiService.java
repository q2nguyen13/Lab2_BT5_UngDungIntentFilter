package com.example.lab_2_ex_5;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

        import retrofit2.Call;
        import retrofit2.Retrofit;
        import retrofit2.converter.gson.GsonConverterFactory;
        import retrofit2.http.GET;
        import retrofit2.http.Body;
        import retrofit2.http.Multipart;
        import retrofit2.http.PUT;
        import retrofit2.http.Path;
        import retrofit2.http.POST;
        import retrofit2.http.Part;
        import retrofit2.http.Field;
        import retrofit2.http.Headers;
        import retrofit2.http.FormUrlEncoded;
        import retrofit2.http.Multipart;
        import retrofit2.http.Query;


public interface ApiService {




    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")

            .create();
    ApiService apiService = new Retrofit.Builder()
            .baseUrl("http://192.168.1.36:3000/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);



    @GET("api/image/{id}")
    Call<image> lay_url(@Path("id") int id);



}


