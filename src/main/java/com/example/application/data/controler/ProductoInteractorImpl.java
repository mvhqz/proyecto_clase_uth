package com.example.application.data.controler;

import java.io.IOException;

import com.example.application.data.entity.ResponseProductos;
import com.example.application.data.service.PROYECTORepositoryImpl;
import com.example.application.views.productos.ProductosViewModel;

public class ProductoInteractorImpl implements ProductosInteractor {

		
		private PROYECTORepositoryImpl modelo;
		private ProductosViewModel vista;
		
		public ProductoInteractorImpl(ProductosViewModel vista) {
		super();
		this.modelo = PROYECTORepositoryImpl.getInstance("https://apex.oracle.com/", 60000L);
			this.vista = vista;
		}
	


		@Override
		public void consultarProducto() {
			try {
				ResponseProductos respuesta = this.modelo.getProductos();
				this.vista.refrescarGridEmpleados(respuesta.getItems());
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
}
