package com.example.demo.Repositoty;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer>{
	
// Derived Methods
	
	public List<Mobile> findByPriceLessThan(int price);
	
	public List<Mobile> findByHardDiskGreaterThan(int hardDisk);
	
	public List<Mobile> findByMobileModelContaining(String mobileModel);
	
	
	
//JPQL Query
	
	@Query("from Mobile m where m.price=:p And m.hardDisk=:h ")
	public List<Mobile> findMobileBypriceAndhardDisk(@Param ("p") int price,
			@Param ("h") int hardDisk);
	
	@Query("from Mobile")
	public List<Mobile> getAll(Sort sort);
	
//Native Query
	
	@Query(value="select * from mobile where ram >=:r", nativeQuery=true)
	public List<Mobile> findByRam(@Param ("r") int ram);
	
	
			


}
