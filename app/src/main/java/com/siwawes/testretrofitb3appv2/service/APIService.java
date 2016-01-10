package com.siwawes.testretrofitb3appv2.service;

import com.siwawes.testretrofitb3appv2.model.Message;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Siwawes on 10/1/2559.
 */
public interface APIService {

    @GET("http://128.199.208.34/open.note/messages.php")
    Call<Message[]> loadMessages();
}
