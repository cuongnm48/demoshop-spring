package com.demoshop.dto;

public class ProductImageDTO extends AbstractDTO<ProductImageDTO> {

	private Long productId;

	private String name;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
