package com.mkart.product.ProductRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mkart.product.ProductEntity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,String> {

	@Query("select RR from ProductEntity RR where RR.ProductName=?1")
	List<ProductEntity> findByProductName(@Param("ProductName")String name);

}
