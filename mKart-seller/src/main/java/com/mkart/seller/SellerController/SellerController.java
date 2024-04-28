package com.mkart.seller.SellerController;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mkart.seller.SellerDTO.SellerDTO;
import com.mkart.seller.SellerEntity.SelllerEntity;
import com.mkart.seller.service.SellerService;

@RestController
@CrossOrigin
public class SellerController {
	@Autowired
	private SellerService service;
	
	@Autowired
	private ModelMapper mapper;
	
	@PostMapping("{SellerName}/addReview")
	public SellerDTO addReview(@PathVariable  String SellerName,@RequestBody SellerDTO SellDTO )
	{
		SellDTO.setSellerName(SellerName);
		SellerDTO sDTO = mapper.map(service.savedata(SellDTO), SellerDTO.class);
		return sDTO;
	}
	
	@GetMapping("{SellerName}/getReview")
	public List<SelllerEntity> fetchreview(@PathVariable String SellerName)
	{
		return service.fetchReview(SellerName);
	}

}
