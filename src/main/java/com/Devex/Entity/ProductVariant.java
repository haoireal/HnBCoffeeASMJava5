package com.Devex.Entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_Variant")
public class ProductVariant implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "Quantity")
	private int quantity;
	@Column(name = "Price")
	private Double price;
	@Column(name = "PriceSale")
	private Double priceSale;
	
	@ManyToOne
	@JoinColumn(name = "Product_ID")
	private Product productVariant;
	
	@ManyToOne
	@JoinColumn(name = "Size_ID")
	private Size size;
	
	@ManyToOne
	@JoinColumn(name = "Color_ID")
	private Color color;
	
	@OneToMany(mappedBy = "productVariant")
	private List<OrderDetails> orderDetails;
	

}
