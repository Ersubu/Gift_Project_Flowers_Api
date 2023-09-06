/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2021-01-13 22:40:25
 * @modify date 2021-01-13 22:40:25
 * @desc [description]
 */
package com.dakr.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.dto.ProductInfoDto;
import com.dakr.dto.ProductInfoRequest;
import com.dakr.model.ProductCategory;
import com.dakr.model.ProductInfo;
import com.dakr.repository.ProductInfoRepository;
import com.dakr.util.ProductMapper;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

	@Autowired
	private ProductInfoRepository productInfoRepository;
	@Autowired
	private ProductCategoryService categoryService;
	
	
	
	@Override
	public ProductInfoDto add(ProductInfoRequest request) {
		
	ProductInfo info = ProductMapper.DtoToEntity(request);
	    ProductCategory category = categoryService.findById(request.getCategoryId());
		info.setProductCategory(category); 
     	return ProductMapper.EntityToDto(productInfoRepository.save(info));
	}
	@Override
	public List<ProductInfoDto> fetchAll() {
		return this.productInfoRepository.findAll().stream().map(p -> ProductMapper.EntityToDto(p))
				.collect(Collectors.toList());
	}

	@Override
	public List<ProductInfoDto> fetchByCategory(String category) {
		List<ProductInfo> products = productInfoRepository.findAll().stream()
				.filter(c -> c.getProductCategory().getCategoryName().equals(category)).collect(Collectors.toList());
//		if (products.size() == 0)
//			throw new CategoryNotFoundException("category", "Invalid category");
		return products.stream().map(p -> ProductMapper.EntityToDto(p)).collect(Collectors.toList());
	}

	@Override
	public ProductInfoDto fetchById(Long id) {
		ProductInfo info = productInfoRepository.findById(id).get();
				//.orElseThrow(() -> new ProductNotFoundException("product", "Not Found"));
		return ProductMapper.EntityToDto(productInfoRepository.save(info));
	}


	@Override
	public boolean removeProduct(Long productId) {
		this.productInfoRepository.deleteById(productId);
		return true;
	}

	@Override
	public ProductInfoDto update(ProductInfoRequest request) {
		productInfoRepository.findById(request.getProductId());
		ProductInfo info = ProductMapper.DtoToEntity(request);
		ProductCategory category = categoryService.findById(request.getCategoryId());
		info.setProductCategory(category);
		return ProductMapper.EntityToDto(productInfoRepository.save(info));
	}

	

}
