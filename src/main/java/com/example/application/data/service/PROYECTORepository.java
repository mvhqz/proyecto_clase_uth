package com.example.application.data.service;

import com.example.application.data.entity.ResponseProductos;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface PROYECTORepository {
	@Headers({
	    "Content-Type: aplication/json",
	    "Accept-Charset: utf-8",
	    "User-Agent: Retrofit-Sample-App"
	})
	@GET("/pls/apex/uth23bd/PDE/productos/")
	Call<ResponseProductos> obtenerProductos();
	
	
	
	
}
