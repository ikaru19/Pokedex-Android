package com.syafrizal.dtsproyek1.services;


import com.syafrizal.dtsproyek1.models.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ItemService {

    @GET("/ikaru19/pokefit/items")
    Call<List<Item>> getItems();

    @POST("/ikaru19/pokefit/items")
    Call<Item> addItem(@Body Item item);

    // TODO: Delete Calory
    @DELETE("/ikaru19/pokefit/items/{id}")
    Call<Item> deleteItem(@Path("id") int id);
}
