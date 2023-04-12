package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Mobile;

public interface MobileService {

	List<Mobile> getAllByPage(Integer pageNumber, Integer pageSize);

	List<Mobile> getAllByPageJpql(Integer pageNumber, Integer pageSize);

	List<Mobile> getAllByPageNative(Integer pageNumber, Integer pageSize);

	

	

}
