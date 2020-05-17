package cate.dao;

import java.util.List;


import cate.pogo.User;
import cate.pogo.population;
import cate.servlet.getPopulation;

public interface Userdao {

	User logindao(String name, String pwd);

	List<User> showUserAll();

	population showPopulation(String year, String province);

	int setPopulation(String year, String province, String gai);

	population DataAll(String year);

	User registerUser(String name, String pwd);

	int regist(String name, String pwd);

	int del(String name);

	
	
}
