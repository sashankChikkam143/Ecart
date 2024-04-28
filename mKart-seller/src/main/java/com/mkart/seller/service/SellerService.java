package com.mkart.seller.service;

import java.util.List;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkart.seller.Repository.SellerRepository;
import com.mkart.seller.SellerDTO.SellerDTO;
import com.mkart.seller.SellerEntity.SelllerEntity;

@Service
public class SellerService {
	@Autowired
	private SellerRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	
	
	public SelllerEntity savedata(SellerDTO sellDTO)
	{
		return repository.save(mapper.map(sellDTO, SelllerEntity.class));
	}
	public List<SelllerEntity> saveReviews(List<SelllerEntity> sentites)
	{
		return repository.saveAllAndFlush(sentites);
	}
	
	public List<SelllerEntity> fetchReviews()
	{
		return repository.findAll();
	}
	public List<SelllerEntity> fetchReview(String id)
	{
		return repository.findBySellerName(id);
		
	}

}
