package com.news.framework.register;

import com.news.framework.WebApi.ApiClient;
import com.news.framework.WebApi.ApiInterface;
import com.news.framework.login.LoginInterafce;
import com.news.framework.model.movie.MoviesResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.news.framework.Config.API_KEY;

public class RegisterPresenter implements RegisterInterface.presenter {
    RegisterInterface.view fragment;

    public RegisterPresenter(RegisterInterface.view fragment){
        this.fragment=fragment;
    }

    public void registerStatus(String name,String email,String phoneno,String password){

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<MoviesResponse> call = apiService.getNowPlayingMovies(API_KEY, "20");
        call.enqueue(new Callback<MoviesResponse>() {
            @Override
            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                System.out.println("response: " + response.body());
                fragment.registerStatus("register success");

            }

            @Override
            public void onFailure(Call<MoviesResponse> call, Throwable t) {

                fragment.registerStatus("register failure");
            }
        });


    }


}
