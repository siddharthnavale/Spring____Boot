package com.example.demo.Repositoty;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer>{
	
//JPQL Query
	
	@Query(" from Mobile m")
	public Page<Mobile> getPageWithJpql(Pageable pageable);
	
			
//Native Query
	@Query(value="select * from mobile",
			countQuery="select count(*) from mobile",
			nativeQuery=true)
	public Page<Mobile> getPageWithNative(Pageable pageable);

}
