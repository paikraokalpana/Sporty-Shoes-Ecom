package com.sporty.shoes.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sporty.shoes.ShoesModel.OrderedShoeModel;



@Repository
public interface OrdersDao  extends CrudRepository<OrderedShoeModel, Integer>{
	
 
	
	
	 
	 
	 @Query("from OrderedShoeModel where categeory=:categeoryId and date=:date")
	 public List<OrderedShoeModel> getRequiredCompleteTransactionsData(int categeoryId,Date date);

}
