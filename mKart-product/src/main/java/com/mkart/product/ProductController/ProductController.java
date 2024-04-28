package com.mkart.product.ProductController;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mkart.product.ProductDTO.ProductDTO;
import com.mkart.product.ProductEntity.ProductEntity;
import com.mkart.product.ProductService.ProductService;

@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@Autowired
	private ModelMapper mapper;
	
	@PostMapping("{ProductName}/addReview")
	public ProductDTO addReview(@PathVariable String ProductName,  @RequestBody ProductDTO pDTO)
	{
		pDTO.setProductName(ProductName);
		//System.out.print(ProductName);
		ProductDTO pdto = mapper.map(service.addReview(pDTO),ProductDTO.class);
		return pdto;
	}
	
	@GetMapping("{ProductName}/fetchReview")
	public List<ProductEntity> fetchReview(@PathVariable String ProductName)
	{
		return service.fetchReview(ProductName);
	}


}
