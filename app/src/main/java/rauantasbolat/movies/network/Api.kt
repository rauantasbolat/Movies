package rauantasbolat.movies.network

import rauantasbolat.movies.model.GetMovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {


    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "e6efc89e28bec3fad0958851e031c0ea",
        @Query("page") page: Int
    ) : Call<GetMovieResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "e6efc89e28bec3fad0958851e031c0ea",
        @Query("page") page: Int
    ) : Call<GetMovieResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "e6efc89e28bec3fad0958851e031c0ea",
        @Query("page") page: Int
    ) : Call<GetMovieResponse>
}