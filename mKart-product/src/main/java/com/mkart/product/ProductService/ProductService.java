package com.mkart.product.ProductService;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkart.product.ProductDTO.ProductDTO;
import com.mkart.product.ProductEntity.ProductEntity;
import com.mkart.product.ProductRepository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private ProductRepository repository;
	
	
	public ProductEntity addReview(ProductDTO PDTO)
	{
		return repository.save(mapper.map(PDTO, ProductEntity.class));
	}
	public List<ProductEntity> fetchReview(String name)
	{
		System.out.print(repository.findByProductName(name));
		return repository.findByProductName(name);
	}

}
