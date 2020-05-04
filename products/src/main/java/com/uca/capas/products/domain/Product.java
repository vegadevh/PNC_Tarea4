package com.uca.capas.products.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	
	@NotNull
	@Size(min=12, max=12, message="El id del producto debe tener exactamente 12 caracteres")
	private String id;
	@NotNull
	@Size(min=1, max=100, message="El nombre del producto debe tener un maximo de 100 caractares")
	private String name;
	@NotNull
	@Size(min=1, max=100, message="El nombre del producto debe tener un maximo de 100 caractares")
	private String brand;
	@NotNull
	@Size(min=1, max=500, message="El nombre del producto debe tener 500 caractares")
	private String desc;
	@NotNull
	@Digits(integer=10, fraction=0, message="No puede ingresar numeros decimales")
	private Integer stock;
	@NotNull
	@Pattern(regexp="^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", message = "La fecha debe tener formato dia/mes/año")
	private String dateIn;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String id, String name, String brand, String desc, Integer stock, @NotNull @Pattern(regexp = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", message = "La fecha debe tener formato dia/mes/año") String dateIn) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.desc = desc;
		this.stock = stock;
		this.dateIn = dateIn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public @NotNull @Pattern(regexp = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", message = "La fecha debe tener formato dia/mes/año") String getDateIn() {
		return dateIn;
	}

	public void setDateIn(@NotNull @Pattern(regexp = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", message = "La fecha debe tener formato dia/mes/año") String dateIn) {
		this.dateIn = dateIn;
	}
	
}
