package com.sporty.shoes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty.shoes.ShoesModel.UserInfoModel;
import com.sporty.shoes.dao.UsersDao;

@Service
public class UsersService {
@Autowired
private UsersDao userDao;
public UserInfoModel isValidAdminUserService(String username,String password) {
	UserInfoModel userInfoModel= userDao.isValidAdminuser(username, password);
	return userInfoModel;
}
public List<UserInfoModel> getUserDataService()
{
	List<UserInfoModel> usersList=(List<UserInfoModel>)userDao.getUserDatabyRollid(2);
	return usersList;
}
public List <UserInfoModel>isCorrectPassword_or_NotService(String password)
{
	List<UserInfoModel> usersList=(List<UserInfoModel>)userDao.isCorrectPassword_or_Not(password);
	return usersList;
	
}

public boolean updateAdminPasswordService(UserInfoModel userInfoModel, String currentPassword,String newspassword,String confirmpassword)
{
	int count=0;
	boolean isUpdated=false;
	
	if(count>0)
	{
		isUpdated=true;
		
	}
	return isUpdated;
	
}


public void insertUserDataService(String firstname, String lastname, String password, String confirmpassword, int rollid, Long mobileno, String email)
{
	UserInfoModel   u =new UserInfoModel(firstname, lastname, confirmpassword, rollid, mobileno, email);
	userDao.save(u);
}
}
