
package com.dakr.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.dakr.dto.ProductInfoDto;
import com.dakr.dto.ProductInfoRequest;

public interface ProductInfoService {

  public List<ProductInfoDto> fetchAll();

  public List<ProductInfoDto> fetchByCategory(String category);

  public ProductInfoDto fetchById(Long id);

  //public List<ProductInfoDto> fetchByName(String name);

 
 public boolean removeProduct(Long productId);

  public ProductInfoDto add(ProductInfoRequest productInfoDto);

  public ProductInfoDto update(ProductInfoRequest productInfoDto);

  //Page<ProductInfoDto> fetchProductPages(Integer pageNo, Integer pageSize, String sortBy, String direction);

}
