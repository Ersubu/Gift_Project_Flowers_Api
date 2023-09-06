/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2021-01-13 20:07:44
 * @modify date 2021-01-13 20:07:44
 * @desc [description]
 */
package com.dakr.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.model.ProductInfo;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo, Long> {

	//List<ProductInfo> fetchProductByCategory(String category);

	List<ProductInfo> findByProductNameContainingIgnoreCase(String name);

	ProductInfo save(Optional<ProductInfo> info);
}
