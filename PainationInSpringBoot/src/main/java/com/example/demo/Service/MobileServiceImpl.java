package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Mobile;
import com.example.demo.Repositoty.MobileRepository;


@Service
public class MobileServiceImpl implements MobileService {
	
    @Autowired
	private MobileRepository mobileRepository;

	@Override
	public List<Mobile> getAllByPage(Integer pageNumber, Integer pageSize) {
		Pageable p= PageRequest.of(pageNumber, pageSize);
		Page<Mobile> page = mobileRepository.findAll(p);
		return page.toList() ;
		
	}

	@Override
	public List<Mobile> getAllByPageJpql(Integer pageNumber, Integer pageSize) {
		Pageable p= PageRequest.of(pageNumber, pageSize);
		Page<Mobile> page = mobileRepository.getPageWithJpql(p);
		return page.toList() ;
		
	}

	@Override
	public List<Mobile> getAllByPageNative(Integer pageNumber, Integer pageSize) {
		Pageable p= PageRequest.of(pageNumber, pageSize);
		Page<Mobile> page = mobileRepository.getPageWithNative(p);
		return page.toList() ;
	}

	


}
