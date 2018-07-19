package com.news.framework.login;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.Fragment;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.news.framework.WebApi.ApiClient;
import com.news.framework.WebApi.ApiInterface;
import com.news.framework.model.movie.MoviesResponse;

import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


import static com.news.framework.Config.API_KEY;

public class LoginPresenter implements LoginInterafce.presenter {
    LoginInterafce.view fragment;
    LoginInterafce.model loginModel;

    LoginPresenter(LoginInterafce.view fragment) {

        this.fragment = fragment;
        loginModel = new LoginModel();
    }

    public void initializeView(){

    }

    public void manualLoginStatus(Context context, String username, String password) {

        loginModel.saveDatalocally(context, username, password);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<MoviesResponse> call = apiService.getNowPlayingMovies(API_KEY, "20");
        call.enqueue(new Callback<MoviesResponse>() {
            @Override
            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                System.out.println("response: " + response.body());
                fragment.loginStatus(response.toString());

            }

            @Override
            public void onFailure(Call<MoviesResponse> call, Throwable t) {

                fragment.loginStatus("failure");
            }
        });



    }

    public void facebookLoginStatus(LoginButton facebookLoginButton, final LoginInterafce.view fragment) {

        /*facebook login button*/
        CallbackManager callbackManager = CallbackManager.Factory.create();
        facebookLoginButton.setFragment((Fragment) fragment);
        // Callback registration
        facebookLoginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                System.out.println("successsssssssss");
                fragment.loginStatus("successssssssssss");
            }

            @Override
            public void onCancel() {
                fragment.loginStatus("cancel");
            }

            @Override
            public void onError(FacebookException exception) {
                fragment.loginStatus("error");
            }
        });

    }

    public void gmainLoginStatus() {

        fragment.loginStatus("success");
    }

}
