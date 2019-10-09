package com.example.myapplication.network;

import com.example.myapplication.model.RetroPhoto;
import com.example.myapplication.model.RetroPokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();

    // @GET("/pokemon")
    // Call<List<RetroPokemon>> getAllPokemons();
}
