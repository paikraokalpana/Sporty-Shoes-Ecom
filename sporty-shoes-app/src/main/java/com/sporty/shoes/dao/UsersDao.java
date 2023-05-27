package com.sporty.shoes.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sporty.shoes.ShoesModel.UserInfoModel;
@Repository
public interface UsersDao extends CrudRepository<UserInfoModel, Integer> 

{
@Query("From UserInfoModel where firstname=:username and password=:password")
public UserInfoModel isValidAdminuser(String username, String password);
@Query("From UserInfoModel where rollid=:rollid")
public Iterable<UserInfoModel> getUserDatabyRollid(int rollid);

@Query("From UserInfoModel where password=:password")
public UserInfoModel isCorrectPassword_or_Not(String password);
@Modifying
@Transactional
@Query("Update UserInfoModel set password=:password where rollid=1 and firstname=:Kalpana_Paikrao")
public int updateAdminPassword(@Param("paswsword")String password, @Param("username")String username);




	
	
	
}
