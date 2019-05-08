package com.uca.capas.domain;



import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Producto {
	
	@Size(message="La longitud debe tener un maximo de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String nombre;
	
	@Size(message="La longitud debe tener un maximo de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String marca;
	
	@Size(message="La longitud debe tener un maximo de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String descripcion;
	
	@Size(message="La longitud debe tener un maximo de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String categoria;
	
	@Positive(message="El precio debe ser mayor a '0'")
	@NotNull
	private BigDecimal precio;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotNull
	private Date fechaVencimiento;
	
	public Producto() {}

	public Producto(String nombre, String marca, String descripcion, String categoria, BigDecimal precio,
			Date fechaVencimiento) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
}
