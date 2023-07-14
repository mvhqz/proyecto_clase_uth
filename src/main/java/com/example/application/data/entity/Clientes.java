package com.example.application.data.entity;

import jakarta.persistence.Entity;

@Entity
public class Clientes extends AbstractEntity {

    private Integer IdCliente;
    private String Nombre;
    private String Telefono;
    private String Direccion;
    private Integer Pedidos;
    
    
	public Integer getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(Integer idCliente) {
		IdCliente = idCliente;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public Integer getPedidos() {
		return Pedidos;
	}
	public void setPedidos(Integer pedidos) {
		Pedidos = pedidos;
	}


}
