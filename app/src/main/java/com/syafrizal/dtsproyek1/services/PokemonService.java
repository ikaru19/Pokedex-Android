package com.syafrizal.dtsproyek1.services;

import com.syafrizal.dtsproyek1.models.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PokemonService {

    @GET("/ikaru19/pokefit/pokemons")
    Call<List<Pokemon>> getPokemons();

    @POST("/ikaru19/pokefit/pokemons")
    Call<Pokemon> addPokemon(@Body Pokemon pokemon);

    @DELETE("/ikaru19/pokefit/pokemons/{id}")
    Call<Pokemon> deletePokemon(@Path("id") int id);
}
