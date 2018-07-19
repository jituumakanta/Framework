package com.news.framework.WebApi;

import com.news.framework.model.movie.MoviesResponse;
import com.news.framework.model.moviedetails.MovieDetailsResponse;
import com.news.framework.model.moviereleasedate.MovieReleaseDateResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/now_playing")
    Call<MoviesResponse> getNowPlayingMovies(@Query("api_key") String apiKey, @Query("page") String page);

    @GET("movie/latest")
    Call<MoviesResponse> getLatestMovies(@Query("api_key") String apiKey);

    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/upcoming")
    Call<MoviesResponse> getUpcomingMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MovieDetailsResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

    @GET("movie/{movie_id}/similar")
    Call<MovieDetailsResponse> getSimilarMovie(@Path("id") int id, @Query("api_key") String apiKey);

    @GET("movie/{movie_id}/release_datesr")
    Call<MovieReleaseDateResponse> getMovieReleaseDate(@Path("id") int id, @Query("api_key") String apiKey);
}
