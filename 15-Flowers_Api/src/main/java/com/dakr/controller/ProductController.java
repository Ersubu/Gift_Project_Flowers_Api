/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2021-01-13 22:34:12
 * @modify date 2021-01-13 22:34:12
 * @desc [description]
 */
package com.dakr.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.dto.ProductInfoDto;
import com.dakr.dto.ProductInfoRequest;
import com.dakr.model.ProductInfo;
import com.dakr.service.ProductInfoService;


import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
@CrossOrigin
public class ProductController {

  @Autowired
  private final ProductInfoService productInfoService;
	 
  @PostMapping
	public ProductInfoDto add(@Valid @RequestBody ProductInfoRequest dto) {
		return productInfoService.add(dto);
	}
		
	 
	 

//  @GetMapping
//  public List<ProductInfoDto> fetchAllProducts() {
//    return productInfoService.fetchAll();
//  }
// @GetMapping("/category/{category}")
//  public List<ProductInfoDto> fetchByCategory(@PathVariable String category) {
//    return productInfoService.fetchByCategory(category);
//  }
//
//  @GetMapping("/{productId}")
//  public ProductInfoDto fetchById(@PathVariable Long productId) {
//    return productInfoService.fetchById(productId);
//  }
//
//
//
//  @DeleteMapping("/{productId}")
//  public boolean removeProduct(@PathVariable Long productId) {
//    return productInfoService.removeProduct(productId);
//  }
//
//  @PostMapping("/save")
//  public ProductInfoDto add(@Valid @RequestBody ProductInfoRequest dto) {
//    return productInfoService.add(dto);
//  }
//
//  @PutMapping
//  public ProductInfoDto update(@Valid @RequestBody ProductInfoRequest dto) {
//    return productInfoService.update(dto);
//  }

}
