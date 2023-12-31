package com.dakr.util;

import com.dakr.dto.ProductInfoDto;
import com.dakr.dto.ProductInfoRequest;
import com.dakr.model.ProductInfo;

public class ProductMapper {
	
	public static ProductInfo DtoToEntity(ProductInfoRequest request) {
		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductId(request.getProductId());
		productInfo.setProductName(request.getProductName());
		productInfo.setProductPrice(request.getProductPrice());
	//	productInfo.setProductStock(Integer.valueOf(request.getProductStock()));
		productInfo.setProductDescription(request.getProductDescription());
		productInfo.setProductIcon(request.getProductIcon());
	//	productInfo.setProductStatus(ProductStatus.valueOf(request.getProductStatus()));
		productInfo.setDiscountPercent(request.getDiscountPercent());
		
		return productInfo;
	}
	
//	public static ProductInfo stockDtoToEntity(StockDto stockDto) {
//		ProductInfo productInfo = new ProductInfo();
//		productInfo.setProductId(stockDto.getProductId());
//		productInfo.setProductStock(stockDto.getQuantity());
////		productInfo.setProductName(productInfo.getProductName());
////		productInfo.setProductDescription(productInfo.getProductDescription());
////		productInfo.setProductIcon(productInfo.getProductIcon());
////		productInfo.setProductPrice(productInfo.getProductPrice());
////		productInfo.setProductStatus(productInfo.getProductStatus());
////		productInfo.setProductCategory(productInfo.getProductCategory());
//		return productInfo;
//	}

	public static ProductInfoDto EntityToDto(ProductInfo info) {
		return ProductInfoDto.builder()
			.categoryId(info.getProductCategory().getCategoryId())
			.categoryName(info.getProductCategory().getCategoryName())
			.categoryImageUrl(info.getProductCategory().getCategoryImageUrl())
			.productDescription(info.getProductDescription())
			.productIcon(info.getProductIcon())
			.productPrice(info.getProductPrice())
			//.productStock(info.getProductStock())
		    //.productStatus(info.getProductStatus())
			.productName(info.getProductName())
			.productId(info.getProductId())
			.discountPercent(info.getDiscountPercent())
			.build();
	  }

}
