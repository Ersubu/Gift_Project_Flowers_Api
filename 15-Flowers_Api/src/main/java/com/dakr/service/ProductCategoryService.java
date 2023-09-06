
 
package com.dakr.service;

import java.util.List;

import com.dakr.model.ProductCategory;



public interface ProductCategoryService {

  List<ProductCategory> fetchAllCategories();

  ProductCategory createCategory(ProductCategory productCategory);

  ProductCategory findById(Long id);

}
