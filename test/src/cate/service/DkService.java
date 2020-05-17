package cate.service;

import java.util.List;

import cate.pogo.User;
import cate.pogo.population;
import cate.servlet.getPopulation;

public interface DkService {

	User LoginService(String name, String pwd);

	List<User> GetUser();

	population DataService(String year, String province);


	int SetService(String year, String province, String gai);

	population DataAllService(String year);

	User registerService(String name, String pwd);

	int regist(String name, String pwd);

	int deleService(String name);
	
}
