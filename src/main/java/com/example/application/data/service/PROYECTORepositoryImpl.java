package com.example.application.data.service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

import com.example.application.data.entity.ResponseProductos;

public class PROYECTORepositoryImpl {

	private static PROYECTORepositoryImpl instance;
	private RepositoryClient client;
	
	private PROYECTORepositoryImpl(String url, Long timeout) {
		
		this.client = new RepositoryClient(url, timeout);
		
	}
	
	public static PROYECTORepositoryImpl getInstance(String url, Long timeout) {
		if(instance == null){
			synchronized(PROYECTORepositoryImpl.class) {
				if(instance == null){
					instance = new PROYECTORepositoryImpl(url, timeout);
				}
			}
		}
		return instance;
	}
	
	public ResponseProductos getProductos() throws IOException {
		Call<ResponseProductos> call = client.getDatabaseService().obtenerProductos();
		Response<ResponseProductos> response = call.execute();
		if(response.isSuccessful()) {
			return response.body();
		}else {
			return null;
		}
	}
	
}
