package com.dakr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.model.ProductCategory;
import com.dakr.repository.ProductCategoryRepository;


@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryRepository productcategoryrepository;

	@Override
	public List<ProductCategory> fetchAllCategories() {
		return productcategoryrepository.findAll();
	}

	@Override
	public ProductCategory createCategory(ProductCategory productCategory) {
		return productcategoryrepository.save(productCategory);
	}

	@Override
	public ProductCategory findById(Long id) {
		return productcategoryrepository.findById(id).get();
			}



}
