package com.example.demo.Repositoty;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer>{
	
	//Pagination And Sorting using Customer finder Method
	public Page<Mobile> findByMobileModelContaining(String mobileModel,Pageable pageable);

	//Pagination And Sorting using Native Query
	@Query(value="Select * from mobile where price >= :price",
			countQuery="Select count(*) from mobile",
			nativeQuery=true)
	public Page<Mobile> findMobileByAccToPrice(@Param("price") int price,Pageable pageable);
	
	
	
}
