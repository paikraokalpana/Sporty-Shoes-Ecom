package com.sporty.shoes.dao;



import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sporty.shoes.ShoesModel.ShoesDataModel;



//@Repository
//public interface ShoesDao extends CrudRepository<ShoesDataModel, Integer> {

	
	 
	@Repository
	public interface ShoesDao extends CrudRepository<ShoesDataModel, Integer> {

		  @Query("from ShoesDataModel where categeory=:categeory")
		    public Iterable<ShoesDataModel> findByCategory(int categeory);
		  
		 
		  @Query("from ShoesDataModel where id=:seletedShoeId")
		    public  ShoesDataModel  getshoesDataById(int seletedShoeId);
		  
		  
		  @Modifying
			 @Transactional
			 @Query("delete from ShoesDataModel where id=:id")
			 public int deleteProductwithId(@Param("id") int id);
		   
		  @Modifying
			 @Transactional
			 @Query("update ShoesDataModel   set categeory=:categeory, price=:price, name=:name, imagelink=:imagelink  where id=:id")
			 public int updateShoeProduct(@Param("categeory") int categeory, @Param("price") double price,
					 @Param("name") String name, @Param("imagelink") String imagelink,
					 @Param("id") int id);
			 
		  
}
